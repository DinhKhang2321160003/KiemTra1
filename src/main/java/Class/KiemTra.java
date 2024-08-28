/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ADMIN
 */

import java.util.Scanner;

public class KiemTra {
    public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            
            do {
                System.out.println("\n--- Quan Ly Sach ---");
                System.out.println("1. Xuat toan bo sach");
                System.out.println("2. Tinh tong tri gia cua cac sach");
                System.out.println("3. lay ra sach xuat ban truoc nam 2015");
                System.out.println("4. Tim sach co ten bat dau voi 'Lap trinh'");
                System.out.println("5. Sap xep sach theo gia tang dan");
                System.out.println("6. Xoa sach theo ma sach");
                System.out.println("7. Sua gia sach theo ma sach");
                System.out.println("0. Thoat");
                System.out.print("Lua chon cua ban: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                
                switch (choice) {
                    case 1:
                        quanLySach.xuatToanBoSach();
                        break;
                    case 2:
                        System.out.println("Tong tri gia cac sach: " + quanLySach.tinhTongTriGia());
                        break;
                    case 3:
                        quanLySach.sachTruocNam2015();
                        break;
                    case 4:
                        System.out.println("Tim sach co ten bat dau voi 'Lap trinh'");
                        quanLySach.sachTieuDeLapTrinh();
                        break;
                    case 5:
                        quanLySach.sapXepTheoGia();
                        System.out.println("Sach da duoc sap xep theo gia tang dan.");
                        break;
                    case 6:
                        System.out.print("Nhap ma sach can xoa: ");
                        String maSachXoa = scanner.nextLine();
                        quanLySach.xoaSachTheoMa(maSachXoa);
                        System.out.println("Sach da duoc xoa.");
                        break;
                    case 7:
                        System.out.print("Nhap ma sach can sua gia: ");
                        String maSachSua = scanner.nextLine();
                        System.out.print("Nhap gia moi: ");
                        double giaMoi = scanner.nextDouble();
                        quanLySach.suaGiaBiaTheoMa(maSachSua, giaMoi);
                        System.out.println("Gia sach da duoc cap nhat.");
                        break;
                    case 0:
                        System.out.println("Thoat chuong trinh.");
                        break;
                    default:
                        System.out.println("Lua chon khong hop le. Vui long chon lai.");
                        break;
                }
            } while (choice != 0);
        }
    }
}
