class S
{
	static class Sinner
	{
		void hello()
		{
			System.out.println("welcome it is static inner class.");
		}
	}
}
public class Staticinner {
	public static void main(String[] args)
	{
		S.Sinner obj=new S.Sinner();
		obj.hello();
	}
}
