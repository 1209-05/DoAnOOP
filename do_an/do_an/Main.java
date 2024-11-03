package do_an;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try ( // Sử dụng try-with-resources để tự động đóng Scanner sau khi khối try kết thúc
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap So Luong tat ca San Pham trong cua hang: ");
            int sizeProduct = scanner.nextInt();
            System.out.print("Nhap So Luong Tat Ca Khach Hang Cua Hang: ");
            int sizeCustomer = scanner.nextInt();
            SupermarketManager productManager = new SupermarketManager(sizeProduct, sizeCustomer);
            int choice;

            do {
                System.out.println("\n--- Mini Supermarket Management ---");
                System.out.println("1. Xem San Pham");
                System.out.println("2. Them San Pham");
                System.out.println("3. Cap nhat San Pham");
                System.out.println("4. Xoa San Pham");
                System.out.println("5. Tim kiem San Pham");
                System.out.println("6. Thêm khách hàng");
                System.out.println("7. Xem khách hàng");
                System.out.println("8. Cap Nhat Khach Hang");
                System.out.println("9. Xoa Khach Hang");
                System.out.println("10. Tim Kiem Khach Hang");
                System.out.println("11. Tai danh sach file khach hang");
                System.out.println("12. Ghi danh sach khach hang vào file");
                System.out.println("0. Thoat");
                
                System.out.print("Lua chon cua ban: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Đọc bỏ dòng trống

                switch (choice) {
                    case 1 -> // Xem sản phẩm
                        productManager.viewProducts();
                    case 2 -> {
                        // Thêm sản phẩm
                        System.out.print("ID San Pham: ");
                        String id = scanner.nextLine();
                        System.out.print("Ten San Pham: ");
                        String name = scanner.nextLine();
                        System.out.print("Gia San Pham: ");
                        double price = scanner.nextDouble();
                        System.out.print("So luong San Pham: ");
                        int quantity = scanner.nextInt();
                        Product product = new Product(id, name, price, quantity);
                        productManager.addProduct(product);
                    }
                    case 3 -> {
                        // Sửa sản phẩm
                        System.out.print("Hay nhap ID San Pham can sua doi: ");
                        String updateId = scanner.nextLine();
                        productManager.updateProduct(updateId);
                    }
                    case 4 -> {
                        // Xóa sản phẩm
                        System.out.print("Nhap ID San Pham can xoa: ");
                        String deleteId = scanner.nextLine();
                        productManager.deleteProduct(deleteId);
                    }
                    case 5 -> {
                        // Tìm kiếm sản phẩm
                        System.out.print("Nhap ten San Pham can tim: ");
                        String searchName = scanner.nextLine();
                        productManager.searchProduct(searchName);
                    }
                    case 6 -> {
                        // Thêm khách hàng
                    System.out.print("Chon loai khach hang (1: Thuong, 2: VIP, 3: Trung thanh): ");
                    int customerType = scanner.nextInt();
                    scanner.nextLine(); // Bỏ qua dòng trống
                    System.out.print("Nhap ID Khach Hang: ");
                    String customerId = scanner.nextLine();
                    System.out.print("Nhap ten Khach Hang: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Nhap SDT Khach Hang: ");
                    String customerPhone = scanner.nextLine();
                    System.out.print("Nhap so luong san pham khach hang co the mua: ");
                    int maxProducts = scanner.nextInt();
                    scanner.nextLine();

                    Customer customer;
                    switch (customerType) {
                        case 1 -> // Khách hàng thường
                            customer = new Customer(customerName, customerPhone, customerId, maxProducts);
                        case 2 -> {
                            // Khách hàng VIP
                            System.out.print("Nhap cap do VIP cua khach hang: ");
                            String vipLevel = scanner.nextLine();
                            customer = new VipCustomer(customerName, customerPhone, customerId, maxProducts, vipLevel);
                        }
                        case 3 -> {
                            // Khách hàng trung thành
                            System.out.print("Nhap ti le giam gia cua khach hang trung thanh (%): ");
                            double discountRate = scanner.nextDouble();
                            scanner.nextLine();
                            customer = new LoyalCustomer(customerName, customerPhone, customerId, maxProducts, discountRate);
                        }
                        default -> {
                            System.out.println("Loai khach hang khong hop le, mac dinh la khach hang thuong.");
                            customer = new Customer(customerName, customerPhone, customerId, maxProducts);
                        }
                    }
                    // Thêm khách hàng vào quản lý
                        productManager.addCustomer(customer);
                    }
                    case 7 -> // Xem khách hàng
                        productManager.viewCustomers();
                    case 8 -> {
                        // Sửa khách hàng
                        System.out.print("Nhap ID Khach Hang can sua: ");
                        String ID = scanner.nextLine();
                        System.out.print("Cap nhat ID: ");
                        String updateCustomerId = scanner.nextLine();
                        System.out.println("Cap nhat lai ten khach hang: ");
                        String updateCustomername = scanner.nextLine();
                        System.out.println("Cap nhat lai sdt khach hang: ");
                        String updateNumberPhone = scanner.nextLine();
                        System.out.println("Cap nhat lai so luong mua san pham khach hang: ");
                        int updateCustomerbought = scanner.nextInt();
                        scanner.nextLine();
                        productManager.updateCustomer(ID, updateCustomerId, updateCustomername,updateNumberPhone,updateCustomerbought);
                    }
                    case 9 -> {
                        // Xóa khách hàng
                        System.out.print("Nhap ten Khach Hang can xoa: ");
                        String deleteCustomername = scanner.nextLine();
                        productManager.deleteCustomer(deleteCustomername);
                    }
                    case 10 -> {
                        // Tìm kiếm khách hàng
                        System.out.print("Nhap ten Khach Hang can tim: ");
                        String searchCustomerName = scanner.nextLine();
                        productManager.searchCustomer(searchCustomerName);
                    }
                    case 11 ->{
                        try {
                            try (BufferedReader br = new BufferedReader(new FileReader("customer.txt"))) {
                                String line=br.readLine();
                                while (line!=null) {
                                    String[] data= line.split(",");
                                    int customerType=Integer.parseInt(data[0]);
                                    String CustomerId= data[1];
                                    String CustomerName= data[2];
                                    String Customersdt= data[3];
                                    int maxProducts= Integer.parseInt(data[4]);
                                    Customer customer = null;
                                    if(customerType==1){
                                        customer =new Customer(CustomerId, CustomerName, Customersdt, maxProducts);
                                    }
                                    else if(customerType==2){
                                        String levelvip=data[5];
                                        customer= new VipCustomer(CustomerId, CustomerName, Customersdt, maxProducts,levelvip);
                                    }
                                    else if(customerType==3){
                                        double discount= Double.parseDouble(data[5]);
                                        customer= new LoyalCustomer(CustomerId, CustomerName, Customersdt, maxProducts,discount);
                                    }
                                    
                                    
                                    productManager.addCustomer(customer);  
                                }
                            }
                        }
                         
                        catch (IOException | NumberFormatException e) {}
                        
                    }
                    case 12->{
                        try {
                            BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));
                                String line;
                                 bw.write(line);

                        } catch (Exception e) {
                        }

                    }
                    case 0 -> // Thoát chương trình
                        System.out.println("Exiting...");
                    default -> System.out.println("Vui long nhap lua chon cua ban!");
                }
            } while (choice != 0);
        }
        }
       
    }  // Scanner sẽ tự động được đóng sau khi khối try kết thúc
    

