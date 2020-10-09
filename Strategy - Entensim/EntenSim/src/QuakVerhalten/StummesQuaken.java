package QuakVerhalten;

public class StummesQuaken implements QuakVerhalten{
    @Override
    public void quaken() {
        System.out.println("Kann nicht quaken :(");
    }
    
}
