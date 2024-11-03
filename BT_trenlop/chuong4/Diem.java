package BT_trenlop.chuong4;
import java.util.Scanner;
import java.lang.Math;
public class Diem {
         protected   int x;
         protected   int y;

            public Diem(){}

            public Diem(int x,int y){
                this.x=x;
                this.y=y;

            }
        public void setx(int x){
                this.x=x;
        }

        public void sety(int y){
                this.y=y;

        }
        public int getx(){
            return x;

        }
        public int gety(){
            return y;

        }
    public void nhap(Scanner scanner){
       
         x=scanner.nextInt();
         y=scanner.nextInt();
        scanner.nextLine();

    }
    public void xuat() {
        System.out.println("Tọa độ: (" + x + ", " + y + ")");
    }

    
}

class Diemmau extends Diem{
        private String mau;


        public Diemmau(){
            super();
        }

        public Diemmau(int x,int y,String mau){

            super(x,y);
            this.mau=mau;

        }

        public void setmau(String mau){

                this.mau=mau;
        }
        public String getmau(){

            return mau;

        }


        public void nhap(Scanner scanner) {
            super.nhap(scanner);  // Gọi phương thức nhap() của lớp cha để nhập x, y
           
            System.out.print("Nhap mau: ");
            this.mau = scanner.nextLine();
        
        }
        public void xuat() {
            super.xuat();  // Gọi phương thức xuat() của lớp cha để xuất x, y
            System.out.println("Màu: " + mau);
        }
}

    class Doanthang{
        private Diemmau mau1;
        private Diemmau mau2;

        public Doanthang(){
            this.mau1=new Diemmau();
            this.mau2=new Diemmau();

        }
        public Doanthang(Diemmau  mau1,Diemmau mau2){

            this.mau1=mau1;
            this.mau2=mau2;

        }
        public void nhap(Scanner scanner) {
            System.out.println("Nhập điểm màu 1:");
            mau1.nhap(scanner);  // Nhập thông tin cho điểm màu 1
            System.out.println("Nhập điểm màu 2:");
            mau2.nhap(scanner);  // Nhập thông tin cho điểm màu 2
        }
        public void xuat() {
            System.out.println("Thông tin điểm màu 1:");
            mau1.xuat();
            System.out.println("Thông tin điểm màu 2:");
            mau2.xuat();}
        public double tinhKhoangCach() {
            int dx = mau1.getx() - mau2.getx();  // Tính độ chênh lệch x
            int dy = mau1.gety() - mau2.gety();  // Tính độ chênh lệch y
            return Math.sqrt(dx * dx + dy * dy);  // Công thức tính khoảng cách
        }
        public boolean kiemTraCungMau() {
            return mau1.getmau() == mau2.getmau();
        }
    
        // Phương thức xuất kết quả kiểm tra màu
        public void inKetQuaMau() {
            if (kiemTraCungMau()) {
                System.out.println("Hai điểm có cùng màu.");
            } else {
                System.out.println("Hai điểm không cùng màu.");
            }
        }
        public static void main(String[] args) {
            // Tạo đối tượng đoạn thẳng
            Scanner scanner=new Scanner(System.in);
            Doanthang dt = new Doanthang();
            
            // Nhập thông tin cho đoạn thẳng
            dt.nhap(scanner);
            
            // Xuất thông tin đoạn thẳng
            dt.xuat();
            
            // Tính và in khoảng cách giữa hai điểm
            System.out.println("Khoảng cách giữa hai điểm: " + dt.tinhKhoangCach());
            
            // Kiểm tra và in kết quả về màu của hai điểm
            dt.inKetQuaMau();
            scanner.close();
        }
    }