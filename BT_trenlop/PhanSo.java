package BT_trenlop;

public class PhanSo {
    private int tuso;
    private int mauso;

        public PhanSo(int x,int y){
            this.tuso=x;
            if (y == 0) {
                System.out.println("mau so khong the la 0");

            }
            else
            this.mauso = y;
        }
    

        public int getTuso(){

            return tuso;
        }

        public void setTuso(int tuso){

            this.tuso=tuso;
        }
        public int getMauso(){

            return mauso;
        }

        public void setMauso(int mauso){
            if (this.mauso == 0) {
                throw new IllegalArgumentException("Mẫu số không thể là 0.");
            }
            this.mauso = mauso;
        }
          
     public void xuat(){
            System.out.println(this.tuso + "/"+ this.mauso);

     }   

     public void nghichdao(){
        if (this.tuso != 0) {
            int temp = this.tuso;
            this.tuso = this.mauso;
            this.mauso = temp;
        } else {
            System.out.println("Không thể nghịch đảo phân số vì tử số bằng 0.");
        }
        
     }
     public PhanSo tong( PhanSo p){
        int tuSoTong = this.tuso * p.getMauso() + p.getTuso() * this.mauso;
        int mauSoTong = this.mauso * p.getMauso();
        return new PhanSo(tuSoTong, mauSoTong);

     }

        






        public static void main(String[] args) {
             PhanSo ps1 = new PhanSo(1, 2);
        ps1.xuat(); // Xuất phân số

        // Nghịch đảo phân số
        ps1.nghichdao();
        ps1.xuat(); // Xuất phân số sau khi nghịch đảo

        // Tạo một phân số khác 1/3
        PhanSo ps2 = new PhanSo(1, 3);
        ps2.xuat(); // Xuất phân số thứ hai

        // Tính tổng của hai phân số
        PhanSo tongPhanSo = ps1.tong(ps2);
        tongPhanSo.xuat(); // Xuất phân số tổng
    }
}
        

