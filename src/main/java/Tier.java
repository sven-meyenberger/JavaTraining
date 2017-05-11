
public abstract class Tier {

    private String name;
    private String art;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getArt();

    public abstract void setArt(String art);
}
