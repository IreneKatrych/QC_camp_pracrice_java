package homework_from_lecture1;

public class Main {

    static int newVariable=4;

    public static void main (String args[]){
        /*

        task 1
        printing name in console

        */
        System.out.println("Irene Katrych");

        /*

        task 2
        printing variable less then 10

        */
        if(newVariable<10)
            System.out.println("My variable is less then 10 and equal " + newVariable);
        else System.out.println("My variable is not more then 10");

        /*

        task 3
        printing name (each symbol in new line)
        using loop FOR

        */
        String name = " Irene Katrych";
        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }

         /*

        task 4
        printing name (each symbol in new line)
        using loop WHILE

        */
        int j=0;
        while (j<name.length()){
            System.out.println(name.charAt(j));
            j++;
        }
    }
}
