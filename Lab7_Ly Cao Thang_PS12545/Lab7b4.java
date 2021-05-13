
import java.util.ArrayList;

public class Lab7b4 {
    public static void main(String[]args){
    //nhập ds sinh viên    
        ArrayList<abc> a=new ArrayList<>();
        abcd sv1=new abcd();
        sv1.nhap();
        a.add(sv1);
        abcd sv2=new abcd();
        sv2.nhap();
        a.add(sv2);
    // xuất ds sinh viên
    System.out.print("Thông tin sv ban đầu:"+"\n");
        for(int i=0;i<a.size();i++){    
            System.out.print(a.get(i).xuatTT()+"\n");
        }
    // sinh viên điểm giỏi
        for(int i=0;i<a.size();i++){
            if((a.get(i).diemSV <=9) && (a.get(i).diemSV>8)) {
              System.out.println("SV có điểm giỏi:" +a.get(i).xuatTT());
            }
        }
        
    // sắp xếp tăng dần
        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.size();j++){
                if(a.get(i).diemSV<a.get(j).diemSV){
                abc tam=a.get(i);
                a.set(i, a.get(j));
                a.set(j, tam);
                }
            } 
        }
         System.out.println("\nThông tin điểm SV sau khi sắp xếp điểm tăng dần là:");
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i).xuatTT()+ "\n ");
        }
}
}