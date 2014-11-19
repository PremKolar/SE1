/**
 * Eine Zmpel besteht aus drei Lampen in den Farben rot, gelb und gruen.
 * Sie durchlaeuft periodisch vier Phasen: gruen, gelb, rot, rot/gelb.
 * In den ersten drei Phasen leuchtet also nur jeweils eine Lampe,
 * waehrend in der vierten Phase zwei Lampen gleichzeitig leuchten.
 * Der Zustand der einzelnen Lampen kann abgefragt werden,
 * und die Zmpel kann in die naechste Phase geschaltet werden.
 * Die Schaltung geschieht explizit durch einen Methodenaufruf
 * (und nicht etwa durch einen automatischen Timer).
 * 
 * @author Fredrik Winkler
 * @version November 2011
 */
class Zmpel
{
    private boolean _rot;
    private boolean _gelb;
    private boolean _gruen;

    /**
     * Initialisiert eine neue Zmpel auf die erste Phase (gruen).
     */
    public Zmpel()
    {
        _rot   = false;
        _gelb  = false;
        _gruen = true;
    }

    /**
     * Gibt an, ob die rote Lampe leuchtet.
     */
    public boolean leuchtetRot()
    {
        return _rot;
    }

    /**
     * Gibt an, ob die gelbe Lampe leuchtet.
     */
    public boolean leuchtetGelb()
    {
        return _gelb;
    }

    /**
     * Gibt an, ob die gruene Lampe leuchtet.
     */
    public boolean leuchtetGruen()
    {
        return _gruen;
    }

    /**
     * Schaltet die Zmpel in die naechste Phase (gruen -> gelb -> rot -> rot/gelb -> gruen).
     */
    public void schalteWeiter()
    {
        boolean tempGruen;
        boolean tempGelb;

        tempGruen = _gruen;
        tempGelb  = _gelb;

        //        for y and r only
        _gruen = (_gelb  && _rot);
        //       rot/gelb -> gruen

        //   either     g          or       r without y
        _gelb  =     tempGruen     ||    (_rot && !_gelb);
        //         gruen->gelb             rot->rot/gelb

        // either     y with neither g nor r          or       r with neither y nor g  
        _rot   = (tempGelb && !(tempGruen || _rot))   ||   (_rot && !(tempGelb || tempGruen));
        //                 gelb -> rot                            rot -> rot/gelb

    }
}
