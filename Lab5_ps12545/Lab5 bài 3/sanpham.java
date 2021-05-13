import java.util.Scanner;
public class sanpham {
    String ten;
    double gia;
    double khuyenmai;
    public sanpham(){
    } 
    public void nhap(){
        Scanner n=new Scanner(System.in);
        System.out.println("Nhập tên SP:");
        ten=n.nextLine();
        System.out.println("Giá:");
        gia=n.nextInt();
        System.out.println("Khuyến mãi:");
        khuyenmai=n.nextDouble();
    }
    public sanpham(String ten,double gia,double khuyenmai){
        this.ten=ten;
        this.gia=gia;
        this.khuyenmai=khuyenmai;
    }
    public String xuatTT(){
        return "tên SV:" + ten + "\n "+ "Giá:" + gia + "\n " + "Khuyến mãi:" + khuyenmai + "\n "; 
    }
}

