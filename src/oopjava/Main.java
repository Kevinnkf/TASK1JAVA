/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopjava;

/**
 *
 * @author User001
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biodata profil = new Biodata();
        System.out.println(profil.getNamaLengkap());
        System.out.println(profil.getTempatLahir());
        System.out.println(profil.getTanggalLahir());
        System.out.println(profil.getHobi());
        System.out.println(profil.getZodiak());
        System.out.println(profil.getMakananFavorit());
        System.out.println(profil.getCitaCita());
    }
        
}
