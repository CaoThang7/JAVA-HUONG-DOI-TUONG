
import java.util.Scanner;


public abstract class sinhvienpoly {
    String ten;
    String nganh;
    double diem;
    public sinhvienpoly(){    
    }
    public sinhvienpoly(String ten,String nganh,double diem){
    this.ten=ten;
    this.nganh=nganh;
    this.diem=diem;
}
      public abstract void getdiem();
      public String xuatTT(){
          return "Tên:" + ten + "Ngành:" + nganh + "Điểm:" + diem;
      }
}
