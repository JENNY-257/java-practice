import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args){
        // initializing two numbers and add them

        int num1 = 5;
        int num2 = 20;
        int sum = num1 + num2;

        System.out.println("The sum of num1 and num2: " + sum);

        // adding two numbers from the user input
        int num3, num4, result;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the first number");
        num3 = obj.nextInt();

        System.out.println("Enter the second number");
        num4 = obj.nextInt();

        result = num3 + num4;

        obj.close();

        System.out.println("The result of "+num3+" and "+num4 +":" + result);
    }
}
