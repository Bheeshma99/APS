
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***************** Implicit type conversion  *****************************/
		char x='A';
		float y=x;
		System.out.println("Implicit type conversion of "+x+" from char to float equal to " +y);
		/***************** Explicit type conversion  *****************************/
		float a=14.5f;
		int b=(int)a;
		System.out.println("Explicit type conversion of "+a+ " from float to int equal to " +b);
	}

}
