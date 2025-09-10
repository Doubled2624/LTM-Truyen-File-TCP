import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 5000; // cổng lắng nghe
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server đang chờ kết nối...");
            Socket socket = serverSocket.accept();
            System.out.println("Client đã kết nối: " + socket.getInetAddress());

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            // Đọc tên file
            String fileName = dis.readUTF();
            // Đọc kích thước file
            long fileSize = dis.readLong();

            System.out.println("Đang nhận file: " + fileName + " | size = " + fileSize + " bytes");

            FileOutputStream fos = new FileOutputStream("received_" + fileName);
            byte[] buffer = new byte[4096];
            int read;
            long totalRead = 0;

            while (totalRead < fileSize &&
                  (read = dis.read(buffer, 0, (int)Math.min(buffer.length, fileSize - totalRead))) != -1) {
                fos.write(buffer, 0, read);
                totalRead += read;
            }

            fos.close();
            System.out.println("✅ File đã được nhận: received_" + fileName);

            // Gửi phản hồi cho client
            dos.writeUTF("Server đã nhận file thành công!");
            dos.flush();

            dis.close();
            dos.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
