import java.util.Scanner;
public class thongtinsv {
    String ten;
    String email;
    String sdt;
    String CMND;
    public thongtinsv(){
    } 
    public void nhap(){
        Scanner n=new Scanner(System.in);
        System.out.println("Nhập tên sinh viên:");
        ten=n.nextLine();
        System.out.println("Email:");
        email=n.nextLine();
        System.out.println("Số điện thoại:");
        sdt=n.nextLine();
        System.out.println("Nhập CMND:");
        CMND=n.nextLine();
    }
    public thongtinsv(String ten,String email,String sdt,String CMND){
        this.ten=ten;
        this.email=email;
        this.sdt=sdt;
        this.CMND=CMND;
    }
    public String xuatTT(){
        return "tên SV:" + ten + "\n "+ "Email:" + email + "\n " + "SĐT:" + sdt + "CMND: " + CMND + "\n "; 
    }
}
