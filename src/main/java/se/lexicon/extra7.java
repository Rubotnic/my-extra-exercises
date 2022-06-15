package se.lexicon; 
import java.util.Scanner;
public class extra7 {
    /*
    6. Being a developer you need to learn how to search for information on the Internet.
    Open up a web browser and search for ”java input from user".
    https://www.javatpoint.com/how-to-get-input-from-user-in-java

    7. Use your new knowledge to take a String as input from the user and store it in
    a String object.
    */
    public void user1() {

        class User {
            String firstNam;
            String lastNam;
            String proLang;
        }
        User josef = new User();
        josef.firstNam = "Josef";
        josef.lastNam = "B";
        josef.proLang = "JAVA";

        String userInfo = "Users name is " + josef.firstNam + " and his last name is " + josef.lastNam + " and he is practicing " + josef.proLang + ".";
        System.out.println(userInfo);

        {
        }
    }
}

