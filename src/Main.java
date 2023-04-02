import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Задача 1*
//    По введённым координатам точки определите, в какой координатной четверти
//    (или на какой оси) она находится.
//
//    Четверти нумеруются следующим образом:
//
//        y
//        ^
//    II  |  I
//    ------------> x
//    III |  IV
//        |

//Задача 2** (не обязательно)
//Получите от пользователя радиус окружности.
//
//По введённым координатам точки определите, попадает ли она внутрь, на границу или вне окружности
// с указанным радиусом и центром в точке O (0, 0).

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Point point = Point.read(br);
    String quarter = checkQuarter(point);
    System.out.println(quarter);
  }

  public static String checkRound(Point point) {
    return "0";
  }
  public static String checkQuarter(Point point) {
    int x = point.getX();
    int y = point.getY();

    if (x > 0 && y > 0) {
      return "1";
    } else if (x < 0 && y > 0) {
      return "2";
    } else if (x < 0 && y < 0) {
      return "3";
    }  else if (x > 0 && y < 0) {
      return "4";
    } else if (x == 0 && y == 0) {
      return "Point on beginning of both asis";
    } else if (x == 0) {
      return "Point on axis 'Y'";
    } else {
      return "Point on axis 'X'";
    }
  }


}
