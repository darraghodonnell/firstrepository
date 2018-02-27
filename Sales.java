/**

Name:		Sales

Description:	Determine the retail price for each product

Created by:	Darragh O'Donnell

Created on:	18/09/2017

*/

import java.util.Scanner;

public class Sales{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      double total = 0;
      int productId;
      
      System.out.print("Enter product number (1 to 5, or 0 to quit): ");
      productId = input.nextInt();
      
      while(productId != 0){
         if(productId >= 1 && productId <= 5){
            System.out.print("Enter quantity sold: ");
            int quantity = input.nextInt();
            switch(productId){
               case 1:
                  total += quantity * 2.98;
                  break;
               case 2:
		  total += quantity * 4.50;
                  break;
               case 3:
                  total += quantity * 9.98;
                  break;
               case 4:
                  total += quantity * 4.49;
                  break;
               case 5:
                  total += quantity * 6.87;
                  break;   
         }
		 }else{
            System.out.println("Not a valid number.");
         }
         System.out.print("Enter product number (1 to 5, or 0 to quit): ");
         productId = input.nextInt();
	  }
      System.out.println("Total value of products sold: " +Math.round((total * 10000.0)/10000.0));
   }
}