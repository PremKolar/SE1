/**
 * 
 * 
 * @author Koopmann
 * @version November 2014
 */

class QuadratischeGleichung
{
    private double _a;
    private double _b;
    private double _c;
    private double _p;
    private double _q;
    private double _sqrtTerm;    

    /**
     * @param a, b , c 
     *           * gib parameter a,b,c wie in a x^2 + b x + c = 0
     */
    public QuadratischeGleichung(double a, double b, double c)
    {
        _a = a;
        _b = b;
        _c = c;
        makePandQandSQrtTerm();
    }

    private void makePandQandSQrtTerm()
    {
        _p = _b/_a;
        _q = _c/_a;
        _sqrtTerm = Math.sqrt(Math.pow(_p/2, 2) - _q);
    }

    public double ersteNullstelle()
    {
        double Nullstelle;
        Nullstelle = -_p/2 - _sqrtTerm;
        return Nullstelle;
    }

    public double zweiteNullstelle()
    {
        double Nullstelle;
        Nullstelle = -_p/2 + _sqrtTerm;
        return Nullstelle;
    }

    public int anzahlNullstellen()
    {
        int anzahlNullstellen = 2;
       
        if (Double.isNaN(_sqrtTerm))
        {
            anzahlNullstellen = 0;
        }
       
        if (_sqrtTerm == 0)
        {
            anzahlNullstellen = 1;
        }  

        return anzahlNullstellen;
    }

}

