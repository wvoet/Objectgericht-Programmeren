public class Persoon extends Geldzaken{
    String voornaam;
    String achternaam;
    Rekening spaarrekening;
    Rekening zichtrekening;


    public Persoon(String naam) {
        String[] split = naam.split(",");
        this.voornaam = split[0].trim();
        this.achternaam = split[1].trim();
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

    String toString(Persoon persoon) {
        return persoon.voornaam + " " + persoon.achternaam + " (zicht € " + persoon.zichtrekening.getRekening() + ", spaar € " + persoon.spaarrekening.getRekening()+")";
    }
}
