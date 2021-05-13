//tổng
public class Lab8b1 {
    public static void XPoly(double...a){
        double sum=0;
        for(int i=0;i<a.length;i++){
           sum=sum+a[i];
   }
        System.out.print(sum);  
}  
   //in chữ cái đầu in hoa
    public static void toUpperFirstChar(){
       String string="ly cao thang";
       String[]words=string.split("");
       int i = 0;
       char firstChar=words[i].charAt(0);
       char upperFirstChar =String.valueOf(firstChar).toUpperCase().charAt(0);
       words[i]=upperFirstChar + words[i].substring(1);
       String ss=String.join("", words);
       System.out.print(ss);
   }
    public static void main(String[]agrs){
   System.out.print("Tổng:\n");    
   XPoly(1,2,3,4,5);
   System.out.print("\n");
   System.out.print("Max:\n"); 
   XPoly(Math.max(15, 40));
   System.out.print("\n");
   System.out.print("Min:\n"); 
   XPoly(Math.min(15, 40));
   System.out.print("\n");
   System.out.print("In hoa kí tự đầu:\n");
   toUpperFirstChar();
   }   
}

