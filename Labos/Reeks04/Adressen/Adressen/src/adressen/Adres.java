package adressen;

public class Adres {
    public static void main(String[] args) {}
    int postcode;
    String gemeente;
    String straat;
    int huisnummer;
    String bus;
    public Adres(int postcode, String gemeente, String straat, int huisnummer, String bus) {
        this.postcode = postcode;
        this.gemeente = gemeente;
        this.straat = straat;
        this.huisnummer = huisnummer;
        this.bus = bus;
    }

    public Adres(int postcode, String gemeente, String straat, int huisnummer){
        this.postcode = postcode;
        this.gemeente = gemeente;
        this.straat = straat;
        this.huisnummer = huisnummer;
        this.bus = null;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getStraat() {
        return straat;
    }

    public String getGemeente() {
        return gemeente;
    }
    public String toString(){
        if (bus != null) {
            return (this.straat + " " + this.huisnummer + " bus " + this.bus + "\n" + this.postcode + this.gemeente).toString();
        }
        else {
            return (this.straat + " " + this.huisnummer + "\n" + this.postcode + this.gemeente).toString();
        }
    }
}
