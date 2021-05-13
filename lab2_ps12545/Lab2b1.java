
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
public class Lab2b1 {
    public static void main(String[] args){
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
}