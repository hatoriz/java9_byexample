/**
 * Created by nidchaya on 6/17/2017.
 */
public class Sort {
    public static void main(String[] args){

        String[] actualNames = new String[]{
                "Johnson", "Wilson","Wilkinson", "Abraham", "Dagobert"
        };

        final Sort sorter = new Sort();
        sorter.Sort(actualNames);

        for( final String name: actualNames){
            System.out.println(name);
        }
    }

    public void Sort(String[] names)
    {
        int n = names.length;

        while(n > 1){
            for (int j=0; j < n-1; j++){
                if (names[j].compareTo(names[j+1]) > 0){
                    final String tmp = names[j+1];
                    names[j+1] = names[j];
                    names[j] = tmp;
                }
            }
            n--;
        }
    }
}
