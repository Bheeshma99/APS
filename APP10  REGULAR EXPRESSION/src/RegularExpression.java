import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		 System.out.println("Enter the count of strings in string set.");
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		String[] emailid_collectins=new String [n+1];
		 System.out.println("Enter all the  strings of string set.");
		 int i=0;
		 for(i=0;i<=n;i++)
		 {
			 emailid_collectins[i]=sc.nextLine();
			
		 }
		 
		
		 while(true)
		 {
			 System.out.println(" ");
			 System.out.println(" ");
			 System.out.println("Enter the string.");
			 String regex=sc.nextLine();
			 Pattern pattern = Pattern.compile(regex);  
			 int flag=0;
			 for(i=0;i<=n;i++  )
			 {
				 Matcher matcher = pattern.matcher(emailid_collectins[i]); 
				
				 if(matcher.matches())
				 {
					 System.out.println("this string is presnt in given set.");
					 flag=1; 
					 break;
				 }
			 }
			 if(flag==0)
			 {
				 System.out.println("this string is not presnt in given set."); 
			 }
		 }

	}

}
