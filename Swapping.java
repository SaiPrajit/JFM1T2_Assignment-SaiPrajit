/*  JFM1T2_Assignment6:

    Write a program that swaps the values of 2 variables without using third variable.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    12
    Enter second number: 
    45
    
    Expected Output:
    Before swapping: 12 , 45
    After swapping: 45 , 12
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Swapping {

  public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number: ");
    int x=sc.nextInt();
    System.out.println("Enter second number: ");
    int y=sc.nextInt();
    //swapping two numbers without using third variable
    System.out.println("before swapping numbers: "+x +", "+ y);  
    //Swapping  
    x = x + y;   
    y = x - y;   
    x = x - y;   
    //print result
    System.out.println("After swapping: "+x +",  " + y);   



}}