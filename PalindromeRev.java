import java.util.*;
public class PalindromeRev
{
    static String reverseString(String string)
    {
        StringBuffer bufferString = new StringBuffer(string);
        bufferString.reverse();
        return bufferString.toString();
    }
    
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
            System.out.print("Enter a string: " );
            String checkString = KeyInput.inString();
            KeyInput.printPrompt(checkString);
            
            String check = checkString.toLowerCase();
            check = check.replaceAll("[^a-zA-Z0-9]", ""); //remove nonalphanumeric
            check = check.replaceAll("\\s+",""); 
            String reversed = reverseString(check);
            
            if (checkString.length() <= 1)
            {
                KeyInput.printPrompt("No, the string you entered is NOT a palindrome.");                
            } else { 
                if (reversed.equals(check))
                {
                    KeyInput.printPrompt("Yes, the string you entered is a palindrome.");
                } else {
                    KeyInput.printPrompt("No, the string you entered is NOT a palindrome.");
                }
            }
            
            KeyInput.printPrompt("Press Q/q to exit Palindrome");
            KeyInput.printPrompt("Press any key to Palindrome check");
            preexit = KeyInput.inString();
            exit = preexit.toLowerCase();
        }
    }
}