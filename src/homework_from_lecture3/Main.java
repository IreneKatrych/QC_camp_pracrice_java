package homework_from_lecture3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main (String args[]){

        /*
        task 1
        creating and printing Array
        */
        System.out.println("Array: ");
        int[] someNumbers = {4, 2, 6, 8, 10, 12, 22, 46, 38};
        for(int i = 0; i<someNumbers.length; i++){
            System.out.print(someNumbers[i] + " ");}

        System.out.println(" ");
        System.out.println("Sorted Array: ");

        Arrays.sort(someNumbers);   //sorting Array
        for(int i = 0; i<someNumbers.length; i++){
            System.out.print(someNumbers[i] + " ");}
        System.out.println(" ");

        /*
        task 2
        creating Array via List
        */
        System.out.println("List: ");
        List<Integer> numbers = Arrays.asList(2, 6, 3, 1, 7, 1, 6, 8, 11);
        for(int i = 0; i<numbers.size(); i++){
            System.out.print(numbers.get(i) + " ");}

        System.out.println(" ");
        System.out.println("Sorted List: ");

        Collections.sort(numbers);  //sorting ListArray
        for(int i = 0; i<numbers.size(); i++){
            System.out.print(numbers.get(i) + " ");}

        System.out.println(" ");

        /*
        task 4
        creating empty collection
        */
        Set newSet =  new HashSet();
        //checking is collection empty
        if (newSet.isEmpty()==true){
            //throwing exception
            throw new NullPointerException ("Current collection is empty!!!");
        } else {System.out.println("There is something.");}

    }

}
