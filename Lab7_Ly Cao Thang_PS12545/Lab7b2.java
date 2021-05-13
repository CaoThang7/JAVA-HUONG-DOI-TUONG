import java.util.ArrayList;
public class Lab7b2 {
    public static void main(String[]args){
        ArrayList<String> a=new ArrayList<>();
        sinhvienpoly2 b=new sinhvienpoly2();
        System.out.print("SV thứ nhất:");
        b.ten="Ly Cao Thang";
        b.nganh="Lập trình mobile";
        b.diem=7;
        System.out.print(b.xuatTT());
        b.getdiem();
        System.out.print("\nSV thứ hai:");
        sinhvienpoly2 c=new sinhvienpoly2();
        c.ten="Nguyễn Văn A";
        c.nganh="Lập trình mobile";
        c.diem=5;
        System.out.print(b.xuatTT());
        c.getdiem();
     
    }
}
