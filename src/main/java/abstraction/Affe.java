package abstraction;

public class Affe extends Tier {

    public Affe(String name) {
        setName(name);
    }

    public int getPreis() {
        return getGewichtInKG() * getPreisProKG() * 10;
    }
}
