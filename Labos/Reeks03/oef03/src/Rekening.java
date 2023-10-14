public class Rekening extends Geldzaken {
    double saldo = 0;
    public Rekening(double startbedrag) {
        saldo = startbedrag;
    }
    public double getRekening() {
        return saldo;
    }
    public void stort(double bedrag){
        saldo = (saldo + bedrag);
    }
    public void haalAf(double bedrag) {
        saldo = (saldo - bedrag);
    }
    public void schrijfOver(Rekening rekening1, double bedrag) {
        rekening1.saldo = rekening1.saldo + bedrag;
        saldo = saldo - bedrag;
    }
    public String toStr() {
        return ("€" + saldo).toString();
    }
}
