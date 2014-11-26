
/**
 * klasse zum managen von konten z.bsp. ueberweisungen tätigen
 * @koopmann, birgül
 * @version WiSe 2014
 */
class Ueberweisungsmanger
{
    /**
     * ueberweisungen tätigen
     * @param quellKonto
     *        konto vom dem der betrag abgeht
     * @param zielKonto
     *        konto auf das überwiesen wird
     *   @param betrag
     *        zu transferiender Betrag     
     */
    public void ueberweisen(Konto quellKonto, Konto zielKonto, int betrag)
    {

        assert (quellKonto != null) : "konto muss Klasse Konto sein!!";  
        assert (zielKonto  != null) : "konto muss Klasse Konto sein!!";
        quellKonto.hebeAb(betrag);
        zielKonto.zahleEin(betrag);
    }
}
