
import java.util.ArrayList;

public class Lab5b2 {
    public static void main(String[]args){
    //nhập ds sinh viên    
        ArrayList<abc> a=new ArrayList<>();
        abc sv1=new abc();
        sv1.nhap();
        a.add(sv1);
        abc sv2=new abc();
        sv2.nhap();
        a.add(sv2);
    // xuất ds sinh viên
    System.out.print("Thông tin sv ban đầu:"+"\n");
        for(int i=0;i<a.size();i++){    
            System.out.print(a.get(i).xuatTT()+"\n");
        }
    // sinh viên điểm cao nhất
        abc svl=a.get(0);
        for(int i=0;i<a.size();i++){
            if(svl.diemSV <a.get(i).diemSV){
                svl=a.get(i);
            }
        }
        System.out.println("SV có điểm lớn nhất:"+svl.xuatTT());
    // sắp xếp giảm dần
        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.size();j++){
                if(a.get(i).diemSV>a.get(j).diemSV){
                abc tam=a.get(i);
                a.set(i, a.get(j));
                a.set(j, tam);
                }
            } 
        }
        System.out.println("\nThông tin điểm SV sau khi sắp xếp điểm giảm dần là:");
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i).xuatTT()+ "\n ");
        }
        //xoá họ tên từ bàn phím
        ArrayList<String> b = new ArrayList<>();
        b.add("Ly Cao Thang");
        b.add("Nguyen Minh Dao");
        b.add("Ngo Thanh Dung");
        System.out.println("Các phần tử của arrList ban đầu: ");
        System.out.println(b);
  
        b.remove(2);
 
        System.out.println("Các phần tử của arrList sau khi xóa phần tử số 2: ");
        System.out.println(b);
         
        System.out.println("Các phần tử của arrList ban đầu: ");
        System.out.println(b);
   
        b.remove("Nguyen Minh Dao");
         
        System.out.println("Các phần tử của arrList sau khi xóa phần tử Nguyen Minh Dao: ");
        System.out.println(b);
    }
}     




