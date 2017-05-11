public class Main {

    public static void main(String [] args)
    {
        Fahrzeug fahrzeug = new Auto("test", 1 , 1);
        System.err.println(fahrzeug.getName());

        Affe affe = new Affe("BOBO");
        System.err.println(affe.getName());

        Tier tier = new Affe("BUBU");
        System.err.println(tier.getName());
    }
}
