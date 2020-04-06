/*Write a program that acts as a simple “Slot Machine”. The user starts with 100 chips and each “pull” of
the handle costs 1 chip. Your program “spins” three wheels each consisting of the numbers 1, 2 and 3. If
all three numbers are 1, the user wins 4 chips; if all three are 2, the user wins 8 chips; if all are 3 the user
wins 12 chips. End your program when the user says so or when the number of chips is zero.
*/
// Slotmachine
// Fiona Xie
// 2/25/2020
package a1_slotmachine;
import java.util.Random; //imports the utilities needed, scanner and random
import java.util.Scanner;
public class A1_Slotmachine {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in); // scanner
      int chips= 100;
      
      String go;
      
      System.out.println("To spin, press \"Y\", to stop playing, press \"N\" "); // instructions on how to play
      while (chips>0) { //Loop only works when chips is above 0 
          
         System.out.print("You have "+chips+" chips. Go? "); //prints out number of current chips, ask user if they want to continue
         go = input.nextLine();
         
         if (go.equals("Y")){  // when user press "Y"
             
             int total=1; 
             
           for (int i = 0; i < 3; i++) { //generates random number between 1 and 3 
                    double r = Math.random();
                    int a = (int) ((3) * r + 1);
                    
                    total *= a; // multiplys the 3 random 

                    System.out.printf("[%1d]",a); // prints numbers out
            }
           if (total == 1){ // when the product is one, meaning 3 random numbers were all 1
                    chips=chips+ 4; // adds 4 chips to total chips
                    System.out.println(" - you won 4 chips");
                } else if (total == 8){ // when product is 8, meaning all 3 were 2
                    chips=chips+ 8;//adds 8 chips to total
                    System.out.println(" - you won 8 chips");
                } else if (total == 27){//when product  is 27, meaning all were 3 were 3
                    chips=chips+12;//adds 12 to total
                    System.out.println(" - you won 12 chips");
                } else {
                    System.out.println(" - you lost");// subtracts 1 chip from total
                    chips= chips-1;
                }
         }
         else if (go.equals("N")){ // if user enters N, ends loop
    System.out.println("You have no more chips, you lose."); //when chips reach 0, prints out loser message
    m ,mv   }
    }
}
        

         
      
      
      
    
    

