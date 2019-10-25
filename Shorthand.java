import java.util.*;
public class Shorthand
{
    Scanner scannerObj = new Scanner(System.in);
    public void runShorthand()
    {
        KeyInput.printPrompt('\u000C');
        KeyInput.printPrompt("Press Q/q to exit Palindrome");
        KeyInput.printPrompt("Press any key to Palindrome check");
        String preexit = KeyInput.inString();
        String exit = preexit.toLowerCase();
        
        while (!exit.equals("q"))
        {
            KeyInput.printPrompt('\u000C');
            KeyInput.printPrompt("Enter a message: ");
            
            String message = KeyInput.inString();
            String[] words = message.split("\\s+");
            String space = " ";
            for (int i = 0; i < words.length; i++)
            {
                String noVowel = words[i].replaceAll("[AEIOUaeiou]", "");
                if (noVowel.matches("(?i)nd"))
                {
                    System.out.print("&" + space);
                } else
                if (noVowel.matches("(?i)t"))
                {
                    System.out.print("2" + space);
                } else
                if (noVowel.matches("(?i)y"))
                {
                    System.out.print("U" + space);
                } else 
                if (noVowel.matches("(?i)fr"))
                {
                    System.out.print("4" + space);
                } else
                {
                    System.out.print(noVowel + space);
                }
            }
            /*
            String noAnd = message.replaceAll("(?i)and", "&");
            String noTo = noAnd.replaceAll("(?i)to", "2");
            String noYou = noTo.replaceAll("(?i)you", "U");
            String noFor = noYou.replaceAll("(?i)for", "4");
            String shorthand = noFor.replaceAll("[AEIOUaeiou]", "");
            
            KeyInput.printPrompt(shorthand);
            */
            System.out.print('\n');
            KeyInput.printPrompt("Press Q/q to exit Palindrome");
            KeyInput.printPrompt("Press any key to Palindrome check");
            preexit = KeyInput.inString();
            exit = preexit.toLowerCase();
        }
    }
}