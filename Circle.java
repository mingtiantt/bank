package tast2;

public class  Circle {
  public double radius;
  public final double pi=3.14;
    public  Circle() {};
    public Circle(double newRadius) {
        radius = newRadius;
    };
    public double getArea() {
        return pi * radius * radius;
//我草你的
    }


}

