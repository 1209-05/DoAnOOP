package file;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Writefile {
    public static void main(String[] args) {
        try {
            // Đọc file
            File inputFile = new File("Data.txt");
            Scanner scanner = new Scanner(inputFile);
          
            
            // Ghi file
            PrintWriter writer = new PrintWriter("output.txt");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line); 
                writer.println(line);  // Ghi nội dung đọc được vào file mới
            }
            
            // Đóng Scanner và PrintWriter
            scanner.close();
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại hoặc có lỗi.");
            e.printStackTrace();
        }
    }
}
