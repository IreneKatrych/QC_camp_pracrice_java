package extra_hw_1;

/*
створити метод який повинен приймати колекцію на вхід
і повинен вміти сказати чи є в даній колекції дублювання даних
*/

import java.util.Collections;
import java.util.ArrayList;

public class CollectionHW {

    private Boolean isDuplicatedData(ArrayList someColl) {
        boolean isSame = false;
        Collections.sort(someColl);
        for(int i=1; i<someColl.size(); i++) {
            if (someColl.get(i) == someColl.get(i-1))
                isSame=true;
        }

        return isSame;
    }

    public static void main(String args[]) {

        ArrayList<Integer> someNumbers = new ArrayList<>();
        someNumbers.add(1);
        someNumbers.add(4);
        someNumbers.add(10);
        someNumbers.add(5);
        someNumbers.add(5);
        someNumbers.add(23);

        System.out.println("Arraylist: ");
        for(int i = 0; i< someNumbers.size(); i++){
            System.out.print( someNumbers.get(i) + " " );
        }

        System.out.println(" ");
        CollectionHW example = new CollectionHW();
        System.out.println("Is there duplicated data? " + example.isDuplicatedData(someNumbers));
    }

}
