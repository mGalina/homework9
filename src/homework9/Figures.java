package homework9;

public class Figures {
    private String name;
    private double square;
    private double perimeter;

    public Figures() {
    }

    public Figures(String name, double square, double perimeter) {
        this.name = name;
        this.square = square;
        this.perimeter = perimeter;
    }

    public Figures(double square, double perimeter) {
        this.square = square;
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Figures{" +
                "name='" + name + '\'' +
                ", square=" + square +
                ", perimeter=" + perimeter +
                '}';
    }
}
