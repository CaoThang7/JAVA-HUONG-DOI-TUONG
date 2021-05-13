
import java.util.Scanner;

public class Lab1B4 {
    public static void main(String[]args){
        Scanner d=new Scanner(System.in);
        System.out.printf("Nhap a=");
        double a=d.nextDouble();
        System.out.printf("Nhap b=");
        double b=d.nextDouble();
        System.out.printf("Nhap c=");
        double c=d.nextDouble();
        double e=Math.pow(b,2)-4*a*c;
        System.out.printf("Delta= %.2f",e );
        double g=Math.sqrt(e);
        System.out.printf("Cân delta=%.2f",g);
    }
   
}
