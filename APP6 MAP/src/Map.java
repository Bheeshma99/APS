import java.util.*;

public class Map {

	public static void main(String[] args) {
		System.out.println("Hash map example:-");
		HashMap<Integer,String> str2=new HashMap<>();
	    str2.put(1,"jai");
		str2.put(2,"veeru");
	    str2.put(3,"jai");
		str2.put(4,"radhe");
		str2.put(5,"kamli");
	    str2.put(6,"aman");
	    str2.put(10,"jai");
		str2.put(21,"veeru");
	    str2.put(31,"jai");
		str2.put(41,"radhe");
		str2.put(771,"kamli");
	    str2.put(61,"aman");
	    str2.put(21,"veeru");
	    Set<HashMap.Entry<Integer, String>>entries=str2.entrySet();
	    for(HashMap.Entry<Integer, String> data : entries)
	    System.out.println(data.getKey()+" "+data.getValue());
		System.out.println('\n');
		
		System.out.println("linked Hash map example:-");
		LinkedHashMap<Integer,String> str3=new LinkedHashMap<>();
		    str3.put(10,"jai");
			str3.put(21,"veeru");
		    str3.put(31,"jai");
			str3.put(41,"radhe");
			str3.put(771,"kamli");
		    str3.put(61,"aman");
		    str3.put(21,"veeru");
		    Set<HashMap.Entry<Integer,String>>entries1=str3.entrySet();
		    for(HashMap.Entry<Integer, String> data : entries1)
			    System.out.println(data.getKey()+" "+data.getValue());
		System.out.println('\n');
		
		System.out.println("Tree map example:-");
		TreeMap<Integer,String> str4=new TreeMap<>();
		    str4.put(13,"jai");
			str4.put(14,"veeru");
		    str4.put(25,"jai");
			str4.put(16,"radhe");
			str4.put(7,"kamli");
			str4.put(21,"veeru");
		    str4.put(18,"aman");
		    Set<HashMap.Entry<Integer,String>>entries2=str4.entrySet();
		    for(HashMap.Entry<Integer, String> data : entries2)
			    System.out.println(data.getKey()+" "+data.getValue());

	}

}
