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
 * DESKRIPSI PROGRAM : program ini menampilkan 2 data gabungan
 * 
 */
public class Mamalia{

    

       // variabel jumlahKambing dideklarasi sebagai statik
    public static int jumlahKambing;
    }  
    
    
    public class KambingStatic {
        //NAMA_KAMBING sebagai konstanta
        public static final String NAMA_KAMBING = "MIDUN";
        
        public static void main(String[] args ) {
            Mamalia.jumlahKambing = 485000;
            System.out.println(NAMA_KAMBING + "memiliki kambing sebanyak"
            + Mamalia.jumlahKambing);
        }
    }
