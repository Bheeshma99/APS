abstract class E
{
	abstract void fun();
}
public class AnonymousInner {

	public static void main(String[] args) {
		
        E obj=new E()
        		{
        	void fun() {
        		System.out.println("welcome by annonymous inner class.");
        	}
        		};
        		obj.fun();
	}

}
