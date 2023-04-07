import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class URLCheckerTest {

  @Test
  public void testCheckURLOk() {
    String url = "http://example.com/";
    String result = URLChecker.checkURL(url);

    assertEquals(result, "OK(200)");
  }

  @Test
  public void testCheckURLErr500() {
    String url = "http://httpstat.us/500";
    String result = URLChecker.checkURL(url);

    assertEquals(result, "ERR(500)");
  }

  @Test
  public void testCheckURLErr503() {
    String url = "http://httpstat.us/503";
    String result = URLChecker.checkURL(url);

    assertEquals(result, "ERR(503)");
  }


}
