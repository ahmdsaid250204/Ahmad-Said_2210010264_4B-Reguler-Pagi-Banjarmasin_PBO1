package Kepolisian;

//inheritance]
public class PolisiTeliti extends Polisi {

    //overriding
    public PolisiTeliti(String nama, String nip) {
        super(nama, nip);
    }
    
    public int getTahunMasuk(){
        return Integer.parseInt(getNip().substring(0,2)) + 2000; 
    }
    
    public String getKantor(){
        String kodeKan = getNip().substring(2, 4);
        //seleksi if
        if(kodeKan.equals ("10")){
            return "Timur";
        } else {
            return "Kantor Tidak Ditemukan";
        }
    }
    
    public String getBidang(){
        String kodeBidang = getNip().substring(4, 6);
        //seleksi switch
        switch(kodeBidang){
            case "01":
                return "Polantas";
            case "02":
                return "Intelijen";
            default:
                return "Tidak Ditemukan";
        }
    }
    
    public int getNoPeserta(){
        return Integer.parseInt(getNip().substring(6));
    }
    
    //polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nTahun Masuk: "+getTahunMasuk()+ 
                "\nKantor Sektor: "+getKantor()+
                "\nBidang: "+getBidang()+
                "\nNo Peserta: "+getNoPeserta();
    }
}
