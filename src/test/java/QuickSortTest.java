import org.example.QuickSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {
    @Test
    public void testQuickSort() {
        int[] array = {56, 456, 5, 76, 90, 23};
        int[] sortedArr = {5, 23, 56, 76, 90, 456};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(sortedArr, array);
    }

    @Test
    public void testEmpty() {
        int[] array = {};
        int[] sortedArr = {};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(sortedArr, array);
    }

    @Test
    public void testAlreadySorted() {
        int[] array = {5, 23, 56, 76, 90, 456};
        int[] sortedArr = {5, 23, 56, 76, 90, 456};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(sortedArr, array);
    }

    @Test
    public void testWithNegativeNumbers() {
        int[] array = {56, -456, 5, 76, 90, 23};
        int[] sortedArr = {-456, 5, 23, 56, 76, 90};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(sortedArr, array);
    }

    @Test
    public void testWithSingleElement() {
        int[] array = {10};
        int[] sortedArr = {10};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(sortedArr, array);
    }
}
