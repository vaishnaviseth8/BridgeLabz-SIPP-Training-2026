package Abstraction;

public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}
class circle extends Shape{
    double radius;

    circle(double radius){
        this.radius=radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius ;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;

    }

    public double getter(){
        return radius;
    }
//    public void setter(double radius){
//        this.radius=radius;
//    }

}

class rectangle extends Shape{
    int length;
    int width ;

    rectangle(int length,int width){
        this.length=length;
        this.width=width;

    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }
}

class triangle extends Shape{
    int base;
    int height;
    int a;
    int b;

    triangle(int base,int height,int a,int b){
        this.base=base;
        this.height=height;
        this.a=a;
        this.b=b;
    }

    @Override
    public double area() {
        return 0.5*base*height;
    }

    @Override
    public double perimeter() {
        return a+b+base ;
    }
}
class MainShape{
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new circle(5);
        shapes[1] = new rectangle(10, 6);
        shapes[2] = new triangle(8, 5, 6, 7);
        for (Shape s : shapes) {
            System.out.println("Area = " + s.area());
            System.out.println("Perimeter = " + s.perimeter());
            System.out.println();
        }
    }
}
