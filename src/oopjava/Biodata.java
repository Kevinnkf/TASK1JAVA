/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopjava;

/**
 *
    Nama Lengkap
    Tempat Lahir
    Tanggal Lahir
    Hobi
    Zodiak
    MakananFavorit
    cita-cita

 * @author User001
 */
public class Biodata {
    private String NamaLengkap = "Kevin Khalfani Fadillah";
    private String TempatLahir = "Jakarta";
    private String TanggalLahir = "15 Mei 2003" ;
    private String Hobi = "Olahraga";
    private String Zodiak = "Taurus";
    private String MakananFavorit = "Telor" ;
    private String citaCita = "Backend Developer";

    public String getNamaLengkap() {
        return NamaLengkap;
    }

    public String getTanggalLahir() {
        return TanggalLahir;
    }

    public String getTempatLahir() {
        return TempatLahir;
    }

    public String getHobi() {
        return Hobi;
    }

    public String getZodiak() {
        return Zodiak;
    }

    public String getMakananFavorit() {
        return MakananFavorit;
    }

    public String getCitaCita() {
        return citaCita;
    }
    


}
