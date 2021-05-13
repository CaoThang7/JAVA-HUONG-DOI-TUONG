import java.util.Scanner;
public class sanpham {
    String ten;
    double gia;
    String hang="NOKIA";
    public sanpham(){
    } 
    public void nhap(){
        Scanner n=new Scanner(System.in);
        System.out.println("Nhập tên SP:");
        ten=n.nextLine();
        System.out.println("Giá:");
        gia=n.nextInt();
        System.out.println("Hãng:" + hang + "\n");  
    }
    public void nhap2(){
        Scanner b=new Scanner(System.in);
        System.out.println("Nhập tên hãng:");
        hang=b.nextLine();
    }
    public sanpham(String ten,double gia,String hang){
        this.ten=ten;
        this.gia=gia;
        this.hang=hang;
    }
    public String xuatTT(){
        return "tên sản phẩm:" + ten + "\n "+ "Giá:" + gia + "\n " + "Hãng:" + hang + "\n "; 
    }
}
