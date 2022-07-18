package AccessSpecifiers;
import package1.*;
public class PublicAccessSpecifiers {
	
	public static void main(String[] args) {
		
		D obj3=new D();
		obj3.setvalue(91);
        obj3.getvalue();
        
        G obj4=new G();
		obj4.setvalue(97);
        obj4.getvalue();
        
		D obj2=new D();
    	obj2.a=92;
		System.out.println("value of a equal to "+ obj2.a + " which is  directly accessible"
			+ " by PubliAccessSpecifiers class because a is public member of class D which"
			+ " is present in same package.");
		
		C obj=new C();
    	obj.c=95;
		System.out.println("value of c equal to "+ obj.c + " which is  directly accessible"
			+ " by PubliAccessSpecifiers class because c is public member of class C which"
			+ " is present in different package.");
		

		
	}

}
