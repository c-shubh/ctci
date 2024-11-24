import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Timeout(value = 1000)
public class Ch1Q1_IsUnique {
  public boolean isUnique(String str) {
    // TODO: Implement your solution here
    return false;
  }

  @Test
  public void testEmpty() {
    assertTrue(isUnique(""), "Empty string should be considered unique");
  }

  @Test
  public void testUnique() {
    assertTrue(isUnique("abcdefg"), "String with all unique chars should return true");
  }

  @Test
  public void testDuplicate() {
    assertFalse(isUnique("hello"), "String with duplicates should return false");
  }

  @Test
  public void testSingleChar() {
    assertTrue(isUnique("a"), "Single character should be unique");
  }

  @Test
  public void testMaxInputSize() {
    // Generate string of length 10^5 with unique characters (repeating after ASCII
    // range)
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 100000; i++) {
      sb.append((char) (i % 128));
    }
    assertFalse(isUnique(sb.toString()),
        "Should handle maximum input size efficiently");
  }

  @Test
  public void testFullASCII() {
    // Generate string with all ASCII characters
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 128; i++) {
      sb.append((char) i);
    }
    assertTrue(isUnique(sb.toString()),
        "Should handle all ASCII characters");
  }
}