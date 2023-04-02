
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckQuarterTest {
  @ParameterizedTest
  @CsvSource({
      "'0,0', Point on beginning of both asis",
      "'0,1', Point on axis 'Y'",
      "'1,0', Point on axis 'X'",
      "'1,1', 1",
      "'-1, 2', 2",
      "'-1,-1', 3",
      "'1,-1', 4",

  })
  public void checkQuarter(String coordinates, String expected) {
    Point point = Point.parse(coordinates);
    String actual = Main.checkQuarter(point);
    assertEquals(expected, actual);
  }
}