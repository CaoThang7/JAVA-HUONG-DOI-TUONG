
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
public class Lab2b2 {
    public static void main(String[]agrs){
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
}


    

