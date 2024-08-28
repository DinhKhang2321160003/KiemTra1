/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
/**
 *
 * @author ADMIN
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QuanLySach {
    private final List<Sach> danhSachSach;

    public QuanLySach() {
        danhSachSach = new ArrayList<>();
        danhSachSach.add(new Sach("K011", "Lap trinh java", 95000, 2017));
        danhSachSach.add(new Sach("K012", "Co so du lieu", 85000, 2001));
        danhSachSach.add(new Sach("K013", "Nhap mon Lap trinh", 72000, 2013));
        danhSachSach.add(new Sach("K014", "Lap trinh Python", 39000, 2018));
        danhSachSach.add(new Sach("K015", "Lap trinh C#", 82000, 2015));
    }

    public void xuatToanBoSach() {
        danhSachSach.forEach(System.out::println);
        double tongGia = danhSachSach.stream().mapToDouble(Sach::getGiabia).sum();
        System.out.println("Tong gia tri cac sach: " + tongGia);
    }

    public void sachTruocNam2015() {
        danhSachSach.stream()
                .filter(sach -> sach.getNamxuatban() < 2015)
                .forEach(System.out::println);
    }

    public void sachTieuDeLapTrinh() {
        danhSachSach.stream()
                .filter(sach -> sach.getTensach().startsWith("Lap trinh"))
                .forEach(System.out::println);
    }
    public void sapXepTheoGia() {
        danhSachSach.stream()
                .sorted(Comparator.comparingDouble(Sach::getGiabia))
                .forEach(System.out::println);
    }

    public void xoaSachTheoMa(String maSach) {
        danhSachSach.removeIf(sach -> sach.getMasach().equals(maSach));
    }
    
    public void suaGiaBiaTheoMa(String maSach, double giaMoi) {
        danhSachSach.stream()
                .filter(sach -> sach.getMasach().equals(maSach))
                .findFirst()
                .ifPresent(sach -> sach.setGiabia(giaMoi));
    }

    public double tinhTongTriGia() {
        return danhSachSach.stream().mapToDouble(Sach::getGiabia).sum();
    }
}

