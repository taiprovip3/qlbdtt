-- select* from nhanvien select * from nhacungcap
-- select * from sanpham   delete from sanpham select top 1 * from SanPham order by stt desc
-- select * from hoadon delete from hoadon   alter table sanpham drop column stt
-- select * from phanloai select * from PhanLoai where maPhanLoai = 'PL2'
-- select * from danhsachmonthethao   delete from sanPham where maSanPham = 'SP10'
-- select * from nhanvien
-- update DanhSachMonTheThao set maSanPham = 'SP4', chuyenTheThao = N'Bóng bầu dục' where maSanPham = 'SP3'
-- drop database qlbdtt
-- create database qlbdtt;

--NhanVien table
insert into NhanVien values ('NV1','087663az',0,'0338188506-1',1,'phantantai',N'Phan Tấn Tài',0);
insert into NhanVien values ('NV2','087663az',1,'0338188506-2',2,'admin',N'Admin',0);
--NhaCungCap table
insert into NhaCungCap values ('NCC1',N'Việt Nam','0338188506-2',1,'Công ty Alpha A');
insert into NhaCungCap values ('NCC2',N'Anh','0338188506-3',2,'Công ty Alpha B');
insert into NhaCungCap values ('NCC3',N'Pháp','0338188506-4',3,'Công ty Alpha C');
insert into NhaCungCap values ('NCC4',N'Bỉ','0338188506-5',4,'Công ty Alpha D');
insert into NhaCungCap values ('NCC5',N'Ý','0338188506-6',5,'Công ty Alpha G');
insert into NhaCungCap values ('NCC6',N'Đức','0338188506-7',6,'Công ty Alpha H');
insert into NhaCungCap values ('NCC7',N'Nhật bản','0338188506-8',7,'Công ty Alpha I');
insert into NhaCungCap values ('NCC8',N'Hàn quốc','0338188506-9',8,'Công ty Alpha J');
insert into NhaCungCap values ('NCC9',N'Ấn độ','0338188506-10',9,'Công ty Alpha K');
insert into NhaCungCap values ('NCC10',N'Thái lan','0338188506-11',10,'Công ty Alpha L');
--PhanLoai table delete from PhanLoai   select * from PhanLoai where tenPhanLoai = N'Bán lẽ'
insert into PhanLoai values ('PL1',N'Kệ màu đen',1,N'Bán lẽ');
insert into PhanLoai values ('PL2',N'Kệ màu nâu',2,N'Bán sỉ');
insert into PhanLoai values ('PL3',N'Kệ màu đỏ',3,N'Hàng tặng');
insert into PhanLoai values ('PL4',N'Kệ màu cam',4,N'Đặc biệt');
insert into PhanLoai values ('PL5',N'Kệ màu vàng',5,N'For sale');
insert into PhanLoai values ('PL6',N'Kệ màu lục',6,N'Dễ vỡ');
insert into PhanLoai values ('PL7',N'Kệ màu lam',7,N'Nguy hiểm');
insert into PhanLoai values ('PL8',N'Kệ màu tím',8,N'Thịnh hành');
insert into PhanLoai values ('PL9',N'Kệ màu xám',9,N'Điện tử');
insert into PhanLoai values ('PL10',N'Kệ màu trắng',10,N'Gia công');
--KhachHang table
insert into KhachHang values ('KH1',N'60/122 KP1, Q12',N'Khách Hàng A',N'Thường','0338188506-12',1);
insert into KhachHang values ('KH2',N'60/122 KP2, Q12',N'Khách Hàng B',N'Vip','0338188506-13',2);
insert into KhachHang values ('KH3',N'60/122 KP3, Q12',N'Khách Hàng C',N'Vip','0338188506-14',3);
insert into KhachHang values ('KH4',N'60/122 KP4, Q12',N'Khách Hàng D',N'Thường','0338188506-15',4);
insert into KhachHang values ('KH5',N'60/122 KP5, Q12',N'Khách Hàng E',N'Thường','0338188506-16',5);
insert into KhachHang values ('KH6',N'60/122 KP6, Q12',N'Khách Hàng F',N'Vip','0338188506-17',6);
insert into KhachHang values ('KH7',N'60/122 KP7, Q12',N'Khách Hàng G',N'Thường','0338188506-18',7);
insert into KhachHang values ('KH8',N'60/122 KP8, Q12',N'Khách Hàng H',N'Thường','0338188506-19',8);
insert into KhachHang values ('KH9',N'60/122 KP9, Q12',N'Khách Hàng I',N'Vip','0338188506-20',9);
insert into KhachHang values ('KH10',N'60/122 KP10, Q12',N'Khách Hàng J',N'Thường','0338188506-21',10);
--SanPham table
insert into sanpham values ('SP1',10000,'Mo ta',50,1,'ten san pham','NCC1','PL1');
----DanhSachMonTheThao
--insert into DanhSachMonTheThao values ('SP1',N'Bóng chày');
--insert into DanhSachMonTheThao values ('SP1',N'Bóng đá');
--insert into DanhSachMonTheThao values ('SP1',N'Cầu lông');
--HoaDon table
insert into HoaDon values ('HD1',CURRENT_TIMESTAMP,1,1000000,N'Đã thanh toán','KH1','NV1','SP1');
insert into HoaDon values ('HD2',CURRENT_TIMESTAMP,2,1100000,N'Chưa thanh toán','KH2','NV2','SP1');
insert into HoaDon values ('HD3',CURRENT_TIMESTAMP,3,1200000,N'Đã thanh toán','KH3','NV1','SP1');
insert into HoaDon values ('HD4',CURRENT_TIMESTAMP,4,1300000,N'Đã thanh toán','KH4','NV1','SP1');
insert into HoaDon values ('HD5',CURRENT_TIMESTAMP,5,1400000,N'Đã thanh toán','KH5','NV1','SP1');
insert into HoaDon values ('HD6',CURRENT_TIMESTAMP,6,1500000,N'Chưa thanh toán','KH6','NV2','SP1');
insert into HoaDon values ('HD7',CURRENT_TIMESTAMP,7,1600000,N'Đã thanh toán','KH7','NV2','SP1');
insert into HoaDon values ('HD8',CURRENT_TIMESTAMP,8,1700000,N'Đã thanh toán','KH8','NV2','SP1');
insert into HoaDon values ('HD9',CURRENT_TIMESTAMP,9,1800000,N'Chưa thanh toán','KH9','NV1','SP1');
insert into HoaDon values ('HD10',CURRENT_TIMESTAMP,10,1900000,N'Đã thanh toán','KH10','NV1','SP1');