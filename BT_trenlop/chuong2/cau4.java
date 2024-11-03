package BT_trenlop.chuong2;
import java.util.Scanner;
public class cau4 {
    private String masv;
    private String lop;
    private String hoten;
    private float diem1;
    private float diem2;
    private float diem3;

cau4(){

}
cau4(String masv,String lop,String hoten,float diem1, float diem2, float diem3){
    this.masv=masv;
    this.lop=lop;
    this.hoten=hoten;
    this.diem1=diem1;
    this.diem2=diem2;
    this.diem3=diem3;


}

public void nhap(){
Scanner scanner=new Scanner(System.in);
System.out.print("nhap ma sinh vien: ");
    this.masv= scanner.nextLine();
System.out.print("Nhap lop: ");
    this.lop=scanner.nextLine();
System.out.print("nhap ho va ten: ");
    this.hoten=scanner.nextLine();
System.out.print("nhap diem 1: ");
    this.diem1=scanner.nextInt();
System.out.print("nhap diem 2: ");
    this.diem2=scanner.nextInt();
System.out.print("nhap diem 3: ");
    this.diem3=scanner.nextInt();
    scanner.nextLine();
    scanner.close();
}

public float tinh_diemtb(){
    return (this.diem1+this.diem2+this.diem3)/3;

}
public void xeploai(){
float diem_tb=tinh_diemtb();
if(diem_tb<=10 && diem_tb>=0){
if(diem_tb>=8 && diem_tb<10) System.out.println("sinh vien xep loai gioi.");
 if(diem_tb<8 && diem_tb>=6.5) System.out.println("sinh vien xep loai kha.");
  if(diem_tb<6.5 && diem_tb>=5) System.out.println("sinh vien xep loai tb.");
  if(diem_tb<5) System.out.println("sinh vien xep loai yeu.");
}
else{

    System.out.println("loi! nhap lai diem");

}

}
public void xuat(){
    System.out.println("Mã sinh viên: " + this.masv);
    System.out.println("Họ tên: " + this.hoten);
    System.out.println("Lớp: " + this.lop);
    System.out.println("Điểm môn 1: " + this.diem1);
    System.out.println("Điểm môn 2: " + this.diem2);
    System.out.println("Điểm môn 3: " + this.diem3);
    System.out.println("Điểm trung bình: " + tinh_diemtb());


}


public static void main(String[] args) {
    cau4 sinhvien1=new cau4();
    sinhvien1.nhap();
    System.out.println("thong tin sinh vien 1: ");
    sinhvien1.xuat();
    sinhvien1.xeploai();

    cau4 sinhvien2= new cau4("3123411194","DCT123C5","Cao Phuong Nam",10,10,10);
    System.out.println("thong tin sinh vien 2: ");
    sinhvien2.xuat();
    sinhvien2.xeploai();


}

}
