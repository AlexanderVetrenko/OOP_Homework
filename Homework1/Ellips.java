package Homework.Homework1;

public class Ellips extends Shape {
    Point a;
    double r1,r2;
    
    public Ellips(Point a, Point b, Point c,Colour clr) {
        this.a = a;
        r1 = Point.distance(a, b);
        r2 = Point.distance(a, c);
        cl = clr;
    }
    public double area(){
        return Math.PI*r1*r2;
    }

    @Override
    public String toString() {
        return String.format("Эллипс с полуосями %d и %d, цвета %s", Math.round(r1), Math.round(r2), cl);
    }
}
