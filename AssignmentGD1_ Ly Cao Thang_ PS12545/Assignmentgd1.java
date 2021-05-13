
import java.util.Scanner;


public class Assignmentgd1 {
    public static void main(String[]agrs){   
        Scanner a=new Scanner(System.in);
        while(true)
        {
        System.out.println(">>>-------------------- MENU CHƯƠNG TRÌNH -------------------<<<");
        System.out.println("+++----------------------------------------------------------+++");
        System.out.println(" | 1.Nhập danh sách nhân viên từ bàn phím                     |");
        System.out.println(" | 2.Xuất danh sách nhân viên ra màn hình                     |");
        System.out.println(" | 3.Tìm và hiển thị nhân viên theo mã nhập từ bàn phím       |");
        System.out.println(" | 4.Xoá nhân viên theo mã nhập từ bàn phím                   |");
        System.out.println(" | 5.Cập nhật thông tin nhân viên theo mã nhập từ bàn phím    |");
        System.out.println(" | 6.Tìm các nhân viên theo khoảng lương nhập từ bàn phím     |");
        System.out.println(" | 7.Sắp xếp nhân viên theo họ và tên                         |");
        System.out.println(" | 8.Sắp xếp nhân viên theo thu nhập                          |");
        System.out.println(" | 9.Xuất 5 nhân viên có thu nhập cao nhất                    |");
        System.out.println(" | 10.Thoát                                                   |");
        System.out.println("+++----------------------------------------------------------+++");
        System.out.println("xin mời chọn chức năng:");
        int b=a.nextInt();
        switch(b){
            case 1:chucnang1();            
                break;
            case 2:chucnang2();
                break;
            case 3:chucnang3();                   
                break;
            case 4:chucnang4();
                break;
            case 5:chucnang5();
                break;
            case 6:chucnang6();
                break;
            case 7:chucnang7();
                break;
            case 8:chucnang8();
                break;
            case 9:chucnang9();
                break;
            default:
                break;
        }
        if(b==10)
            break;
        }
        System.out.print("Kết thúc chương trình");
    }


        public static void chucnang1(){
        System.out.print("Chức năng 1 là\n");
        }
        public static void chucnang2(){
        System.out.print("Chức năng 2 là\n");
        }
        public static void chucnang3(){
        System.out.print("Chức năng 3 là\n");
        }
        public static void chucnang4(){
        System.out.print("Chức năng 4 là\n");
        }
        public static void chucnang5(){
        System.out.print("Chức năng 5 là\n");
        }
        public static void chucnang6(){
        System.out.print("Chức năng 6 là\n");
        }
        public static void chucnang7(){
        System.out.print("Chức năng 7 là\n");
        }
        public static void chucnang8(){
        System.out.print("Chức năng 8 là\n"); 
        }
        public static void chucnang9(){
        System.out.print("Chức năng 9 là\n");
        } 
}

       

