import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckInRoundTest {
  @ParameterizedTest
  @CsvSource({
      "'0,0', 0, Point on the circle",
      "'1,1', 1, Point ley outside of the circle",
      "'0,0', 1, Point ley in the circle",
      "'0,1', 1, Point on the circle",
      "'1, 0', 1, Point on the circle",
      "'1, 1', 1, Point ley outside of the circle",
      "'-1, 1', 1, Point ley outside of the circle",
      "'-1,-1', 1, Point ley outside of the circle",
      "'1,-1', 1, Point ley outside of the circle",
      "'1, 1', 2, Point ley in the circle",
      "'-1, 1', 2, Point ley in the circle",
      "'-1,-1', 2, Point ley in the circle",
      "'1,-1', 2, Point ley in the circle",
  })
  public void checkInRound(String coordinates, int radius, String expected) {
    Point point = Point.parse(coordinates);
    String actual = Main.checkInRound(point, radius);
    assertEquals(expected, actual);
  }
}
