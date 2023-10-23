package adressen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdressenDAO {

    public void main(String[] args){new AdressenDAO("adressen.csv");}
    private Adres[] adressen = new Adres[5000];
    public AdressenDAO(String bestandsnaam){
        try {
            File adressenBestand = new File(bestandsnaam);
            Scanner myReader = new Scanner(adressenBestand);
            while (myReader.hasNextLine()) {
                myReader.useDelimiter(";");
                System.out.println(myReader);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Bestand niet gevonden.");
            e.printStackTrace();
        }

    }
}
