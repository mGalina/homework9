package homework9;

public class Circle extends Figures {
    private double radius;
    private double diameter;

    public Circle() {
    }

    public Circle(double square, double perimeter) {
        super(square, perimeter);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
