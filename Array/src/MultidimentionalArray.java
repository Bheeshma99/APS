import java.util.Scanner;

public class MultidimentionalArray {

	public static void main(String[] args) {
		
		int [][] arr=new int [5][2];
		System.out.println("enter the values of 2D arrays in pair.");
		Scanner in=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<2;j++)
			arr[i][j]=in.nextInt();
		}
		System.out.println("the values of 2D arrays:-");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<2;j++)
			System.out.print(arr[i][j]+" ");
			System.out.print('\n');
		}
	}

}
