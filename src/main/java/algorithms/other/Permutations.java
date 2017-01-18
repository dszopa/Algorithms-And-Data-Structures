package algorithms.other;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    /**
     * A standard recursive algorithm for creating a list of permutations of a list.
     * @param list
     *  The list that we will be getting all permutations for.
     * @param <T>
     *  The type of the element sorted in list
     * @return
     *  The list of all possible permutations of the input list.
     */
    public static <T> List<List<T>> permutations(List<T> list) {
        if (list.size() == 0) {
            List<List<T>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }
        T firstElement = list.remove(0);
        List<List<T>> returnValue = new ArrayList<>();
        List<List<T>> permutations = permutations(list);
        for (List<T> lesserPermutation : permutations) {
            for (int i = 0; i <= lesserPermutation.size(); i++) {
                List<T> temp = new ArrayList<>(lesserPermutation);
                temp.add(i, firstElement);
                returnValue.add(temp);
            }
        }
        return returnValue;
    }
}
