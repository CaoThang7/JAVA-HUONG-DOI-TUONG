import java.util.ArrayList;
import java.util.Scanner;
public class Lab6b3 {
    public static void main(String[]args){
        ArrayList<thongtinsv> a=new ArrayList<>();
        thongtinsv sv1= new thongtinsv();
        a.add(sv1);
        sv1.nhap();
        thongtinsv sv2= new thongtinsv();
        a.add(sv2);
        sv2.nhap();
        thongtinsv sv3= new thongtinsv();
        a.add(sv3);
        sv3.nhap();
        thongtinsv sv4= new thongtinsv();
        a.add(sv4);
        sv4.nhap();
        thongtinsv sv5= new thongtinsv();
        a.add(sv5);
        sv5.nhap();        
        //Gmail
        for(int i=0;i<a.size();i++){
        String Email="\\w+@\\w+\\.\\w+";   
            if(!a.get(i).email.matches(Email)){
                System.out.println("\nsai và không hiển thị thông tin sinh viên");
                System.out.println("Xin mời nhập lại:");
            }else{
                System.out.println("\ntrue:\n"+a.get(i).xuatTT());
            }
        }
        //SĐT
        String pattern="09\\d{8}";
        for(int i=0;i<a.size();i++){
            if(a.get(i).sdt.matches(pattern)){
                System.out.println("đúng\n"+a.get(i).xuatTT());
            }else{
                System.out.println("sai");
            }
        }
        //CMND
        String pattern1="\\d{10}";
        for(int i=0;i<a.size();i++){
            if(a.get(i).CMND.matches(pattern1)){
                System.out.println("đúng\n"+a.get(i).xuatTT());
            }else{
                System.out.println("sai");
                System.out.println("Xin mời nhập lại:");
            }
        }
    }
}
    
 

 
