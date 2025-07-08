// Đọc và in nội dung file

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DocVaInNoiDungFile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("dulieu.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);  // in từng dòng
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}