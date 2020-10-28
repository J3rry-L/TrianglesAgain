public class Tester {
  public static void main (String[] args){
    Point A = new Point(1.1, 2.3);
    Point B = new Point(7.1, 10.3);
    System.out.println(A.getX());
    System.out.println(A.getY());
    System.out.println(B.getX());
    System.out.println(B.getY());
    System.out.println(A.distanceTo(B));
    System.out.println(B.distanceTo(A));
    System.out.println(A.distanceTo(A));
    System.out.println(B.distanceTo(B));
  }
}
