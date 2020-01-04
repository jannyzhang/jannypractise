package How2j;

public class ADHero extends Hero implements Mortal{

    @Override
    public void die(){
        System.out.println("ADHero" );
    }
}
