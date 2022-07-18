package AccessSpecifiers;
class A {

	private int x;
	void setvalue(int a)
	{
		x=a;
	}
	void getvalue()
	{
		System.out.println("value of x equal to "+ x + " which is not directly accessible"
				+ " by PrivateAccessSpecifiers class because X is private member of class A.");
	}
}
public class PrivateAccessSpecifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.setvalue(15);
		obj.getvalue();

	}

}
