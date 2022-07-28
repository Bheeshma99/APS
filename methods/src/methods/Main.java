package methods;
class A
{
	int a=5;
	float b=8.9f;
	
	void showdata()
	{
		System.out.println("it is void return type method.");
	}

	int return_int_data()
	{
		return a;
	}
	
	float return_float_data()
	{
		return b;
	}
}


public class Main {

	public static void main(String[] args) {
		A obj=new A();
		obj.showdata();
		System.out.println(obj.return_int_data()+" has returned by int return type method.");
		System.out.println(obj.return_float_data()+" has returned by float return type method.");
	}

}
