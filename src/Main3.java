import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("AnaaAnaa");
        names.add("Maria");
        names.add("Gigel are mere");

        ArrayList<String> set1 = new ArrayList<>();

        // Sa afisam textele cu numar par de cararctere
        //Sa afisam numarul de caractere cu numar par de carearctere dar doar

        /*Optional<String> res =*/ names.stream()
                .filter(x -> x.length() % 2 == 0)
                .map(x -> x.length())
                .filter(x -> x > 2)
                .map(x -> 2*x)
                .forEach(x -> System.out.println(x));

                /*.findFirst();*/
//        res.ifPresent(x -> System.out.println(x));
                /*.mapToInt(x -> x.length())
                .sum();*/

//                .forEach(x -> System.out.println(x.length())); x.length nu mai functioneaza pt ca x.length nu mai este string


//        for (String x: names) {
//            if (x.length() > 3) {
//                set1.add(x);
//            }
//        }
//        for (String x: set1) {
//            if (x.contains("m")) {
//                System.out.println(x);
//            }
//        }
//        List<String> newList = names.stream()
//                .filter(x -> x.length() > 3)
//                .filter(x -> x.contains("m"))
//                .collect(Collectors.toList());
//        System.out.println(newList);
    }
}
