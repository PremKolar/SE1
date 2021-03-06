import java.awt.Rectangle;

/**
 * Ein Quadrat, das manipuliert werden kann und sich selbst auf einer
 * Leinwand zeichnet.
 * 
 * @author  Michael Koelling und David J. Barnes
 * @author  Christian Spaeh
 * @version Oktober 2010
 */
public class Quadrat
{
    private int _groesse;
    private int _breite;
    private int _hoehe;
    private int _xPosition;
    private int _yPosition;
    private String _farbe;
    private boolean _istSichtbar;

    /**
     * Erzeuge ein neues Quadrat mit w�hlbarer farbe an einer
     * Standardposition. 
     * @param col
     *      die wandfarbe
     */
    public Quadrat(String col)
    {
        _hoehe = 30;
        _breite = 30;
        _groesse = 30;
        _xPosition = 0;
        _yPosition = 0;
        _farbe = col;
        _istSichtbar = true;
    }
    /**
     * Mache dieses Quadrat sichtbar. Wenn es bereits sichtbar ist, tue
     * nichts.
     */
    public void sichtbarMachen()
    {
        _istSichtbar = true;
        zeichnen();
    }

    /**
     * Mache dieses Quadrat unsichtbar. Wenn es bereits unsichtbar ist, tue
     * nichts.
     */
    public void unsichtbarMachen()
    {
        loeschen();
        _istSichtbar = false;
    }

    /**
     * Bewege dieses Quadrat einige Bildschirmpunkte nach rechts.
     */
    public void nachRechtsBewegen()
    {
        horizontalBewegen(20);
    }

    /**
     * Bewege dieses Quadrat einige Bildschirmpunkte nach links.
     */
    public void nachLinksBewegen()
    {
        horizontalBewegen(-20);
    }

    /**
     * Bewege dieses Quadrat einige Bildschirmpunkte nach oben.
     */
    public void nachObenBewegen()
    {
        vertikalBewegen(-20);
    }

    /**
     * Bewege dieses Quadrat einige Bildschirmpunkte nach unten.
     */
    public void nachUntenBewegen()
    {
        vertikalBewegen(20);
    }

    /**
     * Bewege dieses Quadrat horizontal.
     * @param entfernung
     *          Die Entfernung in Pixel, um die das Dreieck horizontal bewegt werden soll.
     */
    public void horizontalBewegen(int entfernung)
    {
        loeschen();
        _xPosition += entfernung;
        zeichnen();
    }

    /**
     * Bewege dieses Quadrat vertikal.
     * @param entfernung
     *          Die Entfernung in Pixel, um die das Dreieck vertikal bewegt werden soll.
     */
    public void vertikalBewegen(int entfernung)
    {
        loeschen();
        _yPosition += entfernung;
        zeichnen();
    }

    /**
     * Bewege dieses Quadrat langsam horizontal.
     * @param entfernung
     *          Die Entfernung in Pixel, um die das Dreieck horizontal bewegt werden soll.
     */
    public void langsamHorizontalBewegen(int entfernung)
    {
        int delta;

        if (entfernung < 0)
        {
            delta = -1;
            entfernung = -entfernung;
        }
        else
        {
            delta = 1;
        }

        for (int i = 0; i < entfernung; i++)
        {
            _xPosition += delta;
            zeichnen();
        }
    }

    /**
     * Bewege dieses Quadrat langsam vertikal.
     * @param entfernung
     *          Die Entfernung in Pixel, um die das Dreieck vertikal bewegt werden soll.
     */
    public void langsamVertikalBewegen(int entfernung)
    {
        int delta;

        if (entfernung < 0)
        {
            delta = -1;
            entfernung = -entfernung;
        }
        else
        {
            delta = 1;
        }

        for (int i = 0; i < entfernung; i++)
        {
            _yPosition += delta;
            zeichnen();
        }
    }
    
    public void groesseAendern(int neueBreite, int neueHoehe)
    {
        if((neueHoehe > 0) && (neueBreite > 0)){
            loeschen();
            _hoehe = neueHoehe;
            _breite = neueBreite;
            zeichnen();
        }
    }

    /**
     * Aendere die Farbe dieses Quadrates.
     * @param neueFarbe
     *          Die neue Farbe des Kreises. Gueltige Angaben sind "rot", "gelb", "blau", "gruen", "lila" und "schwarz".
     */
    public void farbeAendern(String neueFarbe)
    {
        _farbe = neueFarbe;
        zeichnen();
    }

    /*
     * Zeichne dieses Quadrat mit seinen aktuellen Werten auf den Bildschirm
     */
    private void zeichnen()
    {
        if (_istSichtbar)
        {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.zeichne(
                this,
                _farbe,
                new Rectangle(_xPosition, _yPosition, _breite, _hoehe));
            leinwand.warte(10);
        }
    }

    /*
     * Loesche dieses Quadrat vom Bildschirm.
     */
    private void loeschen()
    {
        if (_istSichtbar)
        {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.entferne(this);
        }
    }
}
