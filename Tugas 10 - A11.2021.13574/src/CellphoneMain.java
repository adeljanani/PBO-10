public class CellphoneMain {
    public static void main(String[] args){
        Cellphone cp = new Cellphone("Esia", "180");
        cp.powerOn();
        cp.sleepmodeOn();
        cp.sleepmodeOff();
        cp.powerOff();

        // Dari sini semua function tidak bisa digunakan karena HP mati 
        cp.volumeDown();
        cp.sisaPulsa();

        // Setelah dihidupkan function bisa digunakan
        cp.powerOn();
        cp.volumeUp();
        cp.getVolume();
        cp.setVol(26);
        cp.getVolume();

        // Top Up pulsa diatas minimal 5000 & HP posisi hidup,
        // ketika posisi mati pulsa terkirim namun tidak bisa terlihat
        cp.topUpPulsa(15000);
        cp.sisaPulsa();

        // Menambahkan banyak contact dengan Array List
        Contact contact = new Contact("Ridwan", "13574");
        contact.tambahContact("Shohib", "13898");
        contact.tambahContact("Faiq", "13590");
        contact.tambahContact("Furqon", "13449");
        contact.tambahContact("Loki", "13640");
        contact.displayContacts();

        // Mencari Contact dengan Nama dan No
        contact.showContactByName("Ridwan");
        contact.showContactByNoHP("13574");

    }
}
