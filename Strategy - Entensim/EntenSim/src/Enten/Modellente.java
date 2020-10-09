package Enten;

import FlugVerhalten.KeinFliegen;
import QuakVerhalten.StummesQuaken;
import Vater.Ente;

public class Modellente extends Ente{

    public Modellente(){
        setFlugVerhalten(new KeinFliegen());
        setQuakVerhalten(new StummesQuaken());
    }
    public void anzeigen(){
        System.out.println("Ich bin eine Modellente");
    }
}
