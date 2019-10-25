public class MonkeyJumpers
{
    public void runJumpers(int number, String jumpers)
    {
        while (number > -1)
            {
                String space = " ";
                if (number == 0)
                {
                    KeyInput.printPrompt("Zero little" + space + jumpers + space + "jumping on the bed");
                }
                else
                {
                    KeyInput.printPrompt(number + space + "little" + space + jumpers + space + "jumping on the bed");
                    KeyInput.printPrompt("One fell off and broke his head");
                    KeyInput.printPrompt("Mama called the doctor and the doctor said");
                    KeyInput.printPrompt("no more"+ space + jumpers + space + "jumping on the bed.");
                }
                number--;
            }
    }
}