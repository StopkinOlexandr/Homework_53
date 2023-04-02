import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Задача 1*
//    По введённым координатам точки определите, в какой координатной четверти (или на какой оси) она находится.
//
//    Четверти нумеруются следующим образом:
//
//        y
//        ^
//    II  |  I
//    ------------> x
//    III |  IV
//        |
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Point point = Point.read(br);
//    String quarter = checkQuarter(point);
  }

}
