package do_an;

public class Customer {
    private String hoten;
    private String sdt;
    private String id;
    private final  Product[] boughtProduct;
    private int productCount;

        public Customer(String hoten,String sdt,String id,int Maxproduct){
            this.hoten=hoten;
            this.sdt=sdt;
            this.id=id;
            this.productCount=0;
            this.boughtProduct=new Product[Maxproduct];
        }

        public int getslmua(){
            return productCount;
        }
        public void setslmua(int SLmua){
            this.productCount=SLmua;
        }
        public String getid(){
            return id;
        }
        public void setid(String id){
            this.id=id;
        }
        
        public String getsdt(){
            return sdt;
        }
        public void setsdt(String sdt){
            this.sdt=sdt;
        }
        public String gethoten(){
            return hoten;
        }
        public void sethoten(String hoten){
            this.hoten=hoten;
        }
        public int  boughtProduct(){
            while (productCount<boughtProduct.length) {
                productCount++;  
            }
            return productCount;
        }

       
    
        public String getCustomerDetails() {
            return " ID Khach hang: " + id + ", Ten: " + hoten + ", SDT: " + sdt + ", So luong san pham: " + boughtProduct();
        }
    @Override
    public String toString(){
        return getCustomerDetails();
    }
}
        class VipCustomer extends Customer{
                private String Viplevel;
          
                public VipCustomer(String hoten,String sdt, String id,int Maxproduct,String viplevel){
                    super(hoten, sdt, id, Maxproduct);
                    this.Viplevel=viplevel;
                }

                public String getviplevel(){
                    return Viplevel;
                }
                public void setdiscount(String Viplevel)
                {this.Viplevel=Viplevel;}
                @Override
    public String toString() {
        // Gọi phương thức toString() của lớp Customer để hiển thị thông tin chung
        return super.getCustomerDetails() + ", VIP Level: " + Viplevel;
    }

        }

        class LoyalCustomer extends Customer {
            private double discountRate;
        
            public LoyalCustomer(String hoten, String sdt, String id, int Maxproduct, double discountRate) {
                super(hoten, sdt, id, Maxproduct);
                this.discountRate = discountRate;
            }
        
            public double getDiscountRate() {
                return discountRate;
            }
        
            public void setDiscountRate(double discountRate) {
                this.discountRate = discountRate;
            }
        
            @Override
            public String toString() {
                return super.getCustomerDetails() + ", Discount: " + discountRate  + "%";
            }
        }