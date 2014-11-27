/**
 * Ein einfaches Universum mit einem schweren Koerper in der Mitte (die "Sonne")
 * und einem leichten Koerper auf einer Kreisbahn drumrum (die "Erde").
 * 
 * @author Fredrik Winkler
 * @version November 2014
 */
class Universum
{
    private final Koerper _sonne;
    private final Koerper _erde;
    private final Koerper _BH; // dear captain's log: we're fast being sucked into the hideous vortex of a black hole!

    /**
     * Initialisiert das Universum, so dass die Erde am linken Rand startet
     * und sich gegen den Uhrzeigersinn um die Sonne dreht.
     */
    public Universum()
    {
        _sonne = new Koerper(100, new Vektor(200, 0), new Vektor(0, 0.0));
        _erde  = new Koerper(  1, new Vektor(0, 0), new Vektor(0, 0.7));
        _BH  = new Koerper(  1000000, new Vektor(50000, 50000), new Vektor(0, 0));
    }

    /**
     * Berechnet einen Schritt im Universum.
     */
    public void berechneEinenSchritt()
    {
        spuereDieEinfluesse();
        beruecksichtigeAlleEinfluesse();
    }

    private void spuereDieEinfluesse()
    {
        _sonne.spuereDenEinflussVon(_erde);
        _erde.spuereDenEinflussVon(_sonne);
        _BH.spuereDenEinflussVon(_sonne);
        _sonne.spuereDenEinflussVon(_BH);
        _erde.spuereDenEinflussVon(_BH);

    }

    private void beruecksichtigeAlleEinfluesse()
    {
        _sonne.beruecksichtigeAlleEinfluesse();
        _erde.beruecksichtigeAlleEinfluesse();
        _BH.beruecksichtigeAlleEinfluesse();
    }

    
    /**
     * Liefert die X-Koordinate der Sonne.
     */
    public double sonneX()
    {
        return _sonne.gibPosition().x();
    }

    /**
     * Liefert die Y-Koordinate der Sonne.
     */
    public double sonneY()
    {
        return _sonne.gibPosition().y();
    }

    /**
     * Liefert die X-Koordinate der Erde.
     */
    public double erdeX()
    {
        return _erde.gibPosition().x();
    }

    /**
     * Liefert die Y-Koordinate der Erde.
     */
    public double erdeY()
    {
        return _erde.gibPosition().y();
    }
}
