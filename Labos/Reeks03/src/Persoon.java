/***
 @author Wout Voet
 */
public class Persoon extends Geldzaken {
    String voornaam;
    String achternaam;
    Rekening spaarrekening;
    Rekening zichtrekening;


    public Persoon(String naam) {
        String[] split = naam.split(",");
        this.voornaam = split[0].trim();
        this.achternaam = split[1].trim();
        this.spaarrekening = new Rekening(0);
        this.zichtrekening = new Rekening(0);
    }
    double getSaldoZicht(){
        return zichtrekening.getRekening();
    }
    double getVermogen(){
        return (zichtrekening.getRekening() + spaarrekening.getRekening());
    }
    void versluisNaarSpaar(double bedrag) {
        if (bedrag > 0) {
            zichtrekening.schrijfOver(spaarrekening, bedrag);
        }
    }
    void zetOpRekening(double bedrag, boolean opSpaar) {
        if (bedrag > 0) {
            if (opSpaar) {
            this.spaarrekening.stort(bedrag);
            }
            else {
                this.zichtrekening.stort(bedrag);
            }
        }
    }
    void geefZakgeldAan(Persoon anderPersoon, double bedrag) {
        if (bedrag > 0) {
            this.zichtrekening.schrijfOver(anderPersoon.zichtrekening, bedrag);
        }
    }
    void geefSpaarcentenAan(Persoon anderPersoon, double bedrag) {
        if (bedrag > 0) {
            this.zichtrekening.schrijfOver(anderPersoon.spaarrekening, bedrag);
        }
    }

    public String toStr() {
        String str = (this.voornaam + " " + this.achternaam + " (zicht € " + this.zichtrekening.toStr() + ", spaar € " + this.spaarrekening.toStr() + ")").toString();
        return str;
    }
}
