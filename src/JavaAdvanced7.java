import java.util.ArrayList;
import java.util.List;

public class JavaAdvanced7 {
    public static void main(String[] args) {
        String ana = "Ana are mere";
        String b = ana.substring(2, 6);
        b.toLowerCase();
    }

    public static boolean search(List<Integer> source, int toFind) {
    boolean found = false;
    for (int i=0; i<source.size(); i++) {
        if (source.get(i) == toFind) {
            found = true;
            break;
        }
    }
    return found;
    }

    public static List<Integer> sort(List<Integer> source) {
        List<Integer> sorted = new ArrayList<>();
        for (int i = 0; i<source.size(); i++) {
            int currentElement = source.get(i);
            List<Integer> toRight = source.subList(i+1, source.size());
            int minRight = min(toRight);
            if (currentElement>=minRight) {
                sorted.add(minRight);
                source.remove(minRight);
                source.add(currentElement);
            } else {
                sorted.add(currentElement);
            }
        }
        return sorted;
    }
    public static int min(List<Integer> source) {
        int min = source.get(0);
        for (int i=0; i<source.size(); i++) {
            if (min > source.get(i)) {
                min = source.get(i);
            }
        }
        return min;
    }
}
