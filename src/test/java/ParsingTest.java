import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.cli.ParseException;
import org.junit.jupiter.api.Test;

class ParsingTest {

  @Test
  public void testParseCommandLine() throws ParseException {
    Parsing parser = new Parsing();
    String[] args = {"-i", "2", "-u", "http://example.com/"};
    parser.parseCommandLine(args);

    assertEquals(parser.getInterval(), 2);
    assertEquals(parser.getUrl(), "http://example.com/");
  }

  @Test
  public void testGetInterval() throws ParseException {
    Parsing parser = new Parsing();
    String[] args = {"-i", "3", "-u", "http://example.com/"};
    parser.parseCommandLine(args);

    assertEquals(parser.getInterval(), 3);
  }

  @Test
  public void getUrl() throws ParseException {
    Parsing parser = new Parsing();
    String[] args = {"-i", "2", "-u", "http://example.com/"};
    parser.parseCommandLine(args);

    assertEquals(parser.getUrl(), "http://example.com/");
  }

}