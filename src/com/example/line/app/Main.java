package com.example.line.app;

import java.util.Locale;
import java.util.Scanner;
import com.example.line.model.*;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj współrzędne pierwszego punktu A. X = ");
        scanner.useLocale(Locale.US);
        double coordinateXA = scanner.nextDouble();
        System.out.print("Y = ");
        double coordinateYA = scanner.nextDouble();

        System.out.print("Wprowadź współrzędne drugiego punktu B. X = ");
        double coordinateXB = scanner.nextDouble();
        System.out.print("Y = ");
        double coordinateYB = scanner.nextDouble();

        Point point = new Point(coordinateXA, coordinateYA);
        Point point1 = new Point(coordinateXB, coordinateYB);

        Line line = new Line(point, point1);
        System.out.printf("Długość pierwszego odcinka AB wynosi: %.2f \n", line.getLength());

        System.out.print("Wprowadź współrzedne drugiego odcinka CD. Punkt C. X = ");
        double coordinateXC = scanner.nextDouble();
        System.out.print("Y = ");
        double coordinateYC = scanner.nextDouble();
        System.out.print("Wprowadź współrzedne drugiego odcinka CD. Punkt D. X = ");
        double coordinateXD = scanner.nextDouble();
        System.out.print("Y = ");
        double coordinateYD = scanner.nextDouble();
        Point point2 = new Point(coordinateXC, coordinateYC);
        Point point3 = new Point(coordinateXD, coordinateYD);
        Line line1 = new Line(point2, point3);
        System.out.printf("Długość odcinka CD wynosi: %.2f \n", line1.getLength());

        CompareLines compareLines = new CompareLines();
        compareLines.compareLine(line, line1);
        Line longer = compareLines.compareLine(line, line1);
        System.out.printf("Dłuższy odcinek wynosi: %.2f", longer.getLength());


    }
}
