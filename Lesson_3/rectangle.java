package Lesson_3;

class Rectangle implements Figure {
    private final double a;
    private final double b;
    private final String background;
    private final String  border;
    public Rectangle(double a, double b, String background, String border) {
        this.a = a;
        this.b = b;
        this.background = background;
        this.border = border;
    }

    @Override
    public double area() {
        return this.a *  this.b;
    }
    @Override
    public double perimeter() {
        return 2 * (this.a + this.b);
    }
    public String getBackground() {
        return this.background;
    }
    public String getBorder() {
        return this.border;
    }



    
}
