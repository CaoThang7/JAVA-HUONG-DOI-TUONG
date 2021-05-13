import java.util.ArrayList;
import java.util.Scanner;
public class Lab6b2 {
    public static void main(String[]args){
        //so sánh sản phẩm hiển thị   
        ArrayList<sanpham> a=new ArrayList<>();
        Scanner c=new Scanner(System.in);
            System.out.print("\nxin mời chọn hãng:");
            String tenhang=c.nextLine();
            String pattern="NOKIA";
        if(tenhang.matches(pattern)){
            System.out.print("Cửa hàng có các loại sản phẩm như:"+"\n");
            System.out.print("NOKIA 1\n");
            System.out.print("NOKIA 2\n");
            System.out.print("NOKIA 3\n");
            System.out.print("NOKIA 4\n");
            System.out.print("Nhiều loại khác v.v\n");
        }else{
            System.out.print("\nHàng không tồn tại\n");
        }
            System.out.print("\nxin mời chọn lại đúng hãng:");
            String tenhang2=c.nextLine();
            String pattern2="NOKIA";
        if(tenhang2.matches(pattern2)){
            System.out.print("Cửa hàng có các loại sản phẩm như:"+"\n");
            System.out.print("NOKIA 1\n");
            System.out.print("NOKIA 2\n");
            System.out.print("NOKIA 3\n");
            System.out.print("NOKIA 4\n");
            System.out.print("Nhiều loại khác v.v\n");
        }else{
             System.out.print("\nHàng không tồn tại\n");  
        }
        //Nhập sản phẩm:
        sanpham sv1=new sanpham();
        sv1.nhap();
        a.add(sv1);
        sanpham sv2=new sanpham();
        sv2.nhap();
        a.add(sv2);
        sanpham sv3=new sanpham();
        sv3.nhap();
        a.add(sv3);
        sanpham sv4=new sanpham();
        sv4.nhap();
        a.add(sv4);
        sanpham sv5=new sanpham();
        sv5.nhap();
        a.add(sv5);
        //Xuất sản phẩm:
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i).xuatTT());
        }     
    }
}