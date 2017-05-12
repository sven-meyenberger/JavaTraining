package interfaces;

/* Dieses Interface zwingt Unterklassen zur Implementierung der Methode getNummer() z.B. wird das gebraucht, wenn man jede Datenbankentität dazu zwingen will,
* die Methode getNummer oder getId zu implementieren. Weiter kann danach über "instanceof" gefragt werden, ob die Unterklasse dieses Interface implementiert.
* So würde Affe affe = new Affe("Test");  if(affe instanceof JavaTrainingEntity) false zurückliefern. Damit kann auch z.B. zwischen Typen unterschieden werden.
* Wenn die Methode aber immer gleich aussieht, sollte sie über die Abstraktion Tier implementiert werden, damit sie nicht jedes mal neu implementiert werden muss.*/
public interface JavaTrainingEntity {

    public int getNummer();

}
