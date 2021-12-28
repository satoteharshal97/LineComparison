package com.example.lineComparison;
import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Taking values of both points from user
        System.out.println("Enter x-cordinate of first point: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter y-cordinate of first point: ");
        double y1 = sc.nextDouble();
        System.out.println("Enter x-cordinate of second point: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter y-cordinate of second point: ");
        double y2 = sc.nextDouble();
        //Calulating length of line
        double lenghtOfline1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2- y1), 2));
        System.out.println();
        //Co-ordinates for second line
        System.out.println("Enter Co-ordinates for second line");
        System.out.println("Enter x-cordinate of first point: ");
        double px1 = sc.nextDouble();
        System.out.println("Enter y-cordinate of first point: ");
        double py1 = sc.nextDouble();
        System.out.println("Enter x-cordinate of second point: ");
        double px2 = sc.nextDouble();
        System.out.println("Enter y-cordinate of second point: ");
        double py2 = sc.nextDouble();
        sc.close();

        double lenghtOfLine2 = Math.sqrt(Math.pow((px2 - px1), 2) + Math.pow((py2 - py1), 2));

        Double x =  lenghtOfline1;
        Double y =  lenghtOfLine2;

        int retResult = x.compareTo(y);
        if(retResult > 0) {
            System.out.println("Line one is greater than Line two");
        } else if(retResult< 0) {
            System.out.println("Line one is less than Line two");
        } else {
            System.out.println("Line one is equal to Line two");
        }

    }
}
