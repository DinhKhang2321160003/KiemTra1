/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ADMIN
 */
public class Sach {
    private String masach;
    private String tensach;
    private double giabia;
    private int namxuatban;
    public Sach(String masach, String tensach,double giabia, int namxuatban){
        this.masach = masach;
        this.tensach = tensach;
        this.giabia = giabia;
        this.namxuatban = namxuatban;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public double getGiabia() {
        return giabia;
    }

    public void setGiabia(double giabia) {
        this.giabia = giabia;
    }

    public int getNamxuatban() {
        return namxuatban;
    }

    public void setNamxuatban(int namxuatban) {
        this.namxuatban = namxuatban;
    }
    
    
}
