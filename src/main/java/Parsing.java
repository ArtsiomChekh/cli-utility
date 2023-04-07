import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Parsing {

  private int interval;
  private String url;

  public void parseCommandLine(String[] args) throws ParseException {
    Options options = new Options();
    options.addOption("i", true, "Interval");
    options.addOption("u", true, "URL");

    CommandLineParser parser = new DefaultParser();
    CommandLine cmd = parser.parse(options, args);

    interval = Integer.parseInt(cmd.getOptionValue("i"));
    url = cmd.getOptionValue("u");
  }

  public int getInterval() {
    return interval;
  }

  public String getUrl() {
    return url;
  }
}

