package inheritance.java;

class product1{
int id=78;
String name="Amul";
void display()
{
System.out.println(id+" "+name);
}
}
class A extends product1{
int count=50;
String category="butter";
void categories1()
{
System.out.println(count+" "+category);
}

}
class B extends product1{
int count=90;
String category="milk";
void categories2()
{
System.out.println(count+" "+category);
}
}
class C extends product1{
int count=56;
String category="choco";
void categories3()
{
System.out.println(count+" "+category);
}

}
class subA extends A
{
int price=30;
void products1()
{
System.out.println("Total Price="+count*price);
System.out.println("id "+id+" "+"name of the product "+name+" "+"category "+category );
}
}
class subB extends B
{
int price=10;
void products2()
{
System.out.println("Total Price="+count*price);
System.out.println("id "+id+" "+"name of the product "+name+" "+"category  "+ category);
}
}
public class product{
public static void main(String[] args)
{
subA A1=new subA();
A1.products1();
A1.categories1();
A1.display();
subB B1=new subB();
B1.products2();
B1.categories2();
B1.display();
}
}

