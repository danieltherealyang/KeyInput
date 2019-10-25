import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println('\u000C'); //clear the terminal
        KeyInput.printPrompt("Welcome to my portfolio");
        KeyInput.printPrompt("Press 0 to quit");
        KeyInput.printPrompt("Press 1 for Monkey jumpers");
        KeyInput.printPrompt("Press 2 for Calculator");
        KeyInput.printPrompt("Press 3 for cool drawing");
        KeyInput.printPrompt("Press 4 for piglatinator");
        KeyInput.printPrompt("Press 5 for palReverseString");
        KeyInput.printPrompt("Press 6 for palIJ");
        KeyInput.printPrompt("Press 7 for palRecursion");
        KeyInput.printPrompt("Press 8 for shorthand");
        KeyInput.printPrompt("Press 9 to display menu");

         //create a Scanner Object
        String menuPress = KeyInput.inString(); // take user input
        while (!menuPress.equals("0")) //while loop so that 0 returns to menu
        {
            if (menuPress.equals("1")) //run Monkey Jumpers if key press is 1
            {
                KeyInput.printPrompt('\u000C'); //clear the terminal
                KeyInput.printPrompt("Welcome to Monkey jumpers");
                KeyInput.printPrompt("What jumper do you want?");
                //take user input to define the jumper 
                String jumpers = KeyInput.inString();
            
                KeyInput.printPrompt("How many jumpers do you want? (integers only)");
                //take user input to define number of jumpers
                String numJumperString = KeyInput.inString();
                //convert the String input variable to an int variable
                int numJumper = Integer.parseInt(numJumperString);
            
                MonkeyJumpers jumperObj = new MonkeyJumpers(); //run the Monkey Jumpers class
                jumperObj.runJumpers(numJumper,jumpers);
            }
            
            if (menuPress.equals("2"))
            {
                Calculator calculator = new Calculator();
                calculator.runCalculator();
            }
            
            if (menuPress.equals("3"))
            {
                CreateLogo logo = new CreateLogo();
                logo.displayLogo();
            }
            
            if (menuPress.equals("4"))
            {
                pigLatinator pigLatinate = new pigLatinator();
                pigLatinate.piglatin();
            }
            
            if (menuPress.equals("5"))
            {
                PalindromeRev palindrome = new PalindromeRev();
                palindrome.palindrome();
            }
            
            if (menuPress.equals("6"))
            {
                PalindromeIJ palIJ = new PalindromeIJ();
                palIJ.palindrome();
            }
            
            if (menuPress.equals("7")) 
            {
                PalindromeRec palRec = new PalindromeRec();
                palRec.palindrome();
            }
            if (menuPress.equals("8"))
            {
                Shorthand shorthand = new Shorthand();
                shorthand.runShorthand();
            }
            
            if (menuPress.equals("9")) //display menu option
            {
                System.out.println('\u000C'); //clear the terminal
                KeyInput.printPrompt("Welcome to my portfolio");
                KeyInput.printPrompt("Press 0 to quit");
                KeyInput.printPrompt("Press 1 for Monkey jumpers");
                KeyInput.printPrompt("Press 2 for Calculator");
                KeyInput.printPrompt("Press 3 for cool drawing");
                KeyInput.printPrompt("Press 4 for piglatinator");
                KeyInput.printPrompt("Press 5 for palReverseString");
                KeyInput.printPrompt("Press 6 for palIJ");
                KeyInput.printPrompt("Press 7 for palRecursion");
                KeyInput.printPrompt("Press 8 for shorthand");
                KeyInput.printPrompt("Press 9 to display menu");
                menuPress = KeyInput.inString();
            }
            
            KeyInput.printPrompt('\u000C'); //clear the terminal
            KeyInput.printPrompt("Welcome to my portfolio");
            KeyInput.printPrompt("Press 0 to quit");
            KeyInput.printPrompt("Press 1 for Monkey jumpers");
            KeyInput.printPrompt("Press 2 for Calculator");
            KeyInput.printPrompt("Press 3 for cool drawing");
            KeyInput.printPrompt("Press 4 for piglatinator");
            KeyInput.printPrompt("Press 5 for palReverseString");
            KeyInput.printPrompt("Press 6 for palIJ");
            KeyInput.printPrompt("Press 7 for palRecursion");
            KeyInput.printPrompt("Press 8 for shorthand");
            KeyInput.printPrompt("Press 9 to display menu");
            menuPress = KeyInput.inString();
        }
    }
    
}