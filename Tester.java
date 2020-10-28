public class Tester {
  public static void main (String[] args){
    Point A = new Point(1.1, 2.3);
    Point B = new Point(7.1, 10.3);
    Point C = new Point(7.1,2.3);
    Point D = new Point(A);
    Triangle rightTri1 = new Triangle(A,B,C);
    System.out.println(A.getX());
    System.out.println(A.getY());
    System.out.println(B.getX());
    System.out.println(B.getY());
    System.out.println(A.distanceTo(B));
    System.out.println(B.distanceTo(A));
    System.out.println(A.distanceTo(A));
    System.out.println(B.distanceTo(B));
    System.out.println(D.equals(A));
    System.out.println(A.equals(D));
    System.out.println(D.distanceTo(A));
    System.out.println(A.distanceTo(D));
    System.out.println(A.equals(B));
    System.out.println(B.equals(A));

  }
}
