
import java.util.Scanner;


public class Lab1B2 {
    public static void main(String[]args){
        Scanner d=new Scanner(System.in);
        System.out.println("Xin moi nhap chieu dai =");
        double chieudai=d.nextDouble();
        System.out.println("Xin moi nhap chieu rong =");
        double chieurong=d.nextDouble();
        System.out.println("Diện tích="+(chieudai*chieurong));
        System.out.println("Chu vi="+(chieudai+chieurong)*2);
        System.out.println("Cạnh nhỏ nhất"+Math.min(chieudai,chieurong));
    }
    
}
