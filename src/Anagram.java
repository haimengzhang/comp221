/**
 * Created by haimengzhang on 9/17/17.
 */
import java.util.Scanner;
import java.util.Arrays;

    /*
    Complete question 10 in Section 1.4.
    Your program should take two input strings from the user.
    You may assume that the two inputs are strings, and that they should be single words.
    Your program should display or return True or Yes if the two strings are anagrams, and False or No if they are not.
*/

public class Anagram {


    // Get input from users
    public String getUserInput(Scanner scan) {
        System.out.println("Enter your word:");
        if (!scan.hasNext()) {
            return "";
        }
        String word = scan.next();
        return word;
    }

    public Boolean isAnagram() {
        Scanner scan = new Scanner(System.in);
        String stringA = getUserInput(scan);
        System.out.println(stringA);
        String stringB = getUserInput(scan);
        System.out.println(stringB);

        //Removing all white spaces from stringA and stringB
        String copyOfA = stringA.replaceAll("\\s+", "").toLowerCase();
        String copyOfB = stringB.replaceAll("\\s+", "").toLowerCase();

        // set initial status to be true
        boolean status = true;

        if (copyOfA.length()== 0 || copyOfB.length()== 0) {
            System.out.print("One of your input is empty");
            status = false;
        }
        else if (copyOfA.length() != copyOfB.length()) {
            System.out.println(stringA + " and " + stringB + " are not same length, not anagrams");
            status = false;
        }
        else {
            // Converting copyOfA to char[]
            char[] toArr1 = copyOfA.toCharArray();

            //Checking whether each character of toArr1 is present in copyOfB
            for (char a : toArr1) {
                // set index to be the index of char a in copyofB
                int index = copyOfB.indexOf(a);
                // if char "a" is not present in copyOfB, returns index = -1
                if (index != -1) {
                    //If character is present in copyOfB, removing that char from copyOfB
                    copyOfB = copyOfB.substring(0, index) + copyOfB.substring(index + 1, copyOfB.length());
                } else {
                    //If element is not present in stringB, setting status as false and breaking the loop
                    status = false;
                    break;
                }

            }
        }

        // Print outcome
        if (status== true) {

            System.out.println(stringA + " and " + stringB + " are anagrams");
            return true;

        } else {

            System.out.println(stringA + " and " + stringB + " are not anagrams");
            return false;
        }

    }
    public static void main(String[] args) {
        Anagram a = new Anagram();
        a.isAnagram();
    }

}

