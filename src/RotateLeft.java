import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * This is a coding challenge from HackerRank as part of the
 *
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
 */
public class RotateLeft {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List list = Arrays.asList(arr);
        rotateLeft(7, list);
    }

    /**
     * This rotates a list a given number and returns a new list
     *
     * @param numberToRotateLeft - Number to rotate the List left
     * @param integerList - List of Integers that needs to be rotated
     * @return linkedList - Newly created and rotated list
     */
    public static List<Integer> rotateLeft(int numberToRotateLeft, List<Integer> integerList) {
        LinkedList<Integer> linkedList = new LinkedList<>(integerList);

        for (int i=0; i< numberToRotateLeft; i++) {
            Integer toMove = linkedList.getFirst();
            linkedList.remove(toMove);
            linkedList.add(toMove);
        }

        return linkedList;
    }

}
