package practicejava;

import java.util.Scanner;
/*
                   1
                 2 1 2
               3 2 1 2 3
             4 3 2 1 2 3 4
           5 4 3 2 1 2 3 4 5
         6 5 4 3 2 1 2 3 4 5 6
       7 6 5 4 3 2 1 2 3 4 5 6 7
     8 7 6 5 4 3 2 1 2 3 4 5 6 7 8
   9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9
 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10

 */

public class practiceloop1 {
	public static void main(String []args) {
		int a;
 		Scanner input = new Scanner(System.in);
    		System.out.println("Enter the no of lines");
 		a=input.nextInt();
    		for(int i=1;i<=a;i++)
    		{

	      		for(int j=1;j<=a-i;j++)
        		{
     			System.out.print("  ");
			} 	
	       	for( int j=i;j>0;j--)
        		{
     			System.out.print(" "+j);
			} 			
	       		for(int j=2;j<=i;j++)
        		{
     			System.out.print(" "+j);
		} 			

        		System.out.println();
    		}
    		
	}
}
