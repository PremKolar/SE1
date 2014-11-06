
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
     * Zeichne die Zeichnung.
     */
    public void zeichne()
    {
        Quadrat wand;
        Quadrat fenster;
        Dreieck dach;
        Kreis sonne;
        Kreis auge;
        Kreis auge2;
        Kreis iris;
        Kreis iris2;
        Dreieck Nase;        
        Quadrat mund;        
        
        auge = new Kreis();
        auge.sichtbarMachen();
        auge.farbeAendern("gelb");
        //auge.horizontalBewegen(280);
        //auge.vertikalBewegen(-50);
        auge.groesseAendern(58);
           
        
        auge2 = new Kreis();
        auge2.sichtbarMachen();
        auge2.farbeAendern("gelb");
        auge2.horizontalBewegen(50);
        //auge.vertikalBewegen(-50);
        auge2.groesseAendern(60);
        
        
        
        iris = new Kreis();
        iris.sichtbarMachen();
        iris.farbeAendern("blau");
        iris.horizontalBewegen(5);
        iris.vertikalBewegen(5);
        iris.groesseAendern(48);
           
        
        iris2 = new Kreis();
        iris2.sichtbarMachen();
        iris2.farbeAendern("blau");
        iris2.horizontalBewegen(50);
        iris2.horizontalBewegen(5);
        iris2.vertikalBewegen(5);
        iris2.groesseAendern(50);
        
             
        
        Nase = new Dreieck();
        Nase.sichtbarMachen();
        Nase.farbeAendern("gruen");
        Nase.vertikalBewegen(100);
        Nase.horizontalBewegen(15);
        Nase.groesseAendern(40,20);

        mund = new Quadrat();
        mund.groesseAendern(200, 10);
        mund.vertikalBewegen(115);
        mund.horizontalBewegen(-20);
        
        
//         
//         fenster = new Quadrat();
//         fenster.sichtbarMachen();
//         fenster.farbeAendern("gruen");
//         fenster.horizontalBewegen(50);
//         fenster.vertikalBewegen(30);
//         fenster.groesseAendern(100);
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
//         wand = new Quadrat();
//         wand.sichtbarMachen();
//         wand.farbeAendern("gelb");
//         wand.vertikalBewegen(80);
//         wand.groesseAendern(100);
//     
//         wand = new Quadrat();
//         wand.sichtbarMachen();
//         wand.farbeAendern("gruen");
//         wand.vertikalBewegen(80);
//         wand.groesseAendern(100);
//         wand.horizontalBewegen(200);
        
    }
}
