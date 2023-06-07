// Nico Carbone
// 9/9/22
// Made to solve python challenge level 4

import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class Level4 {

    // solves the level by parsing the text presented on the website to get to the next page and loops this functionality
    public void solve(String inputUrl) throws Exception {
        URL url = new URL(inputUrl);


        BufferedReader in = new BufferedReader(
        new InputStreamReader(url.openStream()));
        String inputLine;
        StringBuilder a = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            a.append(inputLine);
        }
           
        
        Pattern p = Pattern.compile("[0-9]+$");
        Matcher m = p.matcher(a.toString());
        Matcher o = p.matcher(inputUrl);

        while (m.find() && o.find()) {
            if (isInteger(m.group(0)) == false) {}
            else if (Integer.parseInt(o.group(0)) == 82682) {
                System.out.print(a.toString());
                int number = Integer.parseInt(m.group(0).substring(m.group(0).length() - 5));
                System.out.print("number " + number);
                String newUrl = "http://www.pythonchallenge.com/pc/def/linkedlist.php?nothing=" + number;
                solve(newUrl);
            }
            else if (Integer.parseInt(m.group(0)) == 16044) {
                int halfed = Integer.parseInt(m.group(0)) / 2;
                String halfedString = Integer.toString(halfed);
                String newUrl = "http://www.pythonchallenge.com/pc/def/linkedlist.php?nothing=" + halfedString;
                solve(newUrl);
            }
            else {
                String newUrl = "http://www.pythonchallenge.com/pc/def/linkedlist.php?nothing=" + m.group(0);
                solve(newUrl);
            }
        }

        in.close();
    }
    
    // helper function to check whether a string can be converted to an int, essentially checks whether the function should exit
    public boolean isInteger( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }
}
