
/**
 * Die Klasse Uhrenanzeige setzt eine Uhrzeit und lässt die Zeit im Minutentakt erhöhen
 * 
 * @author Birgül, Koopmann
 * @version 1.0 - 14-11
 */
class Uhrenanzeige
{
    //     Nummernanzeige _minuten = new Nummernanzeige(60);
    //     Nummernanzeige _stunden = new Nummernanzeige(24);

    private Nummernanzeige _minuten;
    private Nummernanzeige _stunden;

    /**
     * Konstruktor fuer Exemplare der Klasse Uhrenanzeige mit 00:00 Initialisierung
     */
    public Uhrenanzeige()
    {  
        _minuten = new Nummernanzeige(60);
        _stunden = new Nummernanzeige(24);

        _stunden.setzeWert(0);
        _minuten.setzeWert(0);   

    }

    /**
     * Konstruktor fuer Exemplare der Klasse Uhrenanzeige
     * @param hh
     *      Initialwert für Stunden
     * @param mm
     *      Initialwert für Minuten
     */
    public Uhrenanzeige(int hh, int mm)
    {  

        _minuten = new Nummernanzeige(60);
        _stunden = new Nummernanzeige(24);

        _stunden.setzeWert(hh);
        _minuten.setzeWert(mm);

    }

    /**
     * gibt aktuelle Uhrzeit als String aus      
     */
    public String gibUhrzeit()
    {
        String Uhrzeit;
        Uhrzeit = String.format("%02d:%02d", _stunden.gibWert(),_minuten.gibWert());
        return Uhrzeit; 
    }

    /**
     * erhöht die Uhrzeit um eine Minute
     */    
    public void taktsignalGeben()
    {
        _minuten.erhoehen();
        if (_minuten.gibWert()  == 0 )
        {
            _stunden.erhoehen();
        }
    }

    /**
     * erhöht die Uhrzeit um eine Minute
     */    
    public void taktsignalGeben(int mmPlus)
    {
        int tt=0;
        while( tt < mmPlus )
        {
            _minuten.erhoehen();
            if (_minuten.gibWert()  == 0 )
            {
                _stunden.erhoehen();
            }
            tt++;
        }

    }
    // 
    //      /**
    //      * gibt aktuelle Uhrzeit als String aus   (Alternative)   
    //      */
    //     public String gibUhrzeit()
    //     {
    //         String Uhrzeit;
    //         String MM;
    //         String SS;
    //         String HH;
    //         HH = _stunden.gibAnzeigewert();
    //         MM = _minuten.gibAnzeigewert();
    //         SS = _sekunden.gibAnzeigewert();  
    //         Uhrzeit = HH + ":" + MM + ":" + SS; 
    //         return Uhrzeit; 
    //     }
}
