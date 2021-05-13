
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
public class Lab2b3 {
    public static void main(String[]agrs){
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
}
    
