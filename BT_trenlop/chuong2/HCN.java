
 package BT_trenlop.chuong2;

import java.util.Scanner;

class HCN {
private double dai;
private double rong;

HCN(){


}
HCN(float x,float y){
    this.dai=x;
    this.rong=y;

}
public void nhap(){
    Scanner scanner= new Scanner(System.in);
     this.dai= scanner.nextFloat();
    this.rong=scanner.nextFloat();
    scanner.close();
}


public void xuat(){
 System.out.println("dien tich hcn: "+(dai*rong));
 System.out.println("chu vi hcn: "+((dai+rong)*2));
}



public static void main(String[] args) {
    
    HCN hcn1= new HCN(1,1);
    hcn1.nhap();
    System.out.println("dien tich va chu vi hcn 1 la: ");
    hcn1.xuat();

    HCN hcn2=new HCN(2,3);
    System.out.println("dien tich va chu vi hcn 2 la: ");
    hcn2.xuat();


}
}