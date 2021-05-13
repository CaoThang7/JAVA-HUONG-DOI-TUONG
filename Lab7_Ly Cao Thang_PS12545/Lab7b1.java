import java.util.ArrayList;
public class Lab7b1 {
    public static void main(String[]args){
        ArrayList<String> a=new ArrayList<>();
        System.out.print("hình vuông:");
        hinhvuong b=new hinhvuong();
        b.cd=5;
        b.cr=5;
        b.tinhDT();
        System.out.print(b.xuatTT2());
        System.out.print("\nhình chữ nhật:");
        hinhchunhat c=new hinhchunhat();
        c.cd=7;
        c.cr=5;
        c.tinhDT();
        c.tinhCV();
        System.out.print(c.xuatTT());
    }
}
