/**
 * Eine Klasse, die ein einfaches Modell von Girokonten
 * implementiert.
 * 
 * @author Brauer, Koopmann
 * @version November 2014
 */

class Konto
{
    int _saldo = 1000; // oeffnungsbonus!
    final int KONTO_NUMMER;

    /**
     * erstellt Kontonummer.
     */
    public Konto(int kontoNummer)
    {
        KONTO_NUMMER = kontoNummer;
    }

    /**
     * veraendernd |
     * Zahle einen Betrag auf das Konto ein.    
     * @param Einzahlung
     * einzuzahlender Betrag in € cent
     */
    public void zahleEin(int einzahlung)
    {
        _saldo += einzahlung;    
    }

    /**
     *  veraendernd |
     *  Hebe einen Betrag vom Konto ab.
     *  @param Abhebung
     *  abzuhebender Betrag in € cent    
     */
    public void hebeAb(int abhebung)
    {
        _saldo -= abhebung;   
    }

    /**
     * sondierend |
     * Zeige Kontostand.
     * @return Saldo des Kontos in €.      

     */
    public double gibKontoauszug()
    {
        double saldoInEuro = (double) _saldo / 100;
        return saldoInEuro;
    }

    /**
     * sondierend |
     * Zeige Konto#.
     * @return Kontonummer. 
     */
    public int gibKontoNummer()
    {
        return KONTO_NUMMER;
    }
}
