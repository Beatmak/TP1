package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Orange o=new Orange(3.45,"France");
        Orange o1=new Orange(3.45,"France");
        Orange o2=new Orange(66.66,"Allemagne");
        Panier p=new Panier(3);
        Panier p2=new Panier(5);
        p.putOrange(o);
        p.putOrange(o1);
        p.putOrange(o2);
        
        p2.putOrange(o);
        p2.putOrange(o1);
        p2.putOrange(o2);
        p2.putOrange(o2);
        p.boycotte("Allemagne");
        System.out.println(p.toString());
    }
}