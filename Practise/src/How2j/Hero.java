package How2j;

public class Hero {

    public void kill(Mortal m){
        m.die();
    }

    public static void main(String[] args){
        Hero galon = new Hero();
        APHero ap = new APHero();
        ADHero ad = new ADHero();
        ADAPHero adap = new ADAPHero();

        galon.kill(ap);
        galon.kill(ad);
        galon.kill(adap);

    }
}
