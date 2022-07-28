import java.util.*;
public class Collections {

	public static void main(String[] args) {
		System.out.println("Array list example:-");
		ArrayList<Integer> str=new ArrayList<>();
		str.add(1);
		str.add(7);
		str.add(9);
		System.out.println(str);
		System.out.println('\n');
		
		
		System.out.println("Vector example:-");
		Vector<Integer> a=new Vector<>();
		a.add(15);
		a.add(71);
		a.add(95);
		System.out.println(a);
		System.out.println('\n');
		
		System.out.println("linked list example:-");
		LinkedList<String> str1=new LinkedList<>();
	    str1.add("ram");
		str1.add("shyam");
		str1.add("ganesh");
		System.out.println(str1);
		System.out.println('\n');
		
		System.out.println("Hash set example:-");
		HashSet<String> str2=new HashSet<>();
	    str2.add("jai");
		str2.add("veeru");
	    str2.add("jai");
		str2.add("radhe");
		str2.add("kamli");
	    str2.add("aman");
		System.out.println(str2);
		System.out.println('\n');
		
		System.out.println("linked Hash set example:-");
		LinkedHashSet<String> str3=new LinkedHashSet<>();
	    str3.add("jai");
		str3.add("veeru");
		str3.add("radhe");
		str3.add("radhe");
		str3.add("kamli");
	    str3.add("aman");
		System.out.println(str3);
		System.out.println('\n');
		
		System.out.println("linked Hash set example:-");
		TreeSet<String> str4=new TreeSet<>();
	    str4.add("jai");
		str4.add("veeru");
		str4.add("radhe");
		str4.add("radhe");
		str4.add("kamli");
	    str4.add("aman");
		System.out.println(str4);
		System.out.println('\n');
		
		System.out.println("PriorityQueue example:-");
		PriorityQueue <String> str5=new PriorityQueue<>();
	    
		str5.add("veeru");
		str5.add("radhe");
		str5.add("radhe");
		str5.add("kamli");
	    str5.add("aman");
	    str5.add("jai");
		//System.out.println(str5);
		System.out.println(str5.poll());
		System.out.println(str5.poll());
		System.out.println(str5.element());
		System.out.println(str5.remove());
		System.out.println(str5.remove());
		System.out.println(str5.peek());
		System.out.println(str5.poll());
		System.out.println(str5.poll());
		System.out.println(str5.poll());
		System.out.println(str5.peek());
		System.out.println(str5.remove());
		System.out.println('\n');
		

	
	}

}
