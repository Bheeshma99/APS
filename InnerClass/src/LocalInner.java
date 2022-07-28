class A
{
	private String str="its local inner class example.";
	void fun() {
		class Localinner
		{
			void getvalue()
			{
				System.out.println(str);
			}
		}
		Localinner obj1=new Localinner();
		obj1.getvalue();
	}
}
public class LocalInner {
	public static void main(String args[])
	{
		A obj=new A();
		obj.fun();
	}
}
