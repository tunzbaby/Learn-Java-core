public class NhanVien extends ConNguoi {
    String maNV, chucVu;
    int luong;

    void nhapTT(String gTriHoTen, String gTriGioiTinh, String gTriDiaChi,
                int gTriTuoi, String gTriMaNV, String gTriChucVu,
                int gTriLuong) {
        // Goi den phuong thuc nhapTT cua doi tuong cha
        nhapTT(gTriHoTen, gTriGioiTinh, gTriDiaChi, gTriTuoi);
        // Nhap thong tin cho cac thuoc tinh ma NV, chuc vu, luong
    }

    void lamViec() {
        // Noi dung phuong thuc lam viec
    }

    void vietBaoCao() {
        // Noi dung phuong thuc viet bao cao
    }
    @Override
    void anUong() {
        // Xay dung hanh vi an uong cua Nhan vien
        // Ghi de hoan toan nen khong co super
    }

    @Override
    void diChuyen() {
        // Xay dung hanh vi di chuyen cua nhan vien
        // Ghi de hoan toan nen khong co super
    }

    @Override
    void inTT() {
        // Goi den phuong thuc inTT cua doi tuong cha
        super.inTT();
        // in them thong tin cho cac thuoc tinh ma NV, chuc vu, luong
    }


}
