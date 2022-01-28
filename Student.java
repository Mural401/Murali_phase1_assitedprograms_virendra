package constructors.java;

public class Student {
String name;
int age;
char section;
char gender;
int sub1;
int sub2;
int sub3;
public Student(String n,int a,char s,char g,int s1,int s2,int s3) {
name = n;
age = a;
section = s;
gender = g;
sub1 = s1;
sub2 = s2;
sub3 = s3;

}
public int totalmarks() {
return sub1+sub2+sub3;
}
public float percentage() {
return (totalmarks()*100);
}
void display() {
System.out.println(name+age+section+gender+sub1+sub2+sub3);

}

public static void main(String[] args) {
Student st1 = new Student(" Balu ",20,'A','F' ,45 ,67 ,88);
Student st2 = new Student(" Murali",21,'B' ,'F' ,0 , 68 ,58);
Student st3 = new Student("Krishna ",23,'C','F',0 ,  35,87);
st1.display();
st2.display();
st3.display();


}

}

