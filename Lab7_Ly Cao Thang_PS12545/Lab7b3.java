
public class Lab7b3 {
    public static void main(String[]args){
        System.out.print("Sinh viên IT\n");
        svIT a=new svIT();
        a.ten="Ly Cao Thang";
        a.diemJava=9;
        a.diemCSS=8;
        a.diemhtml=7;
        System.out.println("Tên:" + a.ten + "Điểm JAVA:" + a.diemJava + "Điểm CSS:" + a.diemCSS + "Điểm html:" + a.diemhtml + "Tổng Điểm:" + a.getDiem() +"\n" );
        SVBiz b=new SVBiz();
        b.ten="Nguyễn Văn A";
        b.marketing=7;
        b.sales=6;
        System.out.println("Tên:" + b.ten + "Điểm marketting:" + b.marketing + "Điểm sales" + b.sales + "Tổng điểm" + b.getDiem() +"\n");
    }
    
}
