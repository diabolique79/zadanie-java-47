public class Point {

    private double coordinateX;
    private double coordinateY;


    Point(double coordinateX,double coordinateY){

        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;

    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

}

