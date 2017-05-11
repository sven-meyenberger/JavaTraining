
public class Auto implements Fahrzeug, Nummernschild {

    private String name;
    private int jahrgang, ps, nummer;

    public Auto(String name, int jahrgang, int ps) {
        setName(name);
        setJahrgang(jahrgang);
        setPS(ps);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang) {
        this.jahrgang = jahrgang;
    }

    public int getPS() {
        return ps;
    }

    public void setPS(int ps) {
        this.ps = ps;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }
}
