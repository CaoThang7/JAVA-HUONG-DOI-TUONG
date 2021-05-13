
import java.util.Scanner;

public class Truongphong extends nhanvien {
    double trachNhiem;
    public Truongphong(){
    }
    @Override
    public double getThuNhap() {
     return super.getThuNhap()+(trachNhiem);
    }
      public void nhap2(){
       Scanner j=new Scanner(System.in);
       System.out.println("Lương trách nhiệm:");
       trachNhiem=j.nextDouble();
    }
    public String xuatTT(){
        return "Tên:" + ten + "\n"+"Lương Trách nhiệm:" + trachNhiem +"\n"+"Thu Nhập:" + getThuNhap()+"\n" ;
    }
}
