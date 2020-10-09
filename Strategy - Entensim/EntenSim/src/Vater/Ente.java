package Vater;

import java.util.ArrayList;
import java.util.List;

import FlugVerhalten.*;
import QuakVerhalten.*;


public abstract class  Ente{
private List <FlugVerhalten> allowedFlugModi = new ArrayList<FlugVerhalten>();
private List <QuakVerhalten> allowedQuakModi = new ArrayList <QuakVerhalten>();
    private FlugVerhalten flugVerhalten;
    private QuakVerhalten quakVerhalten;
    public void schwimmen(){
        System.out.println("Ich schwimme !");
    }
    public abstract void anzeigen();

    public void setFlugVerhalten(FlugVerhalten flugVerhalten) {
        this.flugVerhalten = flugVerhalten;
    }
    public void setQuakVerhalten(QuakVerhalten quakVerhalten) {
        this.quakVerhalten = quakVerhalten;
    }
    public void fliegen(){
        flugVerhalten.fliegen();
    }
    public void quaken(){
        quakVerhalten.quaken();
    }
public void setAllowedFlugModi(List<FlugVerhalten> allowedFlugModi) {
    this.allowedFlugModi = allowedFlugModi;
}
public void setAllowedQuakModi(List<QuakVerhalten> allowedQuakModi) {
    this.allowedQuakModi = allowedQuakModi;
}
public List<FlugVerhalten> getAllowedFlugModi() {
    return allowedFlugModi;
}
public List<QuakVerhalten> getAllowedQuakModi() {
    return allowedQuakModi;
}

}