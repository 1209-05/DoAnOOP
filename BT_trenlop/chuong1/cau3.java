package BT_trenlop.chuong1;
import java.util.Scanner;
public class cau3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so N: ");
        int number= scanner.nextInt();
        if (number%2==0) {
            System.out.println("N la so chan");
        }        
        else{
            System.out.println("N la so le");
        }
        scanner.close();
    }
}
