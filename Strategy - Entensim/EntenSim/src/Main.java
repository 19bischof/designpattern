import Enten.Lockente;
import Enten.Modellente;
import FlugVerhalten.Fliegen;
import QuakVerhalten.Quietschen;
import Vater.Ente;
public class Main {
    public static void main(String[] args) {
        System.out.println("0");
        Ente Donald = new Lockente();
        Donald.anzeigen();
        Donald.schwimmen();
        Donald.quaken();
        Donald.fliegen();
        System.out.println("______________________________________________________________");
        Ente Gustav = new Modellente();
        Gustav.anzeigen();
        Gustav.schwimmen();
        Gustav.quaken();
        Gustav.fliegen();
        Gustav.setFlugVerhalten(new Fliegen());
        Gustav.setQuakVerhalten(new Quietschen());
        System.out.println("\n<<Modellente PowerUP >>\n");
        Gustav.anzeigen();
        Gustav.schwimmen();
        Gustav.quaken();
        Gustav.fliegen();
        
    }
}
