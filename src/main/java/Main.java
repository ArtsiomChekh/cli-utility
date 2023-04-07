import org.apache.commons.cli.ParseException;

public class Main {

  public static void main(String[] args) throws ParseException, InterruptedException {
    Parsing parser = new Parsing();
    parser.parseCommandLine(args);

    int interval = Integer.parseInt(String.valueOf(parser.getInterval()));
    String url = parser.getUrl();

    while (true) {
      String result = URLChecker.checkURL(url);
      if (result.equals("URL parsing error")) {
        System.out.println(result);
        break;
      }
      System.out.println(String.format("Checking '%s'. Result: %s", url, result));
      Thread.sleep(interval * 1000);
    }
  }

}
