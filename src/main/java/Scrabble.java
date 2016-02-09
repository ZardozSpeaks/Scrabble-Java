import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;
import java.util.ArrayList;

public class Scrabble {
  public static void main(String[] args) {

  }
  public static Integer scrabbleScore(String userInput) {
    Integer score = 0;
    HashMap<Character, Integer> mapOfChars = new HashMap<Character, Integer>();
    mapOfChars.put('a', 1);
    mapOfChars.put('e', 1);
    mapOfChars.put('i', 1);
    mapOfChars.put('o', 1);
    mapOfChars.put('u', 1);
    mapOfChars.put('l', 1);
    mapOfChars.put('n', 1);
    mapOfChars.put('r', 1);
    mapOfChars.put('s', 1);
    mapOfChars.put('t', 1);
    mapOfChars.put('d', 2);
    mapOfChars.put('g', 2);
    mapOfChars.put('b', 3);
    mapOfChars.put('c', 3);
    mapOfChars.put('m', 3);
    mapOfChars.put('p', 3);
    mapOfChars.put('f', 4);
    mapOfChars.put('h', 4);
    mapOfChars.put('v', 4);
    mapOfChars.put('w', 4);
    mapOfChars.put('y', 4);
    mapOfChars.put('k', 5);
    mapOfChars.put('j', 8);
    mapOfChars.put('x', 8);
    mapOfChars.put('q', 10);
    mapOfChars.put('z', 10);

    userInput = userInput.toLowerCase();
    char[] userInputArr = userInput.toCharArray();

    for (Character charItem : userInputArr) {
      score += mapOfChars.get(charItem);
    }
  return score;
  }
}
