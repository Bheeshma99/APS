class B
{
	private String str="its member inner class example.";
		class Memberinner
		{
			void getvalue()
			{
				System.out.println(str);
			}
		}
}
public class MemberInner {
	public static void main(String args[])
	{
		B obj=new B();
		B.Memberinner innerobj=obj.new Memberinner();
		innerobj.getvalue();
	}

}
