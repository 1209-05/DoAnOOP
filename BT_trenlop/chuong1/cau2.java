package BT_trenlop.chuong1;
import java.util.Scanner;
public class cau2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        int dai= scanner.nextInt();
        System.out.println("nhap chieu rong: ");
        int rong= scanner.nextInt();
        System.out.println("chu vi hcn: "+((dai+rong)*2));
        System.out.println("dien tich hcn: "+(dai*rong));
        scanner.close();
    }
}
