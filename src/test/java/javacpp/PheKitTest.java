package javacpp;

import javacpp.heu.Ciphertext;
import javacpp.heu.PheKit;
import javacpp.heu.SchemaType;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PheKitTest extends TestCase {
  /**
   * Create the test case
   *
   * @param testName name of the test case
   */
  public PheKitTest(String testName) {
    super(testName);
  }

  /**
   * @return the suite of tests being tested
   */
  @SuppressWarnings({"TextBlockMigration"})
  public static Test suite() {
    return new TestSuite(PheKitTest.class);
  }

  /**
   * Rigourous Test :-)
   */
  public void test1() {
    try (PheKit pheKit = new PheKit(SchemaType.OU)) {
      Ciphertext ct1 = pheKit.encrypt(2);
      Ciphertext ct2 = pheKit.encrypt(3);
      Ciphertext addRes = pheKit.add(ct1, ct2);
      System.out.printf("add: %f\n", pheKit.decrypt(addRes));
      pheKit.addInplace(addRes, ct2);
      System.out.printf("addInplace: %f\n", pheKit.decrypt(addRes));

    }
  }
}
