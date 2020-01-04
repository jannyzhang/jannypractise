package How2j;

public class APHero extends Hero implements Mortal{

    @Override
    public void die(){
        System.out.println("APHero");
    }
}
