package Lab04;

public class HoaDonBanhMi {
    private String MaHoaDon;
    private String NgayLapHoaHon;
    private String TenKhachHang;
    private  String DiaChi;
    private int SoLuong;
    private float GiaBan;
    private float TongTienHang;
    private float TienKhuyenMai;
    private  float TongTienThanhToan;

    //Tham số đầu vào MaHoaDon,NgayLapHoaHon,.....
    public HoaDonBanhMi(String maHoaDon, String ngayLapHoaHon, String tenKhachHang
            , String diaChi, int soLuong, float giaBan) {
        MaHoaDon = maHoaDon;
        NgayLapHoaHon = ngayLapHoaHon;
        TenKhachHang = tenKhachHang;
        DiaChi = diaChi;
        SoLuong = soLuong;
        GiaBan = giaBan;
        //gọi các phương thức khác
        /*
        * để tính toán giá trị cho các thuộc tính khác như tongGiaTriHangHoa, tienKhuyenMai, và tongTienPhaiTra.
        * Các phương thức này thường được sử dụng để tự động cập nhật các giá trị liên quan khi một đối tượng được tạo.
        * */
        tinhTongGiaTriHangHoa();
        TienKmai();
        tinhTongTienPhaiTra();
    }

    public void tinhTongGiaTriHangHoa() {
        //this được sử dụng để tham chiếu đến các biến thành viên của đối tượng hiện tại
        this.TongTienHang = this.SoLuong * this.GiaBan;
    }

    public void TienKmai() {
        if (SoLuong >= 100) {
            // Nếu mua >= 100, giảm giá 20%
            this.TienKhuyenMai = (float) (0.2 * TongTienHang);
        } else if (SoLuong >= 10) {
            // Nếu mua >= 10, giảm giá 10%
            this.TienKhuyenMai = (float) (0.1 * TongTienHang);
        }
    }

    public void tinhTongTienPhaiTra() {
        this.TongTienThanhToan = this.TongTienHang - this.TienKhuyenMai;
    }
    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        MaHoaDon = maHoaDon;
    }

    public String getNgayLapHoaHon() {
        return NgayLapHoaHon;
    }

    public void setNgayLapHoaHon(String ngayLapHoaHon) {
        NgayLapHoaHon = ngayLapHoaHon;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        TenKhachHang = tenKhachHang;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public float getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(float giaBan) {
        GiaBan = giaBan;
    }

    public float getTongTienHang() {
        return TongTienHang;
    }

    public void setTongTienHang(float tongTienHang) {
        TongTienHang = tongTienHang;
    }

    public float getTienKhuyenMai() {
        return TienKhuyenMai;
    }

    public void setTienKhuyenMai(float tienKhuyenMai) {
        TienKhuyenMai = tienKhuyenMai;
    }

    public float getTongTienThanhToan() {
        return TongTienThanhToan;
    }

    public void setTongTienThanhToan(float tongTienThanhToan) {
        TongTienThanhToan = tongTienThanhToan;
    }



}
