public class lab3b2 {
    public static void main(String[]args){
        System.out.printf("Bảng cửu chương\n");
        for(int j=1;j<11;j++)
        {
            for(int i=1;i<11;i++) 
                System.out.printf("%d x %d = %d\t",i,j,i*j);
                System.out.print("\n");
        }
    }
}

