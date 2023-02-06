package ty;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the row size");
		int row= sc.nextInt();
		System.out.println("enter the column size");
		int col=sc.nextInt();
		int [][]arr=new int[row][col];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the values:");
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
	
			}
				
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
	
			}
			System.out.println();
				
		}
	}

}
