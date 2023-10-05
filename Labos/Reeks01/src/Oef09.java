import static java.lang.Math.random;

public class Oef09 {
    public static void main(String[] args) {
        double x;
        x = random(-1000,1000);
        int teller = 1;
        int noemer = 2;
        double breuk = (1.0*teller) / noemer;
        double exponent = (x * x * x);
        int noemerX = 3;
        double midden = 0;


        for (int i = 0; i < 9; i++) {
            midden += breuk * (exponent/(1.0*noemerX));
            teller += 2;
            noemer += 2;
            breuk *=  (1.0*teller)/noemer;
            noemerX += 2;
            exponent *= x*x;
        }
        double bgsin = x + midden;
        System.out.println(bgsin);
        System.out.println(Math.asin(x));
    }
}