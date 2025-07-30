package javaassignment;




class Shape {
  
    public void area(int side) {
        int area = side * side;
        System.out.println("Area of square: " + area);
    }

   
    public void area(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }

   
    public void perimeter(int side) {
        int peri = 4 * side;
        System.out.println("Perimeter of square: " + peri);
    }

   
    public void perimeter(int length, int breadth) {
        int peri = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle: " + peri);
    }
}


public class question14{
    public static void main(String[] args) {
        Shape shape = new Shape();

      
        shape.area(5);            
        shape.perimeter(5);

   
        shape.area(4, 6);          
        shape.perimeter(4, 6);
    }
}

/*
 * Area of square: 25
Perimeter of square: 20
Area of rectangle: 24
Perimeter of rectangle: 20

*/
