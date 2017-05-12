package abstraction;

/* Abstrakte Klassen dienen als Vorlage für andere Klassen (extends)
*       * Methoden die genau so verwendet werden sollen, werden hier wie gewohnt definiert.
*       * Methoden die die Klasse haben soll, aber je nach Bedarf anderst aussehen, werden als abstrakt markiert, diese haben keinen Body, die Extend-Klasse
*         wird gezwungen eine Methode mit diesme Namen zu implementieren
* */
public abstract class Tier {

    private String name;
    private int gewichtInKG;
    private int preisProKG;

    /* Jede Extend-Klasse kann diese Methode verwenden, auch wenn sie sie nicht selbst implementiert */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGewichtInKG(int gewichtInKG) {
        this.gewichtInKG = gewichtInKG;
    }

    public void setPreisProKG(int preisProKG) {
        this.preisProKG = preisProKG;
    }

    public int getGewichtInKG() {
        return gewichtInKG;
    }

    public int getPreisProKG() {
        return preisProKG;
    }

    /* Die Extend-Klasse wird gezwungen die folgende Methode zu implementieren */
    public abstract int getPreis();
}
