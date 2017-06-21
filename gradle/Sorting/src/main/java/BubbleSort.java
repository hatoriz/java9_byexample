/**
 * Created by hatoriz on 6/21/17.
 */

//for i between 0 and (array length – 2):
//        if (array(i + 1) < array(i)):
//        switch array(i) and array(i + 1)
//
//        repeat until a complete iteration where no elements are switched.

public class BubbleSort {

    public void bubbleSort(int[] numbers){
        boolean numbersSwitched;

        do {
            numbersSwitched = false;

            for (int i = 0; i < numbers.length - 1 ; i++) {
                if (numbers[i+1] < numbers[i])
                {
                    int swap = numbers[i+1];
                    numbers[i+1] = numbers[i];
                    numbers[i] = swap;
                    numbersSwitched = true;
                }
            }

        }while(numbersSwitched);
    }

}
