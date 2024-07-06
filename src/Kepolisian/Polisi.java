package Kepolisian;

//class
public class Polisi {
    //atribut dan encapsulation
    private String nama;
    private String nip;
    
    //constructor
    public Polisi(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }
    
    //mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    //accessor (getter)
    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }
    
    
    public String displayInfo(){
        return "Nama: "+getNama()+
               "\nNip: "+getNip();
    }
    
    //polymorphism (overloading)
    public String displayInfo(String kantor){
        return displayInfo() + "\nkantor: " + kantor;
    }
}