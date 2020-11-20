/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan51.gaji;

/**
 * @author 
 * Nama : Zain Achmad Rizqullah 
 * Nim : 10116380
 * Kelas : PBO2 
 * Deskripsi Program : Program ini berisi tentang menghitung gaji karyawan sesuai
 *                     jabatan.
 */
public class Karyawan {
    
    protected String nik;
    protected String nama;
    protected String jabatan;
    protected int golongan;

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    
}
