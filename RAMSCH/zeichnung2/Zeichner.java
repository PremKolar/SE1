
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
    public void zeichneWand(String col,int ypos,int xpos, int size)
    {
        Quadrat wand;
        wand = new Quadrat(col);
        wand.vertikalBewegen(ypos);
        wand.horizontalBewegen(xpos);
        wand.groesseAendern(size,size); 
    }
    
 
    /**
     * Zeichne die Zeichnung.
     */
    public void zeichne()
    {
        Quadrat fenster;
        Dreieck dach;
        Kreis sonne;
      
        dach = new Dreieck();  
        dach.sichtbarMachen();
        dach.groesseAendern(50, 140);
        dach.horizontalBewegen(60);
        dach.vertikalBewegen(70);

        sonne = new Kreis();
        sonne.sichtbarMachen();
        sonne.farbeAendern("rot");
        sonne.horizontalBewegen(180);
        sonne.vertikalBewegen(-10);
        sonne.groesseAendern(60);
        
        zeichneWand("gelb",80,0,100);        
        zeichneWand("blau",100,20,200);
        
        
//         
//                 fenster = new Quadrat("gruen");
//         fenster.sichtbarMachen();
//         fenster.farbeAendern("gruen");
//         fenster.horizontalBewegen(50);
//         fenster.vertikalBewegen(30);
//         fenster.groesseAendernQuad(100);
//         
//         dach = new Dreieck();  
//         dach.sichtbarMachen();
//         dach.farbeAendern("blau");
//         dach.groesseAendern(300, 20);
//         dach.horizontalBewegen(120);
//         dach.vertikalBewegen(70);
// 
//         sonne = new Kreis();
//         sonne.sichtbarMachen();
//         sonne.farbeAendern("gelb");
//         sonne.horizontalBewegen(280);
//         sonne.vertikalBewegen(-50);
//         sonne.groesseAendern(90);
//         

// 
// 
//   Kreis auge;
//         Kreis auge2;
//         Kreis iris;
//         Kreis iris2;
//         Dreieck Nase;        
//         Quadrat mund;        
//         
//         auge = new Kreis();
//         auge.sichtbarMachen();
//         auge.farbeAendern("gelb");
//         //auge.horizontalBewegen(280);
//         //auge.vertikalBewegen(-50);
//         auge.groesseAendern(58);
//            
//         
//         auge2 = new Kreis();
//         auge2.sichtbarMachen();
//         auge2.farbeAendern("gelb");
//         auge2.horizontalBewegen(50);
//         //auge.vertikalBewegen(-50);
//         auge2.groesseAendern(60);
//         
//         
//         
//         iris = new Kreis();
//         iris.sichtbarMachen();
//         iris.farbeAendern("blau");
//         iris.horizontalBewegen(5);
//         iris.vertikalBewegen(5);
//         iris.groesseAendern(48);
//            
//         
//         iris2 = new Kreis();
//         iris2.sichtbarMachen();
//         iris2.farbeAendern("blau");
//         iris2.horizontalBewegen(50);
//         iris2.horizontalBewegen(5);
//         iris2.vertikalBewegen(5);
//         iris2.groesseAendern(50);
//         
//              
//         
//         Nase = new Dreieck();
//         Nase.sichtbarMachen();
//         Nase.farbeAendern("gruen");
//         Nase.vertikalBewegen(100);
//         Nase.horizontalBewegen(15);
//         Nase.groesseAendern(40,20);
// 
//         mund = new Quadrat();
//         mund.groesseAendern(200, 10);
//         mund.vertikalBewegen(115);
//         mund.horizontalBewegen(-20);
      
        
    }
}
