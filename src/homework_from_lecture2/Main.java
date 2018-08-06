package homework_from_lecture2;

public class Main {

    public static void main (String args[]){

        //declaring new object DOG
        Animal dog = new Animal("Dog", 4, "Wof!");
        //calling method GO
        dog.go(4);
        //calling method SAY
        dog.say("Wof!");
        //calling method Print Info
        dog.printInfo();

        //declaring new object CAT
        Animal cat = new Animal("CAT", 8, "Give me food!!!");
        //calling method GO
        cat.go(8);
        //calling method SAY
        cat.say("Give me food!!!");
        //calling method Print Info
        cat.printInfo();
    }
}
