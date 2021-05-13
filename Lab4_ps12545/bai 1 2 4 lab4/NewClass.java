
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class NewClass {
    String tenSp;
    double donGia;
    double giamGia;
    double thueNhapKhau;
    public double getThueThuNhap(){
    return (donGia*10/100);
    }
    public void nhap(){
        Scanner s=new Scanner(System.in);
        System.out.print("nhập tên sp:");
        tenSp=s.nextLine();
        System.out.print("nhập đơn giá:");
        donGia=s.nextDouble();
        System.out.print("nhập giảm giá:");
        giamGia=s.nextDouble(); 
    }
    public String gettenSp(String tenSp){
        return tenSp;
    }
    public void settenSp(String tenSp){
        this.tenSp=tenSp;
    }
    public String xuatThongTin(){
        return "Tên Sản Phẩm: "+ tenSp + "Đơn Giá:"+ donGia +"Giảm Giá:"+giamGia+"Thuế Nhập Khẩu:"+thueNhapKhau+ "\t ";
    }
}
