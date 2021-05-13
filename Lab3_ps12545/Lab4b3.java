import java.util.Scanner;
public class Lab4b3 {
    public static void main(String[]agrs){
        Scanner d=new Scanner(System.in); 
        // Sắp xếp mảng
        System.out.println("Xin mời nhập số mảng: ");
        int n=d.nextInt();
        System.out.print("Nhập các phần tử của mảng: \n");
        int []x= new int[n];
        for(int i=0;i<x.length;i++){
           System.out.println("a["+i+"]=");
           x[i]=d.nextInt(); 
        }
        System.out.print("Mảng trước khi sắp xếp:\n");
        for(int i=0;i<x.length;i++){
           System.out.print("\t" + x[i]);
        }
        System.out.print("\nMảng sau khi sắp xếp:\n");
        for(int i=0;i<x.length;i++){
            for(int j=i;j<x.length;j++){
                if(x[i]>x[j]){
                int tam=x[i];
                x[i]=x[j];
                x[j]=tam;   
                }
            }
            System.out.print("\t"+x[i]);
        }
        //Tìm giá trị nhỏ nhất, lớn nhất trong mảng
        int numbers[]=new int[n];
        int min=x[0];
        int max=x[0];
        for(int i=0;i<x.length;i++){
            if(x[i]<min){
                min= x[i];
            }
            if(x[i]>max){
                max= x[i];
            }
        }
        System.out.println("\nGiá trị nhỏ nhất trong mảng là:\n" +min);
        System.out.println("Giá trị lớn nhất trong mảng là:\n" +max);
        //Trung bình cộng các phần tử chia hết cho 3
        int sum=0;
        int dem=0;
        for(int i=0;i<x.length;i++){
            if(x[i]%3==0){
                sum=sum+x[i];
                dem++;
            }   
        }
        System.out.println("TB CỘNG ="+(float) sum/dem ); 
    }
}

        


