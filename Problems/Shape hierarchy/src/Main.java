abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    double getArea() {
        var s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

class Rectangle extends Shape {
    private double b;
    private double h;

    public Rectangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    double getPerimeter() {
        return b * 2 + h * 2;
    }

    @Override
    double getArea() {
        return b * h;
    }
}

class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(r, 2);
    }
}