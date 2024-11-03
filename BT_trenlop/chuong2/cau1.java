package BT_trenlop.chuong2;
import java.util.Scanner;
public class cau1 {
   private int x;
   private  int y;
        cau1(){
                this.x=0;
                this.y=0;
        }
        cau1(int x,int y){
            this.x=x;
            this.y=y;
        }
    public void nhap(Scanner scanner){
       
        System.out.print("Nhap toa do x: ");
        this.x= scanner.nextInt();
        System.out.print("nhap toa do y: ");
            this.y=scanner.nextInt();
            
        }

            public void dichuyendiem(Scanner scanner){
                
                System.out.print("nhap x': ");
                        int dx= scanner.nextInt();
              System.out.print("nhap y': ");
                        int dy= scanner.nextInt();
                 
                    this.x +=dx;
                    this.y +=dy;

            }



    public void xuat(){
         System.out.println("Toa do diem: (" + this.x + ", " + this.y + ")");
    }    



    

public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);

    cau1 toa_do1=new cau1();
    toa_do1.nhap(scanner);
      toa_do1.dichuyendiem(scanner);
      System.out.println("toa do 1 sau khi di chuyen: ");
      toa_do1.xuat();
        cau1 toa_do2=new cau1(1,2);
        System.out.println("toa do 2 sau khi di chuyen: ");
        toa_do2.dichuyendiem(scanner);
        toa_do2.xuat();
        scanner.close();
      

}


}
