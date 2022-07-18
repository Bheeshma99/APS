package AccessSpecifiers;

public class D {

	public int a;
	void setvalue(int t)
	{
		a=t;
	}
	void getvalue()
	{
		System.out.println("value of a equal to "+ a + " which is accessible"
				+ " by D class because a is public member of class D.");
	}
}

class G extends D
{
	void setvalue(int t)
	{
		a=t;
	}
	void getvalue()
	{
		System.out.println("value of a equal to "+ a + " which is accessible"
				+ " by G class because a is public member of class D which is super class of G.");
	}
}