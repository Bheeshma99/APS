import java.util.*;
public class Array {

	public static void main(String[] args) {
		int [] arr=new int [10];
		System.out.println("enter the values of arrays.");
		Scanner in=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("the values of arrays:-");
		for(int i=0;i<10;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
