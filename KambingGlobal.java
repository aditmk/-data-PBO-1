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
 * DESKRIPSI PROGRAM : program ini menampilkan data global
 * 
 */

public class KambingGlobal

    {

    /**
     * @param args the command line arguments
     */
    // variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("jumlah kambing :" + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("jumlah kambing setelah ditambah: "+
        jumlahKambing);
    }
 public static void main(String[] args) {
     KambingGlobal kambingSusu = new KambingGlobal();
     
     // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
     kambingSusu.getJumlahKambing();
     
     // Menambah satu kambing
     kambingSusu.tambahKambing();
     
     // Menampilkan jumlah kambing yang ada
     kambingSusu.getJumlahKambing();
     
 }
}
