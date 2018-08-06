package homework_from_lecture2;

public class Animal {

    // declaring variables
    private String name;
    private int steps;
    private String word;

    //creating constructor
    Animal(String name, int steps, String word){
        this.name=name;
        this.steps=steps;
        this.word=word;
    }

    //creating method GO
    @Deprecated
    public int go(int steps){
        this.steps=steps;
        return steps;
    }

    //creating method SAY
    @Deprecated
    public String say(String word){
        this.word=word;
        return word;
    }

    //creating method PRINT INFORMATION
    public void printInfo() {
        System.out.println("This Animal called "+ name +" and makes "+ steps
                +" steps. It likes to say: "+ word );
    }
}
