package QuanLyThuVien;

import java.util.Scanner;
interface NhapXuat {
    void Them();
    void Sua();
    void Xoa();
    void Timkiem();
    void Hienthi();
    void nhapDs();
}
class Sach {
    private String maSach, maLoai, tenSach, nhaXuatban, Tacgia;
    Scanner scan = new Scanner(System.in);
    
    public void Them(){
        System.out.print("Nhap ma sach: ");
        maSach = scan.nextLine();
        System.out.print("Nhap ma loai: ");
        maLoai = scan.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = scan.nextLine();
        System.out.print("Ten nha xuat ban: ");
        nhaXuatban = scan.nextLine();
    }
    
    public void Demuc(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20sn","Ma Sach", "Ma Loai", "Ten Sach", "Nha xuat ban", "So Trang", "Tac Gia", "Tap", "Ngon ngu", "Ngay phat hanh");
    }
    public void Hienthi(){
        System.out.printf("%-20s %-20s %-20s %-20s", maSach, maLoai, tenSach, nhaXuatban);
    }
}

class Tieuthuyet extends Sach implements NhapXuat {
    private int soTrang;
    private String Tacgia;

    public Tieuthuyet() {
    }
    public Tieuthuyet(int soTrang, String Tacgia){
        this.soTrang = soTrang;
        this.Tacgia = Tacgia;
    }
    public int getsoTrang(){
        return soTrang;
    }
    public void setsoTrang(int soTrang){
        this.soTrang = soTrang;
    }
    
    public String getTacgia(){
        return Tacgia;
    }
    public void setTacgia(String Tacgia){
        this.Tacgia = Tacgia;
    }
    
    @Override
    public void Them(){
        Scanner scan = new Scanner(System.in);
        //super.nhap();
        System.out.print("Nhap so trang: ");
        soTrang = Integer.parseInt(scan.nextLine());
        System.out.print("Nhap ten tac gia: ");
        Tacgia = scan.nextLine();
    }
    
    @Override
    public void Hienthi(){
        super.Hienthi();
        System.out.printf("%-20s %-20s %-20s %-20s %-20d %-20s", " ", " ", " ", " ", soTrang, Tacgia);
    }

    @Override
    public void Sua() {
    }

    @Override
    public void Xoa() {
    }

    @Override
    public void Timkiem() {
    }

    @Override
    public void nhapDs() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

class Sachgiaokhoa extends Sach implements NhapXuat{
    private int Tap;
    private String Tieng;

    public Sachgiaokhoa() {
    }
    
    public int getTap(){
        return Tap;
    }
    public void setTap(int Tap){
        this.Tap = Tap;
    }
    
    public String getTieng(){
        return Tieng;
    }
    public void setTieng(String Tieng){
        this.Tieng = Tieng;
    }
    
    @Override
    public void Them(){
        Scanner scan = new Scanner(System.in);
        //super.nhap();
        System.out.print("Nhap tap sach: ");
        Tap = Integer.parseInt(scan.nextLine());
        System.out.print("Nhap ngon ngu sach: ");
        Tieng = scan.nextLine();
    }

    @Override
    public void Sua() {
    }

    @Override
    public void Xoa() {
    }

    @Override
    public void Timkiem() {
    }

    @Override
    public void Hienthi() {
    }

    @Override
    public void nhapDs() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

class Tapchi extends Sach implements NhapXuat{
    private int ngayPhathanh;
    
    public int getngayPhathanh(){
        return ngayPhathanh;
    }
    public void setngayPhathanh(int ngayPhathanh){
        this.ngayPhathanh = ngayPhathanh;
    }
    
    @Override
    public void Them(){
        Scanner scan = new Scanner(System.in);
        //super.nhap();
        System.out.print("Nhap ngay phat hanh: ");
        ngayPhathanh = Integer.parseInt(scan.nextLine());
    }
    
    @Override
    public void Timkiem() {
    }
    
    @Override
    public void Xoa() {
    }
    
    @Override
    public void Sua() {
    }

    @Override
    public void Hienthi() {
    }

    @Override
    public void nhapDs() {
    }
        
}

public class QuanLyThuVien {
    int n;
    Sach sach[];
    
    public void Them(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so luong sach: ");
        n = Integer.parseInt(scan.nextLine());
        sach = new Sach[n];
        
        for(int i=0; i<n; i++){
            System.out.print("Loai tai lieu (Tieuthuyet, SGK, Tapchi): ");
            String loai = scan.nextLine();
            if (loai.equals("Tieuthuyet"))
                sach[i] = new Tieuthuyet();
            else if (loai.equals("SGK"))
                    sach[i] = new Sachgiaokhoa();
            else if (loai.equals("Tapchi"))
                sach[i] = new Tapchi();
            else {
                --i;
                continue;
            }
            sach[i].Them();
        }
        scan.close();
    
    }
    
    public void Hienthi(){
        sach[0].Demuc();
        for(int i=0; i<n; i++){
            sach[i].Hienthi();
        }
    }
    
    public static void main(String[] args) {
        QuanLyThuVien qltv = new QuanLyThuVien();
        qltv.Them();
        qltv.Hienthi();
    }
}
