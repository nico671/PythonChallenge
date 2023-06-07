import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem3Solver {
  ArrayList<String> results = new ArrayList<String>();

  // takes an input string and runs it through a regex expression to find any
  // matches
  public String solver(String input) {
    Pattern p = Pattern.compile("[a-z][A-Z]{3}[a-z][A-Z]{3}[a-z]");
    Matcher m = p.matcher(input);
    while (m.find()) {
      results.add(m.group());
    }
    return turnCentersIntoNewString(results);
  }

  // iterates through the list of matches, finds the center letter and adds it to a string 
  //leaving you with a clean result
  public String turnCentersIntoNewString(List<String> input) {
    String parsedString = "";
    for (int i = 0; i < input.size(); i++) {
      for (int g = 0; g < input.get(i).length(); g++) {
        int mid = (int) Math.floor(input.get(i).length() / 2);
        if (g == mid) {
          parsedString += input.get(i).charAt(g);
        }
      }
    }

    return parsedString;
  }
}
