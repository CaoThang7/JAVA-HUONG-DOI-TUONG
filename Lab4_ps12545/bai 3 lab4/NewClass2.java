
public class NewClass2 {
   String tenSP;
   double donGia;
   double giamGia;
   
    public NewClass2(String tenSP, double donGia, double giamGia){
      this.tenSP= tenSP;
      this.giamGia= giamGia;
      this.donGia= donGia;
    }
    public NewClass2(String tenSP, double donGia){
        this.tenSP= tenSP;
        this.donGia= donGia;
        
    }
    public String xuatThongTin(){
        return "Tên sản phẩm:"+this.tenSP+"Đơn giá:"+donGia+"Giảm Giá:"+giamGia;
    }
}
