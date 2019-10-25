import java.util.*;
import java.util.regex.*;
public class pigLatinator
{
    static boolean noVowelCheck(String word)
    {
        if (
            !word.toLowerCase().contains("a".toLowerCase()) &&
            !word.toLowerCase().contains("e".toLowerCase()) &&
            !word.toLowerCase().contains("i".toLowerCase()) &&
            !word.toLowerCase().contains("o".toLowerCase()) &&
            !word.toLowerCase().contains("u".toLowerCase()))
        {
            return true;
        } else {
            return false;
        }
    }
        
    static boolean startVowelCheck(String word)
    {
        char firstChar = Character.toLowerCase(word.charAt(0));
        if (firstChar == 'a' ||
            firstChar == 'e' ||
            firstChar == 'i' ||
            firstChar == 'o' ||
            firstChar == 'u')
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
        
    static int firstVowelIndex(String word)
    {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        String lowercaseWord = word.toLowerCase();
        for (int i = 0; i < lowercaseWord.length(); i++)
        {
            for (int v = 0; v < vowels.length; v++)
            {
                if (lowercaseWord.charAt(i) == vowels[v])
                {
                    return i;
                }
            }
        }
        return -1;
    }
    
    static char punctIndex(String word)
    {
        for (int i = 0; i < word.length(); i++)
        {
            String character = Character.toString(word.charAt(i));
            if (Pattern.matches("\\p{Punct}", character))
            {
                return word.charAt(i);
            }
        }
        return '\u0000';
    }
    
    public void piglatin()
    {
        KeyInput.printPrompt('\u000C');
        //create ScannerObj
        Scanner scannerObj = new Scanner(System.in);
        KeyInput.printPrompt("Press 0 to exit PigLatinator");
        KeyInput.printPrompt("Press any key to PigLatinate");
        String exit = KeyInput.inString();
        
        while (!exit.equals("0"))
        {
            KeyInput.printPrompt('\u000C');
            KeyInput.printPrompt("Enter your string to be pigLatinated:");
            //receive sentence to be pigLatinated
            String englishSentence = KeyInput.inString();
            //split sentence into words
            String[] englishWord = englishSentence.split("\\s+");
        
            int i;
            String space = " ";
            for (i = 0; i < englishWord.length; i++)
            {
                if (noVowelCheck(englishWord[i]))
                {
                    String[] noPunct = englishWord[i].split("[\\p{Punct}\\s]+", 2);
                    char Punct = punctIndex(englishWord[i]);
                    String punct = Character.toString(Punct);
                    String pigLatinWord = noPunct[0] + "ay" + punct;
                    System.out.print(pigLatinWord + space);
                    
                } else if (startVowelCheck(englishWord[i])) {
                    String[] noPunct = englishWord[i].split("[\\p{Punct}\\s]+", 2);
                    char Punct = punctIndex(englishWord[i]);
                    String punct = Character.toString(Punct);
                    String pigLatinWord = noPunct[0] + "yay" + punct;
                    System.out.print(pigLatinWord + space);
                } else {
                    String[] noPunct = englishWord[i].split("[\\p{Punct}\\s]+", 2);
                    char Punct = punctIndex(englishWord[i]);
                    String punct = Character.toString(Punct);
                    char lowerFirstLetter = Character.toLowerCase(noPunct[0].charAt(0));
                    String lowerCaseWord = Character.toString(lowerFirstLetter) + noPunct[0].substring(1);
                    
                    String start = lowerCaseWord.split("a|e|i|o|u", 2)[0];
                    
                    String noVowEnd = lowerCaseWord.split("a|e|i|o|u", 2)[1];
                    int vowelIndex = firstVowelIndex(englishWord[i]);
                    char firstVowel = noPunct[0].charAt(vowelIndex);
                    String strVowel = Character.toString(firstVowel);
                    
                    String end = strVowel + noVowEnd;
                        
                        if (Character.isUpperCase(noPunct[0].charAt(0)))
                        {
                            char capital = Character.toUpperCase(end.charAt(0));
                            String capitalEnd = Character.toString(capital) + end.substring(1);
                            System.out.print(capitalEnd);
                        } else {
                            System.out.print(end);
                        }
                    System.out.print(start + "ay" + punct + space);
                }
            }
            System.out.print('\n');
            KeyInput.printPrompt("Press 0 to exit PigLatinator");
            KeyInput.printPrompt("Press any key to PigLatinate");
            exit = KeyInput.inString();
        }
    }
}