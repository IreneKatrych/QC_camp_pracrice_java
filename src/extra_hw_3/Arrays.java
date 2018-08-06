package extra_hw_3;

/*
Ознайомитися із двовимірним масивом,
та створити метод який повинен знаходити і виводити
максимальне і мінімальне значення у двовимірному масиві
*/

public class Arrays {

    public int getMin(int [][] arr){
        int min=arr[0][0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (min>arr[i][j]) min=arr[i][j];
            }
            
        }
        return min;
    }

    public int getMax(int [][] arr){
        int max=arr[0][0];;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (max<arr[i][j]) max=arr[i][j];
            }

        }
        return max;
    }


    public static void main (String args[]){

        System.out.print("New Array: ");
        int [][] doubleArray = new int [5][8];
        for (int i = 0; i < 5 ; i++) {

            System.out.println(" ");
            for (int j = 0; j < 8 ; j++) {

                doubleArray[i][j] = (int)(Math.random() * 100);
                System.out.print(doubleArray[i][j] + "   ");
            }
        }
        System.out.println(" ");

        Arrays num = new Arrays();
        System.out.println("Minimum = " + num.getMin(doubleArray) );
        System.out.println("Maximum = " + num.getMax(doubleArray) );
    }
}
