//  Đếm số dòng trong file

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemSoDongTrongFile {
    public static void main(String[] args) {
        int count = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("dulieu.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                count++;
            }

            reader.close();

            System.out.println("→ Số dòng trong file là: " + count);

        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
