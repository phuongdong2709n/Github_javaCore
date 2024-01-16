package Lab04;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHoaDon {
    //sử dụng để khởi tạo một danh sách mảng trống.
    ArrayList<HoaDonBanhMi> hoadon = new ArrayList<>();
    public void nhapThongTin(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số lượng sản phẩm");
        int soLuongSP=sc.nextInt();
        for (int i=1;i<=soLuongSP;i++){
            sc.nextLine();
            System.out.println("Nhập mã hóa đơn thứ: " +i);
            String MaHoaDon=sc.nextLine();
            System.out.println("Nhập ngày lập hóa đơn: ");
            String NgayLapHoaHon=sc.nextLine();
            System.out.println("nhâp tên khách hàng: ");
            String TenKhachHang=sc.nextLine();
            System.out.println("Nhập địa chỉ khách hàng: ");
            String DiaChi=sc.nextLine();
            System.out.println("Nhập Số lượng bánh cần giao: ");
            int SoLuong=sc.nextInt();
            System.out.println("Nhập giá bán 1 chiếc bánh: ");
            float GiaBan=sc.nextFloat();
            // tạo một đối tượng mới của lớp HoaDonBanhMi là hoadonbanhmi
            HoaDonBanhMi hoadonbanhmi = new HoaDonBanhMi(MaHoaDon,NgayLapHoaHon,TenKhachHang,DiaChi,SoLuong,GiaBan);
            //thêm vào mảng
            hoadon.add(hoadonbanhmi);
        }
    }
    public void hienThi(){
        System.out.println("===== Hóa đơn =====");
        //để duyệt qua từng đối tượng HoaDonBanhMi trong danh sách hoadon
        for (HoaDonBanhMi hd : hoadon) {
            System.out.println("Mã hóa đơn: " +hd.getMaHoaDon());
            System.out.println("Ngày lập hóa đơn: " +hd.getNgayLapHoaHon());
            System.out.println("Tên khách hàng: " +hd.getTenKhachHang());
            System.out.println("Địa chỉ khách hàng: " +hd.getDiaChi());
            System.out.println("Số lượng: " +hd.getSoLuong());
            System.out.println("Giá bán 1 sản phẩm: " +hd.getGiaBan());
            System.out.println("Tổng tiền hàng: " +hd.getTongTienHang());
            System.out.println("Tiền khuyến mại: " +hd.getTienKhuyenMai());
            System.out.println("Tổng tiền thanh toán: " +hd.getTongTienThanhToan());
        }
        System.out.println("================================");

    }
    public void Thoat(){
        System.exit(0);
    }

//    public void tinhTienKmai(int SoLuong, float GiaBan){
//        float  tongTienThanhToan;
//        float tienKhuyenMai;
//        if(SoLuong<10) {
//            tongTienThanhToan= SoLuong*GiaBan;
//            System.out.println("Tổng tiền thanh toàn là: " +tongTienThanhToan);
//
//        }else if(SoLuong>=10 && SoLuong<100){
//            tienKhuyenMai= (float) (GiaBan*0.9);
//            tongTienThanhToan=SoLuong*tienKhuyenMai;
//            System.out.println("Tổng tiền thanh toàn là: " +tongTienThanhToan);
//
//        }else if(SoLuong>=100 ){
//            tienKhuyenMai= (float) (GiaBan*0.8);
//            tongTienThanhToan=SoLuong*tienKhuyenMai;
//            System.out.println("Tổng tiền thanh toàn là: " +tongTienThanhToan);
//
//        }
//    }



}
