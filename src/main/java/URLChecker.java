import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class URLChecker {

  public static String checkURL(String url) {
    try {
      HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();

      connection.setRequestMethod("GET");
      int responseCode = connection.getResponseCode();

      if (responseCode == 200) {
        return String.format("OK(%d)", responseCode);
      } else {
        return String.format("ERR(%d)", responseCode);
      }

    } catch (MalformedURLException e) {
      return "URL parsing error";
    } catch (IOException e) {
      return String.format("ERR(%s)", e.getMessage());
    }
  }
}