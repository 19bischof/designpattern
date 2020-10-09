package Enten;

import java.util.List;

import FlugVerhalten.*;
import QuakVerhalten.*;
import Vater.Ente;


public class Lockente extends Ente {

    public Lockente (){
        
        List <FlugVerhalten> darfFliegen = getAllowedFlugModi();
        System.out.println("0.5");
        darfFliegen.add(new KeinFliegen());
        System.out.println("1");
        List <QuakVerhalten> darfQuaken = getAllowedQuakModi();
        darfQuaken.add(new StummesQuaken());
        System.out.println("2");

        setAllowedFlugModi(darfFliegen);
        setAllowedQuakModi(darfQuaken);
        System.out.println("3");

        setFlugVerhalten(new KeinFliegen());
        setQuakVerhalten(new StummesQuaken());
        }
        public void anzeigen(){
            System.out.println("Ich bin eine Lockente");
        }
        @Override
    public void setFlugVerhalten(FlugVerhalten flugVerhalten){
        List <FlugVerhalten> list = getAllowedFlugModi();
        for (int i = 0;i < list.size();i++){
        if(flugVerhalten.getClass() == list.get(i).getClass()){
            super.setFlugVerhalten(flugVerhalten);
        }
    }
    }
    @Override
    public void setQuakVerhalten(QuakVerhalten quakVerhalten) {
        List <QuakVerhalten> list = getAllowedQuakModi();
        for (int i = 0;i < list.size();i++){
        if(quakVerhalten.getClass() == list.get(i).getClass()){
            super.setQuakVerhalten(quakVerhalten);
        }
    }
    }
    
}
