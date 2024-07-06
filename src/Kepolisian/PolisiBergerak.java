package Kepolisian;

import java.util.Scanner;

public class PolisiBergerak {
    public static void main(String[] args) {
        
        //error handling
        try{
            //io sederhana
            Scanner scanner = new Scanner(System.in);
        
            //array
            PolisiTeliti[] pls = new PolisiTeliti[2];
        
            //perulangan 
            for(int i=0; i<pls.length; i++){
                System.out.print("Masukkan Nama Polisi "+(i+1)+": ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIP Polisi "+(i+1)+": ");
                String nip = scanner.nextLine();
        
                //objek
                pls[i] = new PolisiTeliti(nama, nip);
            }
        
            //perulangan
            for(PolisiTeliti data: pls){
                System.out.println("=================");
                System.out.println("Data Polisi: ");
                System.out.println(data.displayInfo());        
            }
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Silahkan Menginput NIP Dengan Benar: "+e.getMessage());
        }
    }
}
