package recursion;

/**
 * Given an array, check whether the array is in sorted order with recursion.
 */
public class CheckArraySorted {

    /**
     * Time Complexity: O(n). Space Complexity: O(n) for recursive stack space.
     *
     * @param A:    the array to be checked for ascending sorted feature
     * @param index
     * @return 1 if current section is sorted, otherwise 0
     */
    public static int isArraySorted(int[] A, int index) {
        if (A.length == 1) return 1;

        // if the element further down to the right is smaller than the element before it, array isn't sorted
        return (A[index - 1] < A[index - 2]) ? 0 : isArraySorted(A, index - 1);
    }

    public static void main(String[] args) {
        var A1 = new int[]{1, 2, 3, 4, 5};
        var A2 = new int[]{1, 2, 5, 4};

        System.out.println("is A1 sorted (1: yes, 0: false): "
                + isArraySorted(A1, A1.length));
    }
}

