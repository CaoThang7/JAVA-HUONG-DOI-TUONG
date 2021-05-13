import java.util.Scanner;
public abstract class abc {
    String ten;
    int MSSV;
    double diemSV;
    public abc(){
    } 
    public void nhap(){
        Scanner n=new Scanner(System.in);
        System.out.println("Nhập tên SV:");
        ten=n.nextLine();
        System.out.println("Nhập MSSV:");
        MSSV=n.nextInt();
        System.out.println("Nhập điểm:");
        diemSV=n.nextDouble();
    }
    public abc(String ten,int MSSV,double diemSV){
        this.ten=ten;
        this.MSSV=MSSV;
        this.diemSV=diemSV;
    }
    public String xuatTT(){
        return "tên SV:" + ten + "\n "+ "MSSV:" + MSSV + "\n " + "Điểm TB:" + diemSV + "\n "; 
    }
 
}

