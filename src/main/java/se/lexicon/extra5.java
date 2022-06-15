package se.lexicon;
/*
5. Make an integer called score and assign a value to it.
Create an if statement that should print out Hurray , You passed !”
if the score is above or equals to 65 .
If the score is Equal or between 55 and 64 it should print ” You are almost there .”.
If score is below 55 it should print ”Sorry, You did not pass.”.
 */
public class extra5 {
    public void scoreValue(){

        int score = 65;

        if (score >= 65) {
            System.out.println("Hurray , You passed!");
        } else if (score < 65 && score >= 55) {
            System.out.println("You are almost there.");
        } else {
            System.out.println("Sorry, You did not pass. :(");
        }
    }
}