
/**
 * Exemplare dieser Klasse zeichnen eine einfache Zeichnung.
 * Um die Zeichnung auf dem Bildschirm anzuzeigen, muss die
 * zeichne-Operation an einem Exemplar aufgerufen werden.
 *
 * Diese Klasse ist als fruehes Java-Lehrbeispiel mit BlueJ gedacht. Hallo
 * 
 * @author  Petra Becker-Pechau
 */
class Zeichner
{
    /**
     * zeichne Wand    
     */
    private void zeichneWand(String col,int ypos,int xpos, int size)
    {
        Quadrat wand;        
        wand = new Quadrat(col);
        wand.vertikalBewegen(ypos);
        wand.horizontalBewegen(xpos);
        wand.groesseAendern(size,size); 
    }

    /**
     * zeichne Dach     
     */
    private void zeichneDach(int hausX,int hausY, int hausScale)
    {
        Dreieck dach;
        double width  = 1.1 * hausScale;
        double height =  .3 * hausScale;
        int xpos = double2int(hausX + hausScale/2);
        int ypos = double2int(hausY - (hausScale - height)/2);

        dach = new Dreieck();  
        dach.sichtbarMachen();
        dach.groesseAendern(double2int(height),double2int(width)); 
        dach.horizontalBewegen(xpos);
        dach.vertikalBewegen(ypos);

    }

    /**
     * zeichne Fenster
     * parameter entsprechend haus uebergeben! 
     */
    private void zeichneWindow(int ypos,int xpos, int size)
    {
        ypos = ypos + size/6;
        xpos = xpos + size/6;
        size = size/4;
        zeichneWand("blau",ypos,xpos,size);       
    }

    /**
     * Zeichne die Zeichnung.
     * @param col
     *      "rot", "gelb", "blau", "gruen", "lila" und "schwarz".
     * @param ypos  
     *      pos in y
     * @param xpos  
     *      pos in x
     * @param size
     *      länge einer seite des quadrats
     */
    public void zeichne(String col, int posX, int posY, int hausSize)
    {
        zeichneWand(col,posY,posX,hausSize);    
        zeichneWindow(posY,posX,hausSize);    
        zeichneDach(posX,posY,hausSize);
    }
    
    private int double2int(double d)
    {
        int i = (int) d;
        return i;
    }
}
