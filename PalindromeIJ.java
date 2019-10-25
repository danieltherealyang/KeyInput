import java.util.*;
public class PalindromeIJ
{
    
    public void palindrome()
    {
        
        KeyInput.printPrompt('\u000C');
        Scanner scannerObj = new Scanner(System.in);
        KeyInput.printPrompt("Press Q/q to exit Palindrome");
        KeyInput.printPrompt("Press any key to Palindrome check");
        String preexit = KeyInput.inString();
        String exit = preexit.toLowerCase();
        
        while (!exit.equals("q"))
        {
            KeyInput.printPrompt('\u000C');
            KeyInput.printPrompt("Enter a string: " );
            String checkString = KeyInput.inString();
            KeyInput.printPrompt(checkString);
            
            IJ ijCheck = new IJ();
            boolean result = ijCheck.pCheck(checkString);
            if (result == true) {
                KeyInput.printPrompt("Yes, the string you entered is a palindrome.");
            } else {
                KeyInput.printPrompt("No, the string you entered is NOT a palindrome.");
            }
            
            KeyInput.printPrompt("Press Q/q to exit Palindrome");
            KeyInput.printPrompt("Press any key to Palindrome check");
            preexit = KeyInput.inString();
            exit = preexit.toLowerCase();
        }
    }
}