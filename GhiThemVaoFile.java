// Ghi thêm vào file
// Đề bài: Mỗi lần chạy chương trình, thêm 1 dòng "Lần chạy mới lúc: <thời gian>" vào cuối file log.txt.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GhiThemVaoFile {
    public static void main(String[] args) {
        try {
            // Lấy thời gian hiện tại
            LocalDateTime now = LocalDateTime.now();

            // Định dạng theo mẫu bạn muốn
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

            // Định dạng lại thành chuỗi
            String formatted = now.format(formatter);

            BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true));
            writer.write("Lần chạy mới lúc: " + formatted + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
}
