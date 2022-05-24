package QuanLyThuVien;

import java.util.Scanner;
//import java.util.Arrays;

public class QuanLyThuVien  {
    
    public static void menu(){
        System.out.println("\t\t===================================");
        System.out.println("\t\t*****   Chon viec can lam   *****");
        System.out.println("\t\t===================================");
        System.out.println("\t\t|  1. Hien cac loai sach dang co   |");
        System.out.println("\t\t|  2. Them sach                    |");
        System.out.println("\t\t|  3. Sua thong tin sach           |");
        System.out.println("\t\t|  4. Xoa sach                     |");
        System.out.println("\t\t|  5. Tim kiem sach                |");
        System.out.println("\t\t|  6. Muon sach                    |");
        System.out.println("\t\t|  7. Tra sach                     |");
        System.out.println("\t\t|  8. Thoat                        |");
        System.out.println("\t\t==================================");
    }
   
    public static void main(String[] args) {
        DSSach khosach=new DSSach();
        Scanner scan=new Scanner(System.in);
        int chon;
        do{
            menu();
            System.out.print("Nhap lua chon: ");
            chon=scan.nextInt();
            switch(chon){
                case 1: khosach.xuatds();   break;
                case 2: khosach.Them();     break;
                case 3: khosach.Sua();      break;
                case 4: khosach.Xoa();      break;
                case 5: khosach.Timkiem();  break;
                case 8: System.out.println("Tam biet");   break;
            }
            
        } while(chon!=10);
    }

}
