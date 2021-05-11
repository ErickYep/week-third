package day12;

public class Task6 {
    public static void main(String[] args) {
//        first function returns area of circle
//        seccond function overload returns area of square
//        third function overload returns area of rectangle
    }
    static double square(int radius){
        return Math.PI*Math.pow(radius,2);
    }
    static double square(float side){
        return side*side;
    }
    static double square(double a,double b){
        return a*b;
    }
}
