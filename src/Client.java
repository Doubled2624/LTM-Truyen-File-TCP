import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String serverIP = "localhost"; // hoặc IP server
        int port = 5000;

        try (Socket socket = new Socket(serverIP, port)) {
            // Tạo file test.txt để gửi
            File file = new File("test.txt");
            if (!file.exists()) {
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write("Xin chào Server!\nĐây là file test từ Client.\n");
                }
                System.out.println("Đã tạo file test.txt để gửi.");
            }

            FileInputStream fis = new FileInputStream(file);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            // Gửi tên file
            dos.writeUTF(file.getName());
            dos.flush();

            // Gửi kích thước file
            dos.writeLong(file.length());
            dos.flush();

            // Gửi dữ liệu file
            byte[] buffer = new byte[4096];
            int read;
            while ((read = fis.read(buffer)) > 0) {
                dos.write(buffer, 0, read);
            }

            dos.flush();
            System.out.println("📤 File đã được gửi: " + file.getName());

            // Nhận phản hồi từ server
            String response = dis.readUTF();
            System.out.println("📥 Server: " + response);

            fis.close();
            dos.close();
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
