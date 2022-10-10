import java.util.Scanner;
public class chooseSummerCamp {
    public static void main (String[] args)
    {
        //create scanner object for user input
        Scanner choice = new Scanner(System.in);

        //sets the scene for the story
        System.out.println("Choose Your Own Adventure: Summer Camp! \nType \"a\", \"b\" or \"c\" to choose an action and progress the story.");
        System.out.println("\nWelcome to Camp Crystal Lake! Here, we have a large variety of activities to choose from. What would you like to start off with?\na. Go for a swim.\nb. Go hiking \nc. Head to the mess hall.");
        String answer1 = choice.nextLine();

        if (answer1.equals("a"))
        {
            System.out.println("swim + hear scream");
            String answer2 = getInput("a. Grab an oar and get in a boat.\nb. Run to your cabin.");
            if (answer1.equals("a"))
            {
                System.out.println("You row a canoe out into the middle of the lake and float there for 2 hours. Finally, the police show up and you row back to shore. The police inform you that murderer came to the camp and killed a dozen campers. You are lucky to be alive.");
            }
            else if (answer1.equals("b"))
            {
                System.out.println("you run to cabin");
            }
        }
        else if (answer1.equals("b"))
        {
            System.out.println("hike");
        }
        else if (answer1.equals("c"))
        {
            System.out.println("eat");
        }
    }





    public static String getInput(String question)
    {   
        Scanner choose = new Scanner(System.in);
        System.out.println(question);
        String answer = choose.nextLine();
        while (!(answer.equals("a") || !(answer.equals("b"))));
        {
            System.out.println("Type \"a\" or \"b\".");
            getInput(question);
        }
        return answer;
    }
}