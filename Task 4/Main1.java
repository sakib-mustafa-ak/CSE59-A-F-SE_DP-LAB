interface Shape {
    double calculateTotalArea();
}

class Rectangle implements Shape{
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

class Circle implements Shape{
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateTotalArea(){
        return Math.PI*(radius*radius);
    }
}

class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.calculateTotalArea();
        }
        return area;
    }
}


public class Main1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
            new Rectangle(5.0,  4.00),
            new Circle(3.0),
            new Rectangle(2.0,3.5)
        };

        AreaCalculator calculator = new AreaCalculator();

        double totalArea = calculator.calculateTotalArea(shapes);

        System.out.printf("Total Area of all shapes: %.2f\n", totalArea);

    }
}
