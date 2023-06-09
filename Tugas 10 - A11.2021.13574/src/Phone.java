public interface Phone
{
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 0;
    public static final int MAX_BATT_LEVEL = 100;
    public static final int MIN_BATT_LEVEL = 0;

    // 3. Pembuatan bertujuan top up pulsa minimal 5000
    public static final int MIN_PULSA = 5000;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    int getVolume();
    int getBat();

    // 2. Method Top Up Pulsa
    int topUpPulsa(int Top_up_pulsa);
    int getPulsa(); 

    // 3. Method sisa pulsa
    void sisaPulsa();

    // inisiatif bikin sendiri untuk fitur
    int setVol(int vol);
    void sleepmodeOn();
    void sleepmodeOff();
}