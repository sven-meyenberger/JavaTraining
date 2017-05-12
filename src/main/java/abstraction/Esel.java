package abstraction;

import interfaces.JavaTrainingEntity;

/* Die Klasse Esel hat nun alle Methoden der Oberklasse Tier und hat die Methode Preis implementiert */
/* Mit dem implements der JavaTrainingEntity zwinge ich die Klasse, die Methode getNummer() zu implementieren */
public class Esel extends Tier implements JavaTrainingEntity {

    private String name;

    public Esel(String name) {
        this.name = name;
    }

    public int getPreis() {
        return getGewichtInKG() * getPreisProKG() * 15;
    }

    /* Mit @Override können Methoden der Oberklasse überschrieben werden. In diesem Fall müsste jedoch auch die Methode setName() überschrieben werden,
    * da sonst der Name nicht mehr gesetzt werden kann.*/
    @Override
    public String getName() {
        return name + " override";
    }


    public int getNummer() {
        return 0;
    }
}
