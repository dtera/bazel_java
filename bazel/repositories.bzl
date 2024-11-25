# Copyright 2024 dterazhao, Ltd.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#   http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository")
load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
load("@bazel_tools//tools/build_defs/repo:utils.bzl", "maybe")

def demo_deps():
    _rules_cc()
    _build_bazel_apple_support()
    _com_github_libtom_libtommath()
    _heu()

def _rules_cc():
    maybe(
        http_archive,
        name = "rules_cc",
        sha256 = "906e89286acc67c20819c3c88b3283de0d5868afda33635d70acae0de9777bb7",
        strip_prefix = "rules_cc-0.0.14",
        url = "https://github.com/bazelbuild/rules_cc/releases/download/0.0.14/rules_cc-0.0.14.tar.gz",
    )

def _build_bazel_apple_support():
    maybe(
        http_archive,
        name = "build_bazel_apple_support",
        sha256 = "b53f6491e742549f13866628ddffcc75d1f3b2d6987dc4f14a16b242113c890b",
        url = "https://github.com/bazelbuild/apple_support/releases/download/1.17.1/apple_support.1.17.1.tar.gz",
    )

def _com_github_libtom_libtommath():
    maybe(
        http_archive,
        name = "com_github_libtom_libtommath",
        sha256 = "6c7a6732daeefda3826e6c5321d60d820655fb9f3f1a1f59049b0e7cab3c9079",
        type = "tar.gz",
        strip_prefix = "libtommath-2e03dfd64dd7ae6bf0d43b665036da82e87f3fb2",
        patch_args = ["-p1"],
        patches = [
            "//bazel:patches/libtommath.patch",
        ],
        urls = [
            "https://github.com/libtom/libtommath/archive/2e03dfd64dd7ae6bf0d43b665036da82e87f3fb2.tar.gz",
        ],
        build_file = "//bazel:libtommath.BUILD",
    )

def _heu():
    git_repository(
        name = "com_dtera_heu",
        commit = "fd9160be83b1bb17f2ebdad975688d3bbfe3e223",
        remote = "https://github.com/dtera/heu.git",
    )