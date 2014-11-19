/**
 * Eine Klasse, die die zeitliche entwicklung der koerpermasse dokumentiert
 * 
 * @author Koopmann
 * @version November 2014
 */

class Waage
{
    private int _letzteMasse;
    private int _trend;
    private int _neueMasse;
    private int _allZeitMasseMinimum;
    private int _allZeitMasseMaximum;
    private int _durchschnittsMasse;
    private int _anzahlMessungen;
    /**
     * Gib deine koerpermasse in Gramm an!
     * @param koerpermasse 
     *      koerpermasse [g]
     */
    public Waage(int koerperMasseInG)
    {
        _letzteMasse                 = koerperMasseInG;
        _neueMasse                   = koerperMasseInG;
        _allZeitMasseMinimum         = koerperMasseInG;
        _allZeitMasseMaximum         = koerperMasseInG;
        _durchschnittsMasse          = koerperMasseInG;
        _trend                       = 0;
        _anzahlMessungen             = 1;
    }

    /**
     * all-time max(mass(t))   
     * @param  _allZeitMasseMinimum;
     *           größte Masse eh und je [g]
     */ 
    public int gibMinimalMasse()
    {
        return _allZeitMasseMinimum;
    }

    /**
     * all-time max(mass(t))   
     * @param  _allZeitMasseMaximum;
     *           größte Masse eh und je [g]
     */ 
    public int gibMaximalMasse()
    {
        return _allZeitMasseMaximum;
    }

    /**
     * all-time mean(mass(t))   
     * @param  _durchschnittsMasse;
     *           Mittelwert [g]
     */ 
    public int gibDurchschnittsmasse()
    {   
        return _durchschnittsMasse;
    }

    /**
     * trendRichtung.
     * @param trendOut 
     *     -1, falls der Besitzer leichter geworden ist
     *     +1, falls er schwerer geworden ist
     *     0 sonst
     *     [ ]
     */ 
    public int gibTrend()
    {
        int trendOut = 0; 
        if (_trend>0)
        {
            trendOut = 1;
        }
        else if (_trend<0)
        {
            trendOut = -1;
        }
        return trendOut;
    }   

    /**
     * mittelwert updaten
    * @param updatedMean
    *       neuer mittelwert (gramm-genauigkeit)
     */   
    private int meanOnFly(int valueOld,int valueNew,int N)
    {
        int updatedMean;
        // M = (N-1)/N * old   +   1/N  * new
        updatedMean = ((N-1) * valueOld + valueNew)/N ;
        return updatedMean;
    }

    /**
     * aktualisiert min,max,mean von masse(zeit)    
     */   
    private void updateExtremataAndMean()
    {
        // N
        _anzahlMessungen += 1;
        // max
        if (_neueMasse > _allZeitMasseMaximum)
        {
            _allZeitMasseMaximum =  _neueMasse;
        }
        // min
        if (_neueMasse < _allZeitMasseMinimum)
        {
            _allZeitMasseMinimum =  _neueMasse;
        }
        // mean
        _durchschnittsMasse = meanOnFly( _durchschnittsMasse, _neueMasse, _anzahlMessungen);
    }

    /**
     * Gib deine koerpermasse in Gramm an!
     * @param koerpermasse 
     *      koerpermasse [g]
     */   
    public void registriere(int neueMasse)
    {
        _neueMasse      = neueMasse;
        _trend          = _neueMasse - _letzteMasse;
        _letzteMasse    = _neueMasse;     
        //
        updateExtremataAndMean();        
    }
}
