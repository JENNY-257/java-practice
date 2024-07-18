import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args){
   
    // using if else sattement
    
    System.out.println("Enter the number");
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    if(num%2==0){
        System.out.println(num + " is even");
    }
    else{
        System.out.println(num + " is odd");

    }


    // using ternary operator
    String result = (num%2==0)? num +" is even": num +" is odd";

    System.out.println(result);
  }  

}
