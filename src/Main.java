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
    System.out.print("Input radius: ");
    int radius = Integer.parseInt(br.readLine());
    String quarter = checkQuarter(point);
    System.out.println("Point is in the Quarter: " + quarter);
    String inCircle = checkInRound(point, radius);
    System.out.println(inCircle);
  }

  public static String checkInRound(Point point, int radius) {
    int x = point.getX();
    int y = point.getY();
    int x2PlusY2 = x * x + y * y;
    if(x2PlusY2 < radius * radius) {
      return "Point ley in the circle";
    } else if (x2PlusY2 > radius * radius) {
      return "Point ley outside of the circle";
    }
    return "Point on the circle";
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
