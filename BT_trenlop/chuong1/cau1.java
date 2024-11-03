package BT_trenlop.chuong1;
import java.util.Scanner;
public class cau1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap lan luot hai so nguyen to: ");
            int number1= scanner.nextInt();
            int number2= scanner.nextInt();
            
            System.out.println("tong: "+(number1+number2));
            System.out.println("hieu: "+(number1-number2));
            System.out.println("thuong: "+((float)number1/number2));
            System.out.println("tich: "+(number1*number2));
        }
    }
}
