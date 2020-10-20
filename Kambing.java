/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * NAMA       : ADITIYA MUSTHAFA KAMIL
 * KELAS      : PBO2
 * NIM        : 10119075
 * DESKRIPSI PROGRAM : program ini menampilkan data jumlah kambing
 * 
 */

public class Kambing 

    {

    /**
     */
    public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah:" +
        jumlahKambing);
    }
    
    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
        
        
        
        
     
}