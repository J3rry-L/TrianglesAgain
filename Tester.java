public class Tester {
  public static void main (String[] args){
    Point A = new Point(1.1, 2.3);
    Point B = new Point(7.1, 10.3);
    Point C = new Point(7.1,2.3);
    Point D = new Point(A);
    Triangle rightTri = new Triangle(A,B,C);
    Triangle equTri = new Triangle(-1,0,0,Math.sqrt(3),1,0);
    Triangle isoTri = new Triangle(-1,0,0,2,1,0);
    Triangle line = new Triangle(0,1,5,13,10,25);
    Triangle testTri = new Triangle(0,1,5,13,10,25);
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
    System.out.println(rightTri.getPerimeter());
    System.out.println(equTri.getPerimeter());
    System.out.println(isoTri.getPerimeter());
    System.out.println(line.getPerimeter());
    System.out.println(rightTri.getArea());
    System.out.println(equTri.getArea());
    System.out.println(isoTri.getArea());
    System.out.println(line.getArea());
    System.out.println(rightTri.classify());
    System.out.println(equTri.classify());
    System.out.println(isoTri.classify());
    System.out.println(line.classify());
    System.out.println(rightTri);
    System.out.println(equTri);
    System.out.println(isoTri);
    System.out.println(line);
    testTri.setVertex(0,A);
    System.out.println(testTri);
    testTri.setVertex(1,B);
    System.out.println(testTri);
    testTri.setVertex(2,C);
    System.out.println(testTri);
  }
}

/*
Should print:
1.1
2.3
7.1
10.3
10.0
10.0
0.0
0.0
true
true
0.0
0.0
false
false
24.0
6.0
6.47213595499958
52.0
24.0
1.7320508075688779
2.0
0.0
scalene
equilateral
isosceles
isosceles
v1(1.1, 2.3) v2(7.1, 10.3) v3(7.1, 2.3)
v1(-1.0, 0.0) v2(0.0, 1.7320508075688772) v3(1.0, 0.0)
v1(-1.0, 0.0) v2(0.0, 2.0) v3(1.0, 0.0)
v1(0.0, 1.0) v2(5.0, 13.0) v3(10.0, 25.0)
v1(1.1, 2.3) v2(5.0, 13.0) v3(10.0, 25.0)
v1(1.1, 2.3) v2(7.1, 10.3) v3(10.0, 25.0)
v1(1.1, 2.3) v2(7.1, 10.3) v3(7.1, 2.3)
*/
