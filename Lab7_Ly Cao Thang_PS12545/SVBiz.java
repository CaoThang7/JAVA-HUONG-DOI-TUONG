
public class SVBiz extends sinhvien {
    double sales;
    double marketing;
    @Override
    public double getDiem() {
        return (2*marketing+sales)/3;
    }
    
}
