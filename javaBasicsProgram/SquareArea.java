import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args){
        double side;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side");
        side = scan.nextDouble();
        scan.close();
        double area =  side * side;
        System.out.println("area of the square " + area);
    }

}
