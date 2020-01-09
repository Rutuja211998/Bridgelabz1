package FunctionalProgram;
import java.util.Scanner;
public class TwoD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int row,col, i, j;
      int arr[][]= new int[10][10];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a row of array");
       row=sc.nextInt();
      System.out.println("Enter a col of array");
       col= sc.nextInt();
      System.out.println("Enter" + (row*col) + "array elements");
      
      for(i=0; i<row; i++)
      {
    	  for(j=0; j<col; j++)
    	  {
    		  arr[i][j]=sc.nextInt();
    	  }
    	  
      }
      System.out.println("The Array is :");
      for(i=0; i<row; i++)
      {
          for(j=0; j<col; j++)
          {
              System.out.print(arr[i][j]+ "  ");
          }
          System.out.println();
      }
	}

}
