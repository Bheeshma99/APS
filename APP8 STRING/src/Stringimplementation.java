import java.util.*;
public class Stringimplementation {

	public static void main(String[] args) {
		System.out.println("String:-");
		String s="Hello bhai";
		System.out.println(s.length());
		System.out.println(s.isEmpty());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(0, 3));
		String s1="Hello ahai";
		System.out.println(s.compareTo(s1));
		System.out.println(s.equals(s1));
		

		System.out.println("Stringbuffer:-");
		StringBuffer sbr=new StringBuffer("welcome by stringBuffer.");
		System.out.println(sbr);
		System.out.println(sbr.append(" Hey!"));
		System.out.println(sbr.insert(0,'W'));
		System.out.println(sbr.replace(0,3,"HHHH"));
		System.out.println(sbr.delete(0,3));
		
		System.out.println("StringBuilder:-");
		StringBuilder sbl=new StringBuilder("welcome by stringBuilder.");
		System.out.println(sbl);
		System.out.println(sbl.append(" Hey!"));
		System.out.println(sbl.insert(0,'W'));
		System.out.println(sbl.replace(0,3,"HHHH"));
		System.out.println(sbl.delete(0,3));
		
		System.out.println("conversion from string to string builder:-");
		String s2="jai ho";
		StringBuilder sbl2=new StringBuilder(s2);
		System.out.println(sbl2);
		
		System.out.println("conversion from string to string Buffer:-");
		String s3="jai";
		StringBuffer sbr2=new StringBuffer(s3);
		System.out.println(sbr2);
		
		
	}

}
