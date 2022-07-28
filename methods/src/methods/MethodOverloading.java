package methods;
class D {
	int a,b,c;
	void showdata(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("a="+a+" b="+b);
	}
	void showdata(int z)
	{
		c=z;
		System.out.println("c="+c);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		
		D obj=new D();
		obj.showdata(5, 9);
		obj.showdata(18);
	
	}

}
