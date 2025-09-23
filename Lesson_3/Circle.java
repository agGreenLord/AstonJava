package Lesson_3;

public class Circle implements Figure {
    private final double radius;
    private final String background;
    private final String border;
    public Circle( double radius, String background, String border) {
        this.radius = radius;
        this.background = background;
        this.border = border;
    }
    @Override
    public double area() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
    
    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
    public String getBackground() {
        return this.background;
    }
    public String getBorder() {
        return this.border;
    }
}