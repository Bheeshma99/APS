package constructor;
class A
{
	int age;
	String name;
	A()
	{
		name="ram";
		age=25;
	}
}
class B
{
	int a,b;
	
	B(int x,int y)
	{
		a=x;
		b=y;
	}
}
class C
{
	int p;
	String str;
}
public class Main {

	public static void main(String[] args) {
		A obj1=new A();
		System.out.println("Name="+obj1.name+"  age="+obj1.age+" which are assigned by no argument constructor A().");
		B obj=new B(2,3);
		System.out.println("a="+obj.a+"  b="+obj.b+" which are assigned by parameterized constructor B(int,int).");
		C obj2=new C();
		System.out.println("p="+obj2.p+"  str="+obj2.str+" which are assigned by default constructor.");
	}

}
