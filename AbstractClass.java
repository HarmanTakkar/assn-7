abstract class Animals
{
abstract String color();
abstract String breed();
abstract String name();
abstract void eat();
void speak()
{
System.out.println("Animal speaks.");
}
}
class A extends Animals
{
String color()
{
return "White";
}
String breed()
{
return "Bulldog";
}
String name()
{
return "Leo";
}
void eat()
{
System.out.println("Animal eats.");
}
}
class AbstractClass 
{
public static void main(String args[])
{
A a=new A();
a.eat();
a.speak();
System.out.println("Animal's Color: "+a.color());
System.out.println("Animal's Breed: "+a.breed());
System.out.println("Animal's Name: "+a.name());
}
}
