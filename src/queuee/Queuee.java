/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuee;

import java.util.*;

/**
 *
 * @author iva
 */
public class Queuee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //membuat dan menginisialisasi interface queue menggunakan objek LinkedList
      Queue<String> antrianPendaftaran = new LinkedList<>();
    
    //menambahkan data atau nilai element baru ke list queue (Operasi Enqueue)
      antrianPendaftaran.add("Anna");
      antrianPendaftaran.add("Dian");
      antrianPendaftaran.add("Fauzan");
      antrianPendaftaran.add("Suci");
      antrianPendaftaran.add("Andre");
      
    //menampilkan output hasil list queue 
        System.out.println("Antrian Pendaftaran peserta : " + antrianPendaftaran);
        
    //memhapus sebuah element dari queue menggunakan method remove() (Operasi queue)
    //method remove() akan melempar NoSuchElementException, jika list queue koson
        String nama = antrianPendaftaran.remove();
        
        System.out.println("Menghapus dari Antrian Pendaftaran : " + nama + 
                " | Daftar Antrian Baru : " + antrianPendaftaran);
    
    //memhapus sebuah element dari queue menggunakan method poll()
    //method remove() akan mengambilkan null, jika list queue kosong
        nama = antrianPendaftaran.poll();
        System.out.println("Menghapus dari Antrian Pendaftaran : " + nama + 
                " | Daftar Antrian Baru : " + antrianPendaftaran);
    }
    
}
