// Ghi vào file

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GhiVaoFile {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("ghifile.txt"));
            writer.write("Xin chào!\n");
            writer.write("Đây là nội dung được ghi vào file.\n");
            writer.write("Tạm biệt.");
            writer.close();
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
}
