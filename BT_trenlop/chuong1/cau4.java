package BT_trenlop.chuong1;
import java.util.Scanner;
import java.lang.Math;
public class cau4 {
    public static boolean check_snt(int number) {
        if(number<2){
          return false;
        }
        else{
            for(int i=2;i<=Math.sqrt(number);i++){
               if(number%i==0)
               return false;
            }
        }
        return true;
    }

public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("nhap so tu nhien: ");
    int N=scanner.nextInt();
    if(check_snt(N))
    System.out.println("la so nguyen to");
    else
    {
        System.out.println("ko la snt");
    }
scanner.close();
}


}
