import java.util.Scanner;
public class chooseSummerCamp {
//create scanner object for user input
static Scanner choice = new Scanner(System.in);
    public static void main (String[] args)
    {
        //sets the scene for the story
        System.out.println("Choose Your Own Adventure: Summer Camp! \nType \"a\", \"b\" or \"c\" to choose an action and progress the story.");
        System.out.println("\nWelcome to Camp Crystal Lake! Here, we have a large variety of activities to choose from. What would you like to start off with?\na. Go for a swim.\nb. Go hiking \nc. Head to the mess hall.");
        String answer1 = choice.nextLine();

        if (answer1.equals("a"))
        {
            System.out.println("swim + hear scream");
            String answer2 = getInput("a. Grab an oar and get in a boat.\nb. Hide in the lakeside storage shed.");
            System.out.println("verified " + answer2);
            if (answer2.equals("a"))
            {
                System.out.println("You run back to the water and row a canoe out into the middle of the lake and float there for 2 hours. Finally, the police show up and you row back to shore. The police inform you that murderer came to the camp and killed a dozen campers. You are lucky to be alive.");
            }
            else if (answer2.equals("b"))
            {
                System.out.println("You think that you will be safe if you hide inside the storage shed until the whole situation is over. You sit in complete silence until there is a knocking on the door. After a second of silence, the door is thrown off its hinges, leaving with a hockey mask and machete standing in the frame... \nYou met an unfortunate end.");

            }
        }
        else if (answer1.equals("b"))
        {
            System.out.println("You spend the entire day exploring the various trails around the campsite. You reach the crest of a nearby hill and watch the sun dip beneath the horizon. The whole experience is rather tranquil, so much so that you don't notice the giant of a man with a hockey mask looming right behind you... \nYou met an unfortunate end.");
        }
        else if (answer1.equals("c"))
        {
            System.out.println("eat");
            
        }
    }




    //this is a function for taking user input and checking to see if it is valid.
    public static String getInput(String question)
    {   
        System.out.println(question);
        String answer = choice.nextLine();

        while (answer.equals("a") && (answer.equals("b")));
        {
            choice = new Scanner(System.in);
            System.out.println("\nType \"a\" or \"b\".");
            System.out.println(question);
            answer = choice.nextLine();
        }
        return answer;
    }
}