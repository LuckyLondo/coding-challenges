import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RotateLeft {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List list = Arrays.asList(arr);
        rotateLeft(7, list);
    }

    // Complete the twoStrings function below.
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        LinkedList<Integer> linkedList = new LinkedList<>(arr);

        for (int i=0; i< d; i++) {
            Integer toMove = linkedList.getFirst();
            linkedList.remove(toMove);
            linkedList.add(toMove);
        }

        return linkedList;
    }

}
