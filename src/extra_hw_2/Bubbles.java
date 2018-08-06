package extra_hw_2;

/*
створити метод який вміє сортувати масив
методом "Бульбашки"
*/

public class Bubbles {

    public void methodBubble(int [] getArray){

        for (int i = getArray.length-1; i>0; i--) {

            for (int j = 0; j < i; j++) {

                if (getArray[j]>getArray[j+1]){
                    int temporaryNumber = getArray[j];
                    getArray[j]=getArray[j+1];
                    getArray[j+1]=temporaryNumber;
                }
            }
        }

        for (int i = 0; i <getArray.length ; i++) {
            System.out.print(getArray[i] + "  ");
        }
    }


    public static void main(String args []){

        System.out.println("Random array: ");
        int randomNumbers[] = new int[10];
        for(int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int)(Math.random() * 100);
            System.out.print(randomNumbers[i] + "  ");
        }
        System.out.println(" ");
        System.out.println("Sorted using method Bubble array: ");
        Bubbles sortedNumbers = new Bubbles();
        sortedNumbers.methodBubble(randomNumbers);
    }
}
