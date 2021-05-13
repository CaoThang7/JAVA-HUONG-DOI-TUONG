
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class Lab2b4 {
    
    //------------------------------------- Code Pt bậc 1 
    public static void ptbac1(){
         Scanner d=new Scanner(System.in);
        System.out.println("Nhap a=");
        int a=d.nextInt();
        System.out.println("Nhap b=");
        int b=d.nextInt();
    if(a==0){
        if(b==0){
            System.out.println("Phương trình vô số nghiệm");
                
            }
    else{
            System.out.println("Phương trình vô nghiệm");
                
        }   
            }
    else{
            System.out.println("Phương trình có nghiệm x= "+(-b/a));

        }
    }
    //-------------------------------------- Code Pt bậc 2  
    public static void ptbac2(){
            Scanner t=new Scanner(System.in);
        System.out.println("nhap a:");
        float a=t.nextFloat();
        System.out.println("Nhap b:");
        float b=t.nextFloat();
        System.out.println("Nhap c:");
        float c=t.nextFloat();
        if(a==0){ //PT bậc 1
            System.out.println("Phương trình bậc 1 có nghiệm ="+(-c/b));   
        }
        else{ //PT bậc 2
            float d=(float)(b*b)-4*a*c;
        if(d<0){
            System.out.println("Pt vô nghiệm vì ="+(d));
        }
        else if(d==0){
            System.out.println("Pt có nghiệm kép x="+(-b/(2*a)));
        }
        else{
            System.out.println("Pt có 2 nghiệm X1="+((-b-Math.sqrt(d))/(2*a)));
            System.out.println("Pt có 2 nghiệm X2="+((-b-Math.sqrt(d))/(2*a)));
        }
        }
    }
    //-------------------------------------- Code tiền điện
    public static void tiendien(){
             Scanner t=new Scanner(System.in);
        System.out.println("Số kWh điện đã sử dụng:");
        float soDien=t.nextFloat();
        if(soDien<50){
           float tien=soDien*1000;
            System.out.println("Số tiền điện phải trả VND:"+(tien));
                     }
        else{
           float tien2=50*1000+(soDien-50)*1200;
            System.out.println("Số tiền điện phải trả VND:"+(tien2)); 
            }
    }
    public static void main(String[]agrs){
        Scanner t=new Scanner(System.in);
        System.out.println(">>>----- MENU CHƯƠNG TRÌNH ----<<<");
        System.out.println("+++----------------------------+++");
        System.out.println(" | 1.Giải phương trình bậc nhất |");
        System.out.println(" | 2.Giải phương trình bậc hai  |");
        System.out.println(" | 3.Tính tiền điện             |");
        System.out.println("+++----------------------------+++");
        System.out.println("xin mời chọn chức năng:");
        int nhap=t.nextInt();
        switch(nhap){
            case 1:ptbac1();break;
            case 2:ptbac2();break;
            case 3:tiendien();break;
            default: System.out.println("Xin mời chọn lại MENU");break;
        }     
   
}
}
        
        
    
