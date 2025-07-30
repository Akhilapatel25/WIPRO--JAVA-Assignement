package javaassignment;


public class question22 {
    public static void main(String[] args) {
        Line line = new Line();
        line.drawingColor("Black");
        line.thickness(2);
        System.out.println();

        Circle circle = new Circle();
        circle.drawingColor("Red");
        circle.thickness(3);
        circle.fillingColor("Blue");
        circle.size(10);
        System.out.println();

        Square square = new Square();
        square.drawingColor("Green");
        square.thickness(4);
        square.fillingColor("Yellow");
        square.size(8);
    }
}

// Interface: Drawable
interface Drawable {
    void drawingColor(String color);
    void thickness(int t);
}

// Interface: Fillable
interface Fillable {
    void fillingColor(String color);
    void size(int s);
}

// Class: Line - implements Drawable only
class Line implements Drawable {
    @Override
    public void drawingColor(String color) {
        System.out.println("Line Drawing Color: " + color);
    }

    @Override
    public void thickness(int t) {
        System.out.println("Line Thickness: " + t);
    }
}

// Class: Circle - implements Drawable & Fillable
class Circle implements Drawable, Fillable {
    @Override
    public void drawingColor(String color) {
        System.out.println("Circle Drawing Color: " + color);
    }

    @Override
    public void thickness(int t) {
        System.out.println("Circle Thickness: " + t);
    }

    @Override
    public void fillingColor(String color) {
        System.out.println("Circle Filling Color: " + color);
    }

    @Override
    public void size(int s) {
        System.out.println("Circle Size: " + s);
    }
}

// Class: Square - implements Drawable & Fillable
class Square implements Drawable, Fillable {
    @Override
    public void drawingColor(String color) {
        System.out.println("Square Drawing Color: " + color);
    }

    @Override
    public void thickness(int t) {
        System.out.println("Square Thickness: " + t);
    }

    @Override
    public void fillingColor(String color) {
        System.out.println("Square Filling Color: " + color);
    }

    @Override
    public void size(int s) {
        System.out.println("Square Size: " + s);
    }
}

/*
 * Line Drawing Color: Black
Line Thickness: 2

Circle Drawing Color: Red
Circle Thickness: 3
Circle Filling Color: Blue
Circle Size: 10

Square Drawing Color: Green
Square Thickness: 4
Square Filling Color: Yellow
Square Size: 8
//*/
