use furamaresort;

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.

SELECT * FROM nhanvien;

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.

SELECT * FROM khachhang WHERE (DiaChi IN ('ThanhHoa','QuangTri')) AND (YEAR(curdate()) - YEAR(NgaySinh) BETWEEN 18 AND 50);

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.

SELECT kh.HoTen, lk.TenLoaiKhach, COUNT(hd.IDKhachHang) FROM hopdong hd 
JOIN khachhang kh on hd.IDKhachHang = kh.IDKhachHang
JOIN loaikhach lk ON kh.IDLoaiKhach = lk.IDLoaiKhach
WHERE lk.TenLoaiKhach = 'Diamond'
GROUP BY kh.HoTen
ORDER BY COUNT(hd.IDKhachHang);

-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem)
--  cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

SELECT kh.IDKhachHang, kh.HoTen, lk.TenLoaiKhach, hd.IDHopDong, dv.TenDichVu, hd.NgayLamHopDong, hd.NgayKetThuc, SUM(dv.ChiPhiThue + hdct.SoLuong * dvdk.Gia) as 'TongTien'  FROM khachhang kh 
LEFT JOIN loaikhach lk ON kh.IDLoaiKhach = lk.IDLoaiKhach
LEFT JOIN hopdong hd ON kh.IDKhachHang = hd.IDKhachHang
LEFT JOIN dichvu dv ON hd.IDDichVu = dv.IDDichVu 
LEFT JOIN hopdongchitiet hdct ON hd.IDHopDong = hdct.IDHopDong
LEFT JOIN dichvudikem dvdk ON hdct.IDDichVuDiKem = dvdk.IDDichVuDiKem
GROUP BY hd.IDHopDong

