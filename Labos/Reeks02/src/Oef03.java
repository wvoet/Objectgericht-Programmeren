import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Oef03 {
    public static void main(String[] args) {
        String name = "Van dievel, Gert-Jan";
        String name_cleaned = (name.toLowerCase()).replaceAll("\\s","");
        ArrayList<String> name_list = new ArrayList<String>(List.of(name_cleaned.split(",", 2)));
        String fname = name_list.get(0);
        String lname = name_list.get(1);
        System.out.println(fname+"."+lname+"@Ugent.be");
    }
}
