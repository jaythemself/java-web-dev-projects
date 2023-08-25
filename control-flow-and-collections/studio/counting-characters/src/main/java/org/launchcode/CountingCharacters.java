package org.launchcode;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
public class CountingCharacters
{
    public static void main(String[] args) throws FileNotFoundException {
        //use Scanner here to get user input, close scanner after stored user input in new variable (input.close();)
        //other bonus directions: make character counts case-insensitive and exclude spaces/punctuation (validation)
        //System.out.println("Gandalf".toLowerCase().equals("gandalf")); prints true. if/else/else if identical to js
        //Scanner input = new Scanner(System.in);
            //System.out.println("Please enter a sentence");
            //String inputToCount = input.nextLine();
            //for (int i = input.length() - 1 etc etc)
                //if (nobleName.equals("")) {title = ""} else if etcetc else {System.out.println("Sorry, input is invalid.");}
                //System.out.println(noble.get("keyname") + " is " + noble.get("keyvalue"));

        File file = new File("C:\\Users\\void-\\Documents\\Git-Exercises\\intelliJ-Projects\\samplestring.txt");
        //if file works, Scanner changes to be Scanner input = new Scanner(file); and otherwise same as before

        Scanner input = new Scanner(file);
        System.out.println("Please enter a sentence: ");
        String str = input.nextLine().toLowerCase(Locale.ROOT).replaceAll("[^a-zA-Z]", "");
        //String str = "Hello World!";
        //HashMap char as a key and occurrence as a value
        HashMap <Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str.length() - 1; i++)
        //for (int i = str.length() - 1; i >= 0; i--) basically same thing but iterating through backwards, correct?
        {
            if(charCount.containsKey(str.charAt(i)))
            {
                int count = charCount.get(str.charAt(i));
                charCount.put(str.charAt(i), ++count);
            }
            else
            {
                charCount.put(str.charAt(i),1);
            }
        }
        System.out.println(charCount);
    }
}
