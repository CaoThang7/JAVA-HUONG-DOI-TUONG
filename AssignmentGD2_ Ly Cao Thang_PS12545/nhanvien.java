
import java.util.Scanner;


public class nhanvien {
   String manv;
   String ten;
   double luong;
   public nhanvien(){
   }
   public nhanvien(String ten,String manv,double luong){
       this.ten=ten;
       this.manv=manv;
       this.luong=luong;
   }
  public void nhap(){
       Scanner b=new Scanner(System.in);
       System.out.println("Xin mời nhập tên nhân viên:");
       ten=b.nextLine();
       System.out.println("Xin mời nhập mã nhân viên:");
       manv=b.nextLine();
       System.out.println("Xin mời nhập lương:");
       luong=b.nextDouble();
  }
   public double getThuNhap(){
       return luong-getthueThuNhap();
   }
   public double getthueThuNhap(){
       if(luong<9000000)
           return 0;
           else if(luong<15000000)
           return (luong*10/100); 
           else 
               return (luong*12/100);
       }
   public String xuatTT(){
       return "Họ tên:" + ten +"\n" + "Mã nhân viên:" + manv +"\n"+ "Lương:" + luong +"\n"+ "Thuế:" + getthueThuNhap() +"\n" + "Thu nhập:" + getThuNhap() +"\n";
   }
}
