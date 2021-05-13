import java.util.ArrayList;
public class Lab5b3 {
    public static void main(String[]args){
        //nhập ds sản phẩm    
        ArrayList<sanpham> a=new ArrayList<>();
        sanpham sv1=new sanpham();
        sv1.nhap();
        a.add(sv1);
        sanpham sv2=new sanpham();
        sv2.nhap();
        a.add(sv2);
        // xuất ds sinh viên
        System.out.print("Thông tin sp ban đầu:"+"\n");
        for(int i=0;i<a.size();i++){    
            System.out.print(a.get(i).xuatTT()+"\n");
        }
        //Sản phẩm gía cao nhất
        sanpham svl=a.get(0);
        for(int i=0;i<a.size();i++){
            if(svl.khuyenmai <a.get(i).khuyenmai){
                svl=a.get(i);
            }
        }
        System.out.println("Sp có giá lớn nhất:"+svl.xuatTT());
        // sắp xếp giảm dần
        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.size();j++){
                if(a.get(i).gia>a.get(j).gia){
                sanpham tam=a.get(i);
                a.set(i, a.get(j));
                a.set(j, tam);
                }
            } 
        }
        System.out.println("\nThông tin SP sau khi sắp xếp điểm giảm dần là:");
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i).xuatTT()+ "\n ");
        }
        //xoá sản phẩm
        
      

        ArrayList<String> b=new ArrayList<>();
        b.add("Mì gói");
        b.add("Kem đánh răng");
        b.add("bột giặt");
        System.out.println("Các phần tử của arrList ban đầu: ");
        System.out.println(b);
  
        b.remove(2);
 
        System.out.println("Các phần tử của arrList sau khi xóa phần tử số 2: ");
        System.out.println(b);
         
        System.out.println("Các phần tử của arrList ban đầu: ");
        System.out.println(b);
   
        b.remove("Mì gói");
         
        System.out.println("Các phần tử của arrList sau khi xóa phần tử Mì gói: ");
        System.out.println(b);
    }
}
