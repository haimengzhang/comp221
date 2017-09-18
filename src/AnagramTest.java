import org.junit.Test;

import static org.junit.Assert.*;

import java.io.*;
import java.util.Scanner;
import java.lang.*;


/**
 * Created by haimengzhang on 9/17/17.
 */
public class AnagramTest {

    Anagram ana = new Anagram();


    @Test
    public void TestAnagram() {
        String simulatedUserInput = "keep\npEEK";

        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        assertTrue(ana.isAnagram());

        String simulatedUserInput2 = "joy\nENJOY";
        System.setIn(new ByteArrayInputStream(simulatedUserInput2.getBytes()));
        assertFalse(ana.isAnagram());

        String simulatedUserInput3 = "DOG\nGOD";
        System.setIn(new ByteArrayInputStream(simulatedUserInput3.getBytes()));
        assertTrue(ana.isAnagram());

        // Check if one word contains a white space
        String simulatedUserInput4 = "DOG\nGOD ";
        System.setIn(new ByteArrayInputStream(simulatedUserInput4.getBytes()));
        assertTrue(ana.isAnagram());


        String simulatedUserInput5 = "ASTRONOMERS\nNOMORESTARS";
        System.setIn(new ByteArrayInputStream(simulatedUserInput5.getBytes()));
        assertTrue(ana.isAnagram());

        // Check if two strings are empty
        String simulatedUserInput6 = "\n";
        System.setIn(new ByteArrayInputStream(simulatedUserInput6.getBytes()));
        assertFalse(ana.isAnagram());

        // Check if the input string is two seperate words
        String simulatedUserInput7 = "ASTRONOMERS\nNOMORESTARS";
        System.setIn(new ByteArrayInputStream(simulatedUserInput7.getBytes()));
        assertTrue(ana.isAnagram());


    }
}