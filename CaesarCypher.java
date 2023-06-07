// class for deciphering a Caeser Cypher
// author: Nico Carbone
// date: 9/2/22

public class CaesarCypher {

  private String deciphered = "";
  private String alphabet = "abcdefghijklmnopqrstuvwxyz";


  // should shift over each letter in a string given you know how much you want to shift each letter over
  //should return the decoded string, and takes in an input string as well as an integer which is how much you want to shift the letter over
  public String decipher(String input, int steps) {
    for (int i = 0; i < input.length(); i++) {
      for (int g = 0; g < alphabet.length(); g++) {

        if (input.charAt(i) == alphabet.charAt(g)) {
          if (g >= 26 - steps) {
            deciphered += alphabet.charAt(g - (26 - steps));
          } else {
            deciphered += alphabet.charAt(g + steps);
          }

        }
      }
    }
    System.out.print(deciphered);
    return deciphered;
  }
}