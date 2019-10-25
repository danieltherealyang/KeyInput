import java.util.*;
public class Calculator
{
    public void runCalculator()
    {
        Scanner scannerObj = new Scanner(System.in);
        KeyInput.printPrompt('\u000C'); //clear terminal
        KeyInput.printPrompt("Press 1 to add"); //display menu
        KeyInput.printPrompt("Press 2 to subtract");
        KeyInput.printPrompt("Press 3 to multiply");
        KeyInput.printPrompt("Press 0 to exit Calculator");
        String calcMenu = KeyInput.inString(); //take user input as calculator menu var
        while (!calcMenu.equals("0")) //while loop to make 0 the escape
        {
            if (calcMenu.equals("1")) //add option
            {
                KeyInput.printPrompt('\u000C');
                KeyInput.printPrompt("Which numbers do you want to add?");
                String sumNum = KeyInput.inString();
                ArrayList<Integer> numList = new ArrayList<>(); //add user input to Arraylist
                while (!sumNum.equals("=")) //make the = sign the escape to terminate
                {             
                    int intSumNum = Integer.parseInt(sumNum); // convert sumNum to int
                    numList.add(intSumNum); //add the user input to array numList
                    sumNum = KeyInput.inString(); // ask for user input again
                    if (sumNum.equals("=")) //if user enters = then while loop will terminate
                    {
                        break;
                    }
                }
                                             
                int sum = 0; //define sum as 0
                for (int i : numList) //loop through aray numList
                {
                    sum = sum + i; //add each element of numList together
                }
                       
                KeyInput.printPrompt("Your answer is: " + sum); //display answer
                KeyInput.printPrompt("Press 0 to exit Calculator"); //exit prompt
                calcMenu = KeyInput.inString();
                KeyInput.printPrompt('\u000C');
            }
                    
            if (calcMenu.equals("2")) //subtract option
            {
                KeyInput.printPrompt('\u000C');
                KeyInput.printPrompt("Which numbers do you want to subtract?"); //prompt
                String sumNum = KeyInput.inString(); //take user input
                ArrayList<Integer> numList = new ArrayList<>(); //user input to array
                while (!sumNum.equals("="))
                {   
                    int intSumNum = Integer.parseInt(sumNum); //user input to integer
                    numList.add(intSumNum); //add user input to arraylist
                    sumNum = KeyInput.inString(); 
                    if (sumNum.equals("=")) //break code
                    {
                        break;
                    }
                }
                                             
                int sum = numList.get(0) + 1; //first element of numList and add 1, idk why but it works
                for (int i : numList) //loop through and subtract
                {
                    sum = sum - i;
                }
                       
                KeyInput.printPrompt("Your answer is: " + sum);
                KeyInput.printPrompt("Press 0 to exit Calculator");
                calcMenu = KeyInput.inString();
                KeyInput.printPrompt('\u000C');
            }
                    
            if (calcMenu.equals("3"))
            {
                KeyInput.printPrompt('\u000C');
                KeyInput.printPrompt("Which numbers do you want to multiply?");
                String productList = KeyInput.inString();
                ArrayList<Integer> numList = new ArrayList<>();
                while (!productList.equals("="))
                {   
                    int intProduct = Integer.parseInt(productList);
                    numList.add(intProduct);
                    productList = KeyInput.inString();
                    if (productList.equals("="))
                    {
                        break;
                    }
                }
                                             
                int Product = 1;
                for (int i : numList)
                {
                    Product = Product * i;
                }
                       
                KeyInput.printPrompt("Your answer is: " + Product);
                KeyInput.printPrompt("Press 0 to exit Calculator");
                calcMenu = KeyInput.inString();
                KeyInput.printPrompt('\u000C');
            }
                
        }
    }
}