public class hinhchunhat {
    int cd;
    int cr;
public hinhchunhat(){
    int cd=7;
    int cr=5;
}
public hinhchunhat(int x){
    this.cd=x;
    this.cr=x;
}
public hinhchunhat(int cd,int cr){
    this.cd=cd;
    this.cr=cr;
}
public int tinhDT(){
    return cd*cr;
}
public int tinhCV(){
    return (cd+cr)*2;
}
public String xuatTT(){
    return "CD là:" + cd + "CR là:" + cr +"Diện tích là:" + tinhDT() + "Chu vi là:" + tinhCV() ;
    
}
public String xuatTT2(){
    return "CD là:" + cd + "CR là:" + cr +"Diện tích là:" + tinhDT() ;
}
}
