import java.util.Scanner;
public class lab1b1 {
    public static void main(String[]agrs)
    {
        Scanner d=new Scanner(System.in);
        System.out.println("Nhập số :");
        int n=d.nextInt();
        boolean oke=true;
        for(int i=2;i<n-1;i++)
        {
           if(n%i==0)
           {
              oke=false;    
           }    
           i++;
        }
        if(oke)
        {
            System.out.println("Là số nguyên tố :"+(n));    
        }else
            System.out.println("Không phải số nguyên tố :"+(n));    
    }
}
