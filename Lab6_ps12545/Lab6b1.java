
public class Lab6b1 {
    public static void main(String[]args){
       String x=("Ly Cao Thang");
       System.out.println("Tên ban đầu:" +x);
       System.out.println("Tên đệm lấy ra in thường:" +x.substring(2,6));
       System.out.println("Vị trí tìm họ Lý:" +x.indexOf("Ly"));
       System.out.println("Vị trí tìm tên Thắng:" +x.lastIndexOf("Thang"));
       System.out.println("Tên họ lấy ra in hoa:" +x.substring(0,3).toUpperCase());
       System.out.println("Tên lấy ra in hoa:" +x.substring(6).toUpperCase());
       System.out.println("Full name in hoa:" +x.toUpperCase()); 
    }
}
