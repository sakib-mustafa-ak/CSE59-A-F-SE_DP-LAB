public interface Shape {
    double calculateTotalArea();
}

public class Rectangle implements Shape{
    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateTotalArea(){
        return length*width;
    }
}

public class Circle implements Shape{
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateTotalArea(){
        return Math.PI*(radius*radius);
    }
}

public class AreaCalculator {
    public double calculateTotalArea(Object[] shapes) {
        double area = 0;
        for (Object shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                area += r.length * r.width;
            } else if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                area += Math.PI * (c.radius * c.radius);
            }
        }
        return area;
    }
}


public class Main1 {
    public static void main(String[] args) {
        
    }
}

