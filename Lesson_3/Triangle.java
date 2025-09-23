package Lesson_3;


public class Triangle implements Figure {
    private final double a;
    private final double b;
    private final double c;
    private final String background;
    private final String border;
    public Triangle(double a, double b, double c, String background, String border) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.background = background;
        this.border = border;
    }
    
    @Override
    public double perimeter() {
        return (this.a + this.b + this.c);
    }

    @Override
    public double area() {
        double s = perimeter() / 2.0; // полупериметр
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public String getBackground() {
        return this.background;
    }
    public String getBorder() {
        return this.border;
    }
}