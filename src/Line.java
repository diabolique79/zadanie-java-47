import static java.lang.Math.*;

public class Line {

    private Point pointA;
    private Point pointB;


Line(Point pointA, Point pointB){

    this.pointA = pointA;
    this.pointB = pointB;
}


    public double getLength() {

        double wynik1 = pow(pointA.getCoordinateX() - pointB.getCoordinateX(), 2.0);
        double wynik2 = pow(pointA.getCoordinateY() - pointB.getCoordinateY(), 2.0);
        return abs((sqrt(wynik1 + wynik2)));
    }
}
