class HocSinh extends ConNguoi {
    String maHS, lop;
    int diemToan, diemVan, diemAnh;

    void nhapTT(String gTriHoTen, String gTriGioiTinh, String gTriDiaChi,
                int gTriTuoi, String gTriMaHS, String gTriLop, int gTriDiemToan,
                int gTriDiemVan, int gTriDiemAnh) {
        // Goi den phuong thuc nhapTT cua doi tuong cha
        nhapTT(gTriHoTen, gTriGioiTinh, gTriDiaChi, gTriTuoi);
        // Nhap thong tin cho cac thuoc tinh ma HS, lop, diem Toan, diem Van, diem Anh
    }

    void hocBai() {
        // Noi dung phuong thuc hoc bai
    }

    double tinHDiemTB() {
        // Noi dung phuong thuc tinh diem trung binh
        return -1; // Tra ve gia tri mac dinh
    }

    @Override
    void anUong() {
        // Xay dung hanh vi an uong cua Sinh vien
        // Ghi de hoan toan neu khong co super
    }

    @Override
    void diChuyen() {
        // Xay dung hanh vi di chuyen cua Sinh vien
        // Ghi de hoan toan nen khong co super
    }

    @Override
    void inTT() {
        // goi phuong thuc inTT cua doi tuong cha
        super.inTT(); //
        // In them thong tin cac thuoc tinh ma HS, lop, diem Toan, diem Van, diem Anh
    }


    double tinHDiemTB() {
        // Noi dung phuong thuc tinh diem trung binh
        return -1; // Tra ve gia tri mac dinh
    }
}
