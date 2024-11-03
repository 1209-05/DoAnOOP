package do_an;
import java.util.Scanner;
public class SupermarketManager {
    private final Product[] productList;
    private int productCount;
    private final Customer[] customerList;
    private int customerCount;
      Scanner scanner=new Scanner(System.in);

    // Khởi tạo ProductManager với kích thước mảng
   
    public SupermarketManager(int sizeProduct,int sizeCustomer  ) {
        this.productList = new Product[sizeProduct];
        this.productCount = 0;
        this.customerList=new Customer[sizeCustomer];
        this.customerCount=0;
    }


    // 1. Xem danh sách sản phẩm
    public void viewProducts() {
        if (productCount == 0) {
            System.out.println("No products found.");
        } else {
            for (int i = 0; i < productCount; i++) {
                System.out.println(productList[i]);
            }
        }
    }

    // 2. Thêm sản phẩm mới
    public void addProduct(Product product) {
        if (productCount < productList.length) {
            productList[productCount] = product;
            productCount++;
            System.out.println("Product added successfully!");
        } else {
            System.out.println("Product list is full!");
        }
    }

     // 3. Sửa thông tin sản phẩm
     public void updateProduct(String id) {
       
        for (int i = 0; i < productCount; i++) {
            if (productList[i].getid().equals(id)) {
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new price: ");
                double newPrice = scanner.nextDouble();
                System.out.print("Enter new quantity: ");
                int newQuantity = scanner.nextInt();
                scanner.nextLine(); // Đọc dòng còn lại

                productList[i].setName(newName);
                productList[i].setPrice(newPrice);
                productList[i].setQuantity(newQuantity);
                System.out.println("Product updated successfully!");
                return;
            }
        }
        System.out.println("Product not found!");
    }

    // 4. Xóa sản phẩm
    public void deleteProduct(String id) {
        for (int i = 0; i < productCount; i++) {
            if (productList[i].getid().equals(id)) {
                // Di chuyển các phần tử sau phần tử cần xóa lên một vị trí
                for (int j = i; j < productCount - 1; j++) {
                    productList[j] = productList[j + 1];
                }
                productList[productCount - 1] = null;  // Loại bỏ phần tử cuối
                productCount--;  // Giảm số lượng sản phẩm
                System.out.println("Product deleted successfully!");
                return;
            }
        }
        System.out.println("Product not found!");
    }

    // 5. Tìm kiếm sản phẩm theo tên
    public void searchProduct(String name) {
        boolean found = false;
        for (int i = 0; i < productCount; i++) {
            if (productList[i].getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(productList[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found with the given name.");
        }
    }
        // 6. Thêm khách hàng mới
    public void addCustomer(Customer customer) {
        if (customerCount < customerList.length) {
            customerList[customerCount] = customer;
            customerCount++;
            System.out.println("Customer added successfully!");
        } else {
            System.out.println("Customer list is full!");
        }
    }

    // 7. Xem danh sách khách hàng
    public void viewCustomers() {
        if (customerCount == 0) {
            System.out.println("No customers found.");
        } else {
            for (int i = 0; i < customerCount; i++) {
                System.out.println(customerList[i]);
            }
        }
    }

    // 8. Cập nhật thông tin khách hàng
    public void updateCustomer( String id,String newid, String newName,String newsdt,int newSL) {
        for (int i = 0; i < customerCount; i++) {
            if (customerList[i].getid().equals(id)) {
                customerList[i].sethoten(newName);
                customerList[i].setid(newid);
                customerList[i].setsdt(newsdt);
                customerList[i].setslmua(newSL);
                System.out.println("Customer updated successfully!");
                return;
            }
        }
        System.out.println("Customer not found!");
    }

    // 9. Xóa khách hàng
    public void deleteCustomer(String Name) {
        for (int i = 0; i < customerCount; i++) {
            if (customerList[i].gethoten().equals(Name)) {
                for (int j = i; j < customerCount - 1; j++) {
                    customerList[j] = customerList[j + 1];                      
                }
                customerList[customerCount - 1] = null;
                customerCount--;
                System.out.println("Customer deleted successfully!");
                return;
            }
        }
        System.out.println("Customer not found!");
    }


    //10. Tìm kiếm khách hàng theo tên 
    public void searchCustomer(String keyword) {
        boolean found = false;
        for (int i = 0; i < customerCount; i++) {
            if (customerList[i].gethoten().toLowerCase().equals(keyword)) {
               System.out.println(customerList[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay ten Khach Hang hop le: " + keyword);
        }
    }

   
    
}


