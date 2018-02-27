/**

Name:			Continue

Description:	To promt the user to pick a number

Created by:		Darragh O'Donnell

Created on:		18/09/2017

*/

import java.util.Scanner;

public class Continue{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int counter = 0;
      int x = 0;

      System.out.print("Enter a number from 1 to 10: ");
      x = input.nextInt();

      while(counter < 10){
		 counter++;
		 if(x == counter){
			  continue;
	     }
	     System.out.println(counter);
      }
   }
}