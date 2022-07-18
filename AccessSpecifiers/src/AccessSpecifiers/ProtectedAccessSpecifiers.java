package AccessSpecifiers;
class P
{
	protected int p;
	void setvalue(int t)
	{
		p=t;
	}
	void getvalue()
	{
		System.out.println("value of p equal to "+ p + " which is accessible"
				+ " by P class because p is protected member of class P.");
	}
}
class Q extends P
{
	void setvalue(int a)
	{
		p=a;
	}
	void getvalue()
	{
		System.out.println("value of p equal to "+ p + " which is accessible"
				+ " by Q class because p is protected member of class P which is super class of Q.");
	}
}

public class ProtectedAccessSpecifiers {

	public static void main(String[] args) {

		P obj2=new P();
		obj2.setvalue(105);
		obj2.getvalue();
		
		
		Q obj=new Q();
		obj.setvalue(104);
		obj.getvalue();

		
		P obj3=new P();
    	obj3.p=106;
		System.out.println("value of p equal to "+ obj3.p + " which is accessible"
				+ " by ProtectedAccessSpecifiers class because p is protected member of class P which is present in same package.");
        

	}

}
