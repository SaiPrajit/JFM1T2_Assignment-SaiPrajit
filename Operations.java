/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {

  public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       System.out.println("Enter first num for difference: ");
       int a=sc.nextInt();
       System.out.println("Enter second num for difference: ");
       int b=sc.nextInt();
       System.out.println("Enter first num for product: ");
       int c=sc.nextInt();
       System.out.println("Enter second num for product: ");
       int d=sc.nextInt();
       System.out.println("Enter first num for division: ");
       int e=sc.nextInt();
       System.out.println("Enter second num for division: ");
       int f=sc.nextInt();
       System.out.println("Enter num for increment and decrement: ");
       int g=sc.nextInt();
       System.out.println("Enter first num for remainder: ");
       int h=sc.nextInt();
       System.out.println("Enter second num for remainder: ");
       int i=sc.nextInt();

//calculate difference,product,division,increment and remainder 

        int diff=a-b;
        int pro=c*d;
        int div=e/f;
        int inc=g+1;
        int dec=g-1;
        int rem=h%i;

//print appropriate result for all operations
        System.out.println("Difference of 2 numbers is: "+diff);
        System.out.println("Product of 2 numbers is: "+pro);
        System.out.println("Division of 2 numbers is: "+div);
        System.out.println("Increment of 15 is: "+inc);
        System.out.println("Decrement of 15 is: "+dec);
        System.out.println("Remainder of 2 numbers is: "+rem);
    

}}