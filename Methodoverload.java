package constructors.java;

public class Methodoverload {
public int calculate(int num1, int num2)
{
System.out.println("Sum of two numbers:" +(num1+num2));
return num1 + num2;
}
public int calculate(double r)
{
System.out.println("Area of circle:" +(3.14*r*r));
return (int) (3.14*r*r);
}
public int calculate(int l, float b)
{
System.out.println("Area of rectangle:" + (l*b));
return (int) (l*b);
}

public static void main(String[] args) {

Methodoverload ob = new Methodoverload();
ob.calculate(10,20);
ob.calculate(5);
ob.calculate(3,4f);
}

}