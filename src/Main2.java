import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> nrs = new ArrayList<>();
//        nrs.add(4); nrs.add(2); nrs.add(7);
        nrs.add("abc"); nrs.add("a"); nrs.add("Maria");
//        Collections.sort(nrs, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        });
        Collections.sort(nrs, (String a, String b) -> {return 0;});
        System.out.println(nrs);
    }
}
