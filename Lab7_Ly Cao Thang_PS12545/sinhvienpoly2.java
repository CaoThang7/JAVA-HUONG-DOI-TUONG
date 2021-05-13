
public class sinhvienpoly2 extends sinhvienpoly {

    @Override
        public void getdiem() {
            if (diem >=9) {
                System.out.print("Học lục Xuất Sắc");
            } else if ((diem >= 7.5) && (diem < 9)) {
                     System.out.print("Học lục Giỏi");
            } else if ((diem >= 6.5) && (diem < 7.5)) {
                    System.out.print("Học lực Khá");
            } else if ((diem >= 5) && (diem < 6.5)) {
                     System.out.print("Học lực Trung Bình");
            } else {
                   System.out.print("Học lực Yếu");
            }
        
        }
       
    }

               

    

