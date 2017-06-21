import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hatoriz on 6/21/17.
 */
public class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();
    int[] numbers = {6, 4, 9, 5};
    int[] expects = {4, 5, 6, 9};

    @Test
    public void testBubbleSort() throws Exception {
        bubbleSort.bubbleSort(numbers);
        Assert.assertArrayEquals(expects, numbers);
    }
}