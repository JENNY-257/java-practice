import java.util.Scanner;

public class AverageNumber {
    public static double average(double a, double b, double c){
        return (a+b+c)/3;
    }
    public static void main(String[] args){

     @SuppressWarnings("resource")
    Scanner number = new Scanner(System.in);

     System.out.println("enter a");
     double num1 = number.nextDouble();

     System.out.println("enter b");
     double num2 = number.nextDouble();

     System.out.println("enter c");
     double num3 = number.nextDouble();

     double avg = average(num1,num2,num3);
     
     System.out.println("The average of input numbers is "+ avg);
     
    }
}
