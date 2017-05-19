package cast;

public class Cast {

    public static void main(String [] args) {


        byte byteEins = 15;
        byte byteZwei = 15;

        short shortEins = 1;
        short shortZwei = 2;

        int intEins = 1;
        int intZwei = 2;

        long longEins = 1;
        long longZwei = 2;

        double doubleEins = 1;
        double doubleZwei = 2;

        //byte byteDrei = byteEins * byteZwei;
        //short shortDrei = shortEins * shortZwei;
        int intDrei = intEins * intZwei;
        //short shortVier = byteEins * shortEins;

        byte byteDrei = (byte) (byteEins * byteZwei);
        System.err.println(byteDrei);

        int intBigger = (intZwei > intEins) ? intEins : intZwei;
        System.err.println(intBigger);

        System.err.println(Math.abs(2.0234242344324433452345 - 1.3223234234324424423525));
        System.err.println(2.0234242344324433452345 - 1.3223234234324424423525);
    }
}
