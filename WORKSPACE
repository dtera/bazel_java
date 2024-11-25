# Copyright 2024 dtera, Ltd.
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

workspace(name = "bazel_java")

#### for algo ####
load("//bazel:repositories.bzl", "demo_deps")
demo_deps()

#### for heu ####
load("@com_dtera_heu//third_party/bazel_cpp:repositories.bzl", "heu_cpp_deps")
heu_cpp_deps()

#### for yacl ####
load("@yacl//bazel:repositories.bzl", "yacl_deps")
yacl_deps()

#### for python ####
load("@rules_python//python:repositories.bzl", "py_repositories")
py_repositories()

load("@pybind11_bazel//:python_configure.bzl", "python_configure")
python_configure(
    name = "local_config_python",
    python_version = "3",
)

#### for cpp ####
load(
    "@rules_foreign_cc//foreign_cc:repositories.bzl",
    "rules_foreign_cc_dependencies",
)
rules_foreign_cc_dependencies(
    register_built_tools = False,
    register_default_tools = False,
    register_preinstalled_tools = True,
)

load("@bazel_features//:deps.bzl", "bazel_features_deps")
bazel_features_deps()

#### for apple_support ####
load(
    "@build_bazel_apple_support//lib:repositories.bzl",
    "apple_support_dependencies",
)
apple_support_dependencies()
