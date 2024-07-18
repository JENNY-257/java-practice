import java.util.Scanner;

public class AverrageArray {
   public static void main(String[] args){
    double arr[] = {12.34,30,80,67};
    double total = 0;
    for(int i = 0 ; i<arr.length;i++){
        total += arr[i];
    }
    double average = total/arr.length;
    System.out.println(average);

    // from user input
    System.out.println("How many numbers you want to enter?");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    /* Declaring array of n elements, the value
     * of n is provided by the user
     */
    double[] arrays = new double[n];
    double totals = 0;

    for(int i=0; i<arrays.length; i++){
        System.out.print("Enter Element No."+(i+1)+": ");
        arr[i] = scanner.nextDouble();
    }
    scanner.close();
    for(int i=0; i<arr.length; i++){
        totals = totals + arr[i];
    }


    
    double aver = totals / arrays.length;
    
    System.out.format("The average is: %.3f", aver);
   } 
}
