abstract class ConNguoi { // abstract - truu tuong
    String hoTen, gioiTinh, diaChi;
    int tuoi;

    void nhapTT(String gTriHoTen, String gTriGioiTinh, String gTriDiaChi, int gTriTuoi) {
        // Nhap thong tin cho cac thuoc tinh hoTen, gioiTinh, diaChi, tuoi
    }

    abstract void anUong() {
        // Noi dung phuong thuc an uong
    }

    abstract void diChuyen() {
        // Noi dung phuong thuc di chuyen
    } // Time

    void inTT() {
        // In thong tin con nguoi gom: hoTen, gioiTinh, diaChi, tuoi
    }
}
