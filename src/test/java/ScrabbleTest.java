import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrabbleTest {

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_1() {
    Scrabble scrabble = new Scrabble();
    Integer score = 1;
    assertEquals(score, scrabble.scrabbleScore("a"));
  }
}
