import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Assignmentgd2 {
    static ArrayList<nhanvien> ds=new ArrayList<nhanvien>();
    static Scanner a=new Scanner(System.in);
    static nhanvien SV=new nhanvien();
    static nhanvien SV2=new nhanvien();
    static nhanvien SV3=new nhanvien();
    static nhanvien SV4=new nhanvien();
    static nhanvien SV5=new nhanvien();
    static nhanvien NV=new nhanvien();
    static TiepThi TT=new TiepThi ();
    static Truongphong TP=new Truongphong();
        public static void main(String[]agrs){   
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
        
        //Code từng chức năng
        //Code Chức năng 1
        public static void chucnang1() {
            a.nextLine();
            System.out.print("********************^^***********************\n");
            System.out.print("|   CÁC THÀNH VIÊN TRONG CÔNG TY RỒNG VIỆT  |\n");
            System.out.print(">>------------------@@----------------------<<\n");
            System.out.print("\nChức năng 1: Nhập danh sách nhân viên\n");
            do{
            System.out.print(" 5 nhân viên thường:\n");
            System.out.print("Nhân viên thứ 1:\n");
            SV.getThuNhap();
            SV.getthueThuNhap();
            SV.nhap();
            ds.add(SV);
            System.out.print("Nhân viên thứ 2:\n");
            SV2.getThuNhap();
            SV2.getthueThuNhap();
            SV2.nhap();
            ds.add(SV2);
            System.out.print("Nhân viên thứ 3:\n");
            SV3.getThuNhap();
            SV3.getthueThuNhap();
            SV3.nhap();
            ds.add(SV3);
            System.out.print("Nhân viên Tiếp Thị:\n");
            TT.nhap();
            TT.nhap2();
            TT.getThuNhap();
            ds.add(TT);
            System.out.print("Trưởng Phòng Kinh Doanh:\n");
            TP.getThuNhap();
            TP.nhap();
            TP.nhap2();
            ds.add(TP);
            System.out.print("Sửa thông tin? (Yes/No)");
            String tl=a.nextLine();
            if(tl.equals("No"))
            break;
            }while(true);    
        }
        //Code Chức năng 2
        public static void chucnang2(){ 
            a.nextLine();
            System.out.print("Chức năng 2:Xuất danh sách nhân viên\n");
                for(int i=0;i<ds.size();i++){    
                    System.out.print(ds.get(i).xuatTT()+"\n");
                }
        }
        // Code Chức năng 3
        public static void chucnang3(){
            a.nextLine();
            System.out.print("Chức năng 3:Tìm kiếm nhân viên\n");
            System.out.print("Nhập mã nhân viên cần tìm:");
            String ma=a.nextLine();
            for(int i=0;i<ds.size();i++){
                if(ds.get(i).manv.equalsIgnoreCase(ma))
                {
                    System.out.print("Thông tin nhân viên cần tìm:\n");
                    System.out.println(ds.get(i).xuatTT());
                }else{
                }
            }
        }
        //Code Chức năng 4
        public static void chucnang4(){
            a.nextLine();
            System.out.print("Chức năng 4:Xoá thông tin nhân viên\n");
            System.out.print("Nhập mã nhân viên cần xoá:");
            String ma=a.nextLine();
            int indexcanxoa=-1;
            for(int i=0;i<ds.size();i++){
                if(ds.get(i).manv.equalsIgnoreCase(ma))
                {
                     indexcanxoa=i;
                }
            }
            ds.remove(indexcanxoa);
        }
        //Code Chức năng 5
        public static void chucnang5(){
            a.nextLine();
            System.out.print("Chức năng 5:Cập nhật thông tin nhân viên\n");
            boolean isSearch =false;
            System.out.print("Xin mời nhập mã:");
            String maNV=a.nextLine();
                for(int i=0;i<ds.size();i++){
                    if(ds.get(i).manv.equalsIgnoreCase(maNV)){
                        isSearch=true;
                        System.out.println("Tìm thấy nv có mã:" + ds.get(i).manv);
                        System.out.println("Mời bạn nhập thông tin mới:");
                        nhanvien x=ds.get(i);
                        x.nhap();
                        ds.remove(i);
                        ds.add(i,x);
                        break;
                    }
                }
                    if(!isSearch){
                        System.out.print("Không tìm thấy kết quả\n");
                     }
        }      
        //Code Chức năng 6
        public static void chucnang6(){
            a.nextLine();
            System.out.print("Chức năng 6:Tìm nhân viên theo khoản lương\n");
            System.out.print("Nhập lương đầu:");
            double dau=a.nextDouble();
            System.out.print("Nhập lương cuối:");
            double cuoi=a.nextDouble();
            int soluong=0;
                for(int i=0;i<ds.size();i++){
                    if(ds.get(i).luong>dau && ds.get(i).luong<cuoi)
                {   
                        soluong++;
                        System.out.print("Tìm thấy số lượng nhân viên thoả khoản lương:\n"+soluong);
                        System.out.println(ds.get(i).xuatTT());
                    }else{
                         System.out.print("Không tìm thấy kết quả\n");
               
                    }

                }
        }
        //Code Code Chức năng 7
        public static void chucnang7(){
            System.out.print("Chức năng 7:Sắp xếp nhân viên theo họ tên\n");
            Comparator<nhanvien> comparator=new Comparator<nhanvien>() {
            @Override
            public int compare(nhanvien o1, nhanvien o2) {
                return o1.ten.compareTo(o2.ten);
               
            }
        };
        Collections.sort(ds,comparator);
        chucnang2();
        }
        //Code Chức năng 8
        public static void chucnang8(){
        System.out.print("Chức năng 8:Sắp xếp nhân viên theo lương tăng dần:\n");
         Comparator<nhanvien> comparator=new Comparator<nhanvien>() {
            @Override
            public int compare(nhanvien o1, nhanvien o2) {
                return (int)(o1.luong-o2.luong);
               
            }
        };
        Collections.sort(ds,comparator);
        chucnang2();
      
        }
        //Code Chức năng 9
        public static void chucnang9(){
        System.out.print("Chức năng 9:Xuất nhân viên lương cao nhất\n");
        nhanvien svl=ds.get(0);
        for(int i=0;i<ds.size();i++){
            if(svl.luong <ds.get(i).luong){
                svl=ds.get(i);
            }
        }
         System.out.println("Nhân viên có lương cao nhất:"+svl.xuatTT());
        }  
}