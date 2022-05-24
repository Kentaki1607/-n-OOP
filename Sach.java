
package QuanLyThuVien;

import java.util.Scanner;

class Sach implements NhapXuat {
    private String maSach, maLoai, tenSach, nhaXuatban;
    private int soLuong;
    /*private Tieuthuyet tieuthuyet=new Tieuthuyet();
    private Sachgiaokhoa sachgiaokhoa=new Sachgiaokhoa();
    private Tapchi tapchi=new Tapchi();*/
    
    public Sach() {
    }

    public Sach(String maSach, String maLoai, String tenSach, String nhaXuatban, int soLuong) {
        this.maSach = maSach;
        this.maLoai = maLoai;
        this.tenSach = tenSach;
        this.nhaXuatban = nhaXuatban;
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {       
        this.maSach = maSach;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {       
        this.maLoai = maLoai;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {        
        this.tenSach = tenSach;
    }

    public String getNhaXuatban() {
        return nhaXuatban;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public void setNhaXuatban(String nhaXuatban) {
        this.nhaXuatban = nhaXuatban;
    }
    @Override
    public void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        maSach = scan.nextLine();
        System.out.print("Nhap ma loai: ");
        maLoai = scan.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = scan.nextLine();
        System.out.print("Ten nha xuat ban: ");
        nhaXuatban = scan.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = scan.nextInt();
    }
    
    @Override
    public String toString(){
        return "|| Thong tin || " + "   Ma Sach: " + maSach + " |  Ma Loai: " + maLoai + " | Ten Sach: " + tenSach + " | Nha xuat ban: " + nhaXuatban + " | So luong: " + soLuong;
    }
    @Override
    public void xuat(){
        System.out.println(toString());
        System.out.println();
        
    }

}