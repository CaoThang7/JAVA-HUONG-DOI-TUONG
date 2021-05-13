
import java.util.Scanner;
public class Lab1B1 {
    public static void main(String[]agrs){
        Scanner d=new Scanner(System.in);
        System.out.printf("Họ và Tên:");
        String ten=d.nextLine();
        System.out.printf("Điểm TB là:");
        double diem=d.nextDouble();
        System.out.printf("Họ và tên:%s Điểm TB là: %.2f",ten,diem);
    }
    
}
