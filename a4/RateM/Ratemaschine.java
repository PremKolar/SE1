/**
 * Ratemaschine
 * 
 * @author Brauer, Koopmann
 * @version November 2014
 */
class Ratemaschine
{
    private final int _zuRatendeZahl;
    private int _versuche;
    /**
     * setzt zu ratende zahl
     * @param zahl 
     *      zu ratende zahl
     */
    public Ratemaschine(int zahl)
    {
        _zuRatendeZahl= zahl;
        _versuche = 0;
    }

    
    /**
     * wird aufgerufen um zahl zu raten
     * @param zahl
     *      geratene zahl
     * @return
     *      string, der entsprechend einem der drei möglichen Fälle den user informiert ob er richtig lag
     */
    public String istEsDieseZahl(int zahl)
    {
        _versuche += 1;
        String ausgabe;
        if ( zahl > _zuRatendeZahl )
        {
            ausgabe = "Zu hoch getippt!";
        }
        else if ( zahl < _zuRatendeZahl )
        {
            ausgabe = "Zu niedirg geraten!";
        }
        else 
        {
            ausgabe="Stimmt!  _versuche: " + _versuche;
        }

        return ausgabe;
    }
}