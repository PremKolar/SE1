/**
 * Taschenrechner.
 * <P>
 * legend:<br>
 *      ZE : Zwischenergebnis
 * @author Brauer, Koopmann
 * @version November 2014
 */
class Taschenrechner
{
    private double _zwischenergeb;
    /**
     * setzt startwert
     */
    public Taschenrechner()
    {
        _zwischenergeb = 0.0;
    }

    /**
     * addiert wert zu ZE<br>
     * und gibt ZE
     * @param summand
     *      summand
     * @return
     *      ZE
     */
    public double addiere(double summand)
    {
        _zwischenergeb += summand;
        return _zwischenergeb;
    }

    /**
     * subtrahiert wert von ZE<br>
     * und gibt ZE
     * @param subtrahend
     *      subtrahend
     * @return
     *      ZE
     */
    public double subtrahiere(double subtrahend)
    {
        _zwischenergeb -= subtrahend;
        return _zwischenergeb;
    }

    /**
     * multipliziert ZE mit faktor
     * @param faktor
     *      Multiplikator
     */
    public void multipli(double faktor)
    {
        _zwischenergeb = _zwischenergeb * faktor;
    }

    /**
     * teilt ZE durch divisor.
     * @param divisor
     *      "Nenner"
     */    
    public void dividiere(double divisor)
    {
        _zwischenergeb = _zwischenergeb / divisor;
    }

    /**
     * absolutbetrag des zwischenergebnisses.
     */    
    public void abs()
    {
        _zwischenergeb = Math.abs(_zwischenergeb);
    }

    /**
     * wurzel des zwischenergebnisses.
     */    
    public void wurzel()
    {
        if (_zwischenergeb < 0)
        {
            throw new IllegalArgumentException("kann keine wurzel aus negativer zahl ziehen. kenne den komplexen zahlenraum nicht!");
        }
        else
        {
            _zwischenergeb = Math.sqrt(_zwischenergeb);
        }
    }   

    /**
     * setzt ZE zurueck auf 0.0
     */
    public void loesche()
    {
        _zwischenergeb = 0.0;
    }

    /**
     * zeigt ZE
     * @return
     *      ZE
     */
    public double gibZwischenergebnis()
    {
        return _zwischenergeb;
    }

}