package constructors.java;

public class Shapes {
float radius;
int length;
int breadth;
int side;

Shapes() {  
//default constructor
}
 
Shapes(float r) {
radius = r;
}

Shapes(int s) {
side = s;
}

     Shapes(int l,int b ) {
length = l;
breadth = b;
}


public float areaofCircle() {
return 3.14f * radius * radius;

}
public int areaofSquare() {
return side * side;

}
public int areaofRectangle() {
return length * breadth;

}




public int area(int height, int base) {
return (height * base)/2;

}
    public  float area(float diagonal1, float diagonal2) {      //method overload
return ( diagonal1 * diagonal2)/2;

}

public static void main(String[] args) {
Shapes circle = new Shapes(5.64f);
Shapes square = new Shapes(76);
Shapes rectangle= new Shapes(10,20);
Shapes traingle = new Shapes();
Shapes rhombus = new Shapes();
System.out.println("area of cicle:"+circle.areaofCircle());
System.out.println("area of square:"+square.areaofSquare());
System.out.println("area of rectangle:"+rectangle.areaofRectangle());
System.out.println("area of traingle:"+traingle.area(4, 5));
System.out.println("area of rhombus:"+rhombus.area(45.6f,67.5f));



}
}
