package BT_trenlop.chuong2;
import java.util.Scanner;
import java.lang.Math;
public class cau3 {
  private  double r;
    public void nhap(){
        Scanner scanner= new Scanner(System.in);
        r= scanner.nextFloat();
    scanner.close();
    }

    public void xuat(){
        System.out.println("chu vi: "+(2*Math.PI*r));
        System.out.println(" dt hinh tron: "+(r*r*Math.PI));

    }


    public static void main(String[] args) {
        cau3 hinhtron=new cau3();
        hinhtron.nhap();
        hinhtron.xuat();
    
    }

    
}