import java.util.Scanner;

public class Interest {
    public static void main(String[] args){
        double p,t,r,result;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Principal ");
        p = scan.nextDouble();

        System.out.println("Enter the Rate of interest ");
        t = scan.nextDouble();

        System.out.println("Enter the Time period");
        r = scan.nextDouble();
        scan.close();
        result = (p*r*t)/100;
        System.out.println("The simple interest is: " + result);
        
    }
    
}
