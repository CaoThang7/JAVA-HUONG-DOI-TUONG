import java.util.Scanner;
public class TiepThi extends nhanvien {
   double doanhSo;
   double hueHong;
   public void getthuNhap(){    
   }
    @Override
    public double getThuNhap() {
     return super.getThuNhap()+(doanhSo*hueHong);
    }
    public void nhap2(){
       Scanner j=new Scanner(System.in);
       System.out.println("Xin mời nhập Huệ Hồng:");
       hueHong=j.nextDouble();
       System.out.println("Xin mời nhập Doanh Số:");
       doanhSo=j.nextDouble();
    }
   public String xuatTT(){
    return "Tên:" + ten +"\n "+"Huệ Hồng:" + hueHong +"\n"+"Doanh Số:" + doanhSo +"\n"+"Thu nhập:" + getThuNhap()+"\n"; 
}
}

