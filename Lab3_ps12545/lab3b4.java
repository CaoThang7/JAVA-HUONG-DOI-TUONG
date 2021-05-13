import java.util.Scanner;
public class lab3b4 {
    public static void main(String[]agrs){
        SinhVien a[] = new SinhVien[2];
        String ten;
        int diem = 0;
        Scanner n =new Scanner(System.in);
        for(int i=0 ;i<2;i++){
            a[i] = new SinhVien();
            System.out.println("Xin mời nhập tên :");
            ten=n.nextLine();
            a[i].setTen(ten);
            System.out.println("Xin mời nhập điểm :");
            diem=n.nextInt();
            a[i].setDiem(diem);
            n.nextLine();
            if(diem<5){
               System.out.println("Học lực yếu"); 
            }else if((5<=diem)&&(diem<6.5)){
               System.out.println("Học lưc trung bình");
            }else if((6.5<=diem)&&(diem<=7.)){
               System.out.println("Học lưc khá");          
            }else if((7.5<=diem)&&(diem<9)){
               System.out.println("Học lưc giỏi");
            }else if(diem>=9){
               System.out.println("Học lưc xuất sắc");
            }
        }
        for( int i=0;i<2;i++){
            for(int j=i+1;j<2;j++){
               if(a[i].getDiem()>a[j].getDiem()){
                  SinhVien temp = new SinhVien();
                  temp = a[i];
                  a[i] = a[j];
                  a[j] = temp;
                }
            }
        }
        System.out.println("\nThông tin sinh vien sau khi sắp xếp là:");
        for(int i=0;i<2;i++){
            System.out.println("Tên sinh viên:"+a[i].getTen());
            System.out.println("Điểm sinh viên:"+a[i].getDiem());
            if(a[i].getDiem()<5){
               System.out.println("Học lực yếu"); 
            }else if((5<=a[i].getDiem())&&(a[i].getDiem()<6.5)){
               System.out.println("Học lưc trung bình");
            }else if((6.5<=a[i].getDiem())&&(a[i].getDiem()<=7.)){
               System.out.println("Học lưc khá");          
            }else if((7.5<=a[i].getDiem())&&(a[i].getDiem()<9)){
               System.out.println("Học lưc giỏi");
            }else if(a[i].getDiem()>=9){
               System.out.println("Học lưc xuất sắc");
            }
        }
        
    }
}
class SinhVien{
    private String ten;
    private String Hocluc;
    private int diem;
    public void setTen(String ten){
        this.ten = ten;
    }
    public String getTen(){
        return this.ten;
    }
    public void setDiem(int diem){
        this.diem = diem;
    }
    public int getDiem(){
        return this.diem;
    }
}