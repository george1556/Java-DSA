import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {
    public static void main(String[] args) {

        Algorithm algorithm = new Algorithm();
        //      *********  Method #1 allEqual  *********
        System.out.println(algorithm.allEqual("aaa"));
        System.out.println(algorithm.allEqual("bbBbbbb"));
        System.out.println(algorithm.allEqual("bbaabb"));
        System.out.println(algorithm.allEqual(""));

        //      *********  Method #2 letterCount  *********
        System.out.println(algorithm.letterCount("aaaBbAddD"));

        //      *********  Method #3 interleave  *********
        System.out.println(algorithm.interleave(Arrays.asList("a", "b", "c"), Arrays.asList("d", "e", "f")));
        System.out.println(algorithm.interleave(Arrays.asList("a", "c", "e"), Arrays.asList("b", "d", "f")));
        System.out.println(algorithm.interleave(Collections.emptyList(), Collections.emptyList()));

    }
}

//ignore build and gradle




