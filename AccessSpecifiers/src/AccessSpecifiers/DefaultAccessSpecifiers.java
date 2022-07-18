package AccessSpecifiers;

class B
{
int x,y;
void setvalue(int a)
{
	y=a;
}
void getvalue()
{
	System.out.println("value of y equal to "+ y + " which is accessible"
			+ " by B class because y is No modifiers member of class B.");
}
}

public class DefaultAccessSpecifiers {

	public static void main(String[] args) {
		B obj=new B();
		obj.setvalue(13);
		obj.getvalue();
		
		B obj2=new B();
		obj2.x=19;
		System.out.println("value of x equal to "+ obj2.x + " which is  directly accessible"
				+ " by DefaultAccessSpecifiers class because X is No modifiers member of class B which"
				+ " is present in same package.");
        
	}

}
