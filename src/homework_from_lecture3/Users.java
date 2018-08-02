package homework_from_lecture3;

//task 3

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class Users {

    //creating Enum
    public enum User {
        DETECTIVE ("Holmes", "444444"  ),
        DOCTOR ("Watson ", "222222" ),
        PROFESSOR ("Moriarty ", "123123" );

        private  String name ;
        private String pass ;

        //creating Constructor
        User  (final String name , final String pass )
        { this.name = name;
            this.pass = pass;}
    }

    //creating method using annotation Before
    @Before
    public void startPrint () {
        System.out.println("Start printing user credentials");
    }

    //creating method using annotation Test
    @Test
    public void printUserCredentials () {
        System.out.println("User 1: name is " + User.DETECTIVE.name +
                " and password is " + User.DETECTIVE.pass);
        System.out.println("User 2: name is " + User.DOCTOR.name +
                " and password is " + User.DOCTOR.pass);
        System.out.println("User 3: name is " + User.PROFESSOR.name +
                " and password is " + User.PROFESSOR.pass);
    }

    //creating method using annotation After
    @After
    public void finishPrint () {
        System.out.println("Finish printing user credentials");
    }

}


