/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan62.livingthing;

/**
 *
 * @author 
 * NAMA     : M Dandri Handian
 * KELAS    : PBOIF2
 * NIM      : 10118062
 */
public class Human extends Living {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void walk(String nama) {
        super.walk(nama); //To change body of generated methods, choose Tools | Templates.
        System.out.println(nama + " sedang berjalan");
    }   
    
    
    
}
