package QuanLyThuVien;

import java.util.Scanner;
import java.util.Arrays;

public class DSSach  {
    int n;
    Sach[] listSach;
    Scanner scan=new Scanner(System.in);
    public DSSach(){
        n=0;
        listSach=new Sach[0];
}

    public DSSach(int n, Sach[] listSach){
        this.n=n;
        listSach=new Sach[this.n];
    }
    
    public void nhapds(){
        for(int i=0; i<listSach.length; i++){
            listSach[i]=new Sach(){};
            listSach[i].nhap();
        }
    }
    
    public void xuatds(){
        for(int i=0; i<listSach.length; i++){
            listSach[i].xuat();
        }
    }
    
    
    
    public void Them(){
        listSach=Arrays.copyOf(listSach, n+1);
        listSach[n]=new Sach() {};
        listSach[n].nhap();
        n++;
    }
    
    public void Sua(){
        boolean temp=false;
        System.out.print("Nhap ma sach muon sua: ");
        String MaSach=scan.nextLine();
        for(int i=0;i<listSach.length;i++)
        {
            if(listSach[i].getMaSach().equals(MaSach)){
             listSach[i].nhap();
             temp=true;
            }
        }
        if(temp==false)
            System.out.println("Khong tim thay sach !");
    }
    
    public void Xoa(){
        boolean fix=false;
        System.out.print("Nhap ma sach muon xoa : ");
        String MaSach=scan.nextLine();
        for(int i=0;i<listSach.length;i++)
        {
            if(listSach[i].getMaSach().equals(MaSach))
            {
                 for(int j=i;j<listSach.length-1;j++)
                    listSach[j]=listSach[j+1];
                 listSach=Arrays.copyOf(listSach, n-1);
                 n--;
                 fix=true;
                 break;
            }
                    
        }
            if(fix==false)System.out.println("Khong tim thay ma sach nay !");
    }
    
    public void Timkiem(){
        boolean temp=false;
        System.out.print("Nhap ma sach muon tim: ");
        String MaSach=scan.nextLine();
        for(int i=0;i<listSach.length;i++)
        {
            if(listSach[i].getMaSach().equals(MaSach)){
             listSach[i].xuat();
             temp=true;
            }
        }
        if(temp==false)
            System.out.println("Khong tim thay sach !");
    }
    
    public void nhap(){
        System.out.print("Nhap so luong sach: ");
            n=Integer.parseInt(scan.nextLine());
            listSach=new Sach[n];
            for(int i=0; i<n; i++){
            System.out.print("Nhap quyen sach thu "+(i+1)+": ");
            listSach[i]=new Sach();
            listSach[i].nhap();
            }
    }

}
