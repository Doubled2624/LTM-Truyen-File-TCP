<h2 align="center">
    <a href="https://dainam.edu.vn/vi/khoa-cong-nghe-thong-tin">
    🎓 Faculty of Information Technology (DaiNam University)
    </a>
</h2>
<h2 align="center">
   TRUYEN FILE TCP
</h2>
<div align="center">
    <p align="center">
        <img src="docs/aiotlab_logo.png" alt="AIoTLab Logo" width="170"/>
        <img src="docs/fitdnu_logo.png" alt="AIoTLab Logo" width="180"/>
        <img src="docs/dnu_logo.png" alt="DaiNam University Logo" width="200"/>
    </p>

[![AIoTLab](https://img.shields.io/badge/AIoTLab-green?style=for-the-badge)](https://www.facebook.com/DNUAIoTLab)
[![Faculty of Information Technology](https://img.shields.io/badge/Faculty%20of%20Information%20Technology-blue?style=for-the-badge)](https://dainam.edu.vn/vi/khoa-cong-nghe-thong-tin)
[![DaiNam University](https://img.shields.io/badge/DaiNam%20University-orange?style=for-the-badge)](https://dainam.edu.vn)

</div>

1. Giới thiệu hệ thống

Hệ thống truyền file bằng TCP được xây dựng nhằm mục đích cho phép người dùng gửi và nhận file giữa máy khách (Client) và máy chủ (Server) thông qua giao thức TCP. Với cơ chế kết nối đáng tin cậy (reliable connection), TCP đảm bảo dữ liệu được truyền đi đầy đủ, theo đúng thứ tự và không bị mất mát.
Ứng dụng này mô phỏng hoạt động của các dịch vụ thực tế như FTP hoặc HTTP trong việc truyền tải dữ liệu, đồng thời giúp người dùng hiểu rõ hơn về cách thức giao tiếp mạng qua socket lập trình.

2. Ngôn ngữ & Công nghệ chính

Ngôn ngữ lập trình: Python / Java / C (tùy phiên bản triển khai)

Công nghệ chính:

Socket Programming (lập trình socket)

Giao thức TCP/IP

Xử lý đa luồng (Multi-threading) để hỗ trợ nhiều client cùng lúc

Hệ thống File I/O để đọc/ghi dữ liệu

3. Hình ảnh các chức năng

Giao diện dòng lệnh (CLI) của Client gửi yêu cầu đến Server

Màn hình Server hiển thị trạng thái kết nối và tiến trình truyền file

Thông báo hoàn tất quá trình gửi/nhận file
(Có thể chèn ảnh chụp màn hình kết quả chạy chương trình tại đây)

🚀 4. Các project đã thực hiện dựa trên Platform

Ứng dụng truyền file đơn giản: Client gửi một file bất kỳ đến Server.

Hệ thống truyền file nhiều client: Cho phép nhiều người dùng kết nối đến cùng một Server và truyền file song song.

Mở rộng tính năng:

Hỗ trợ truyền nhiều loại file (ảnh, văn bản, PDF, nhạc, video).

Giao diện người dùng cơ bản (GUI) để thao tác dễ dàng hơn.

Tích hợp cơ chế mã hóa để tăng tính bảo mật.

5. Các bước cài đặt

Chuẩn bị môi trường

Cài đặt Python/Java/C (tùy ngôn ngữ sử dụng).

Cài đặt công cụ lập trình: VS Code, PyCharm hoặc IntelliJ.

Đảm bảo máy có hỗ trợ TCP/IP (mặc định trên mọi hệ điều hành).

Tải mã nguồn

Clone hoặc tải project từ GitHub / thư mục đã cung cấp.

Giải nén project (nếu ở dạng .zip).

Cấu hình hệ thống

Mở file cấu hình (nếu có) để thiết lập:

Địa chỉ IP Server.

Port truyền file.

Thư mục lưu trữ file nhận được.

Chạy chương trình Server

Trên máy chủ, mở terminal/cmd và chạy:

python server.py


hoặc tương ứng với ngôn ngữ bạn dùng.

Server sẽ khởi động và lắng nghe các kết nối đến từ Client.

Chạy chương trình Client

Trên máy Client, mở terminal/cmd và chạy:

python client.py


Nhập đường dẫn file cần gửi → Client sẽ kết nối tới Server qua TCP và truyền file.

Kiểm tra kết quả

Kiểm tra thư mục lưu file tại Server để đảm bảo file đã được truyền thành công.

Đối chiếu dung lượng và nội dung file để xác nhận tính toàn vẹn dữ liệu.

📌 *Lưu ý: Có thể tùy chỉnh tên database, tài khoản admin, giao diện theo nhu cầu.*
