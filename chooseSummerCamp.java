/*
Connor Sprouse & Dylan Ward
10 October 2022
APCSA Period 4

Description:
This program takes user input to navigate through a story based on the user's decisions.
*/
import java.util.Scanner;
public class chooseSummerCamp {
//create scanner object for user input
static Scanner choice = new Scanner(System.in);
    public static void main (String[] args)
    {
        //sets the scene + the start of the giant if/else statement that leads the story
        System.out.println("Choose Your Own Adventure: Summer Camp! \nType \"a\", \"b\" or \"c\" to choose an action and progress the story.");

        //items that can be used if the user makes a specific choice
        boolean walkingStick = false;
        boolean oar = false;

        //the lighter and pet rock are useless items that don't affect the story
        System.out.println("You have 4 items to choose from to have with you at the start of your activity. You can choose 2 of the following:");
        System.out.println("a. Walking Stick \nb. Oar \nc. Lighter\nd. Pet Rock");
        String itemChoice1 = choice.nextLine();
        String itemChoice2 = choice.nextLine();
        if (itemChoice1.equals("a") || itemChoice2.equals("a"))
        {
            walkingStick = true;
        }
        else if (itemChoice1.equals("b") || itemChoice2.equals("b"))
        {
            oar = true;
        }

        System.out.println("\nWelcome to Camp Crystal Lake! Here, we have a large variety of activities to choose from. What would you like to start off with?\na. Go for a swim.\nb. Go hiking \nc. Head to the mess hall.");
        String answer1 = choice.nextLine();

        //Swimming Pathway
        if (answer1.equals("a"))
        {
            System.out.println("\nYou are barely in the water for 10 minutes before you hear a piercing scream from somewhere else in the camp. What should you do?");
            System.out.println("a. Get in a boat.\nb. Hide in the lakeside storage shed.");
            String answer2 = choice.nextLine();
            if (answer2.equals("a"))
            {
                System.out.println("\nYou run back to the water and row a canoe out into the middle of the lake and float there for 2 hours. Finally, the police show up and you row back to shore. The police inform you that a man in a hockey mask came to the camp and killed a dozen campers. You are lucky to be alive.");
            }
            else if (answer2.equals("b"))
            {
                if (oar || walkingStick)
                {
                System.out.println("\n You bar the door with your item and the killer get in. He shakes the door, can't get in and leaves. \nYou survived");
                }
                else
                {
                System.out.println("\nYou think that you will be safe if you hide inside the storage shed until the whole situation is over. You sit in complete silence until there is a knocking on the door. After a second of silence, the door is thrown off its hinges, leaving with a hockey mask and machete standing in the frame... \nYou met an unfortunate end.");
                }
            }
        }
     
        //Hiking Pathway
        else if (answer1.equals("b"))
        {
            System.out.println("\nYou spend the entire day exploring the various trails around the campsite. You reach the crest of a nearby hill and watch the sun dip beneath the horizon. The whole experience is rather tranquil, so much so that you don't notice the giant of a man with a hockey mask looming right behind you... \nYou met an unfortunate end.");
        }
        
        //Mess Hall Pathway
        else if (answer1.equals("c"))
        {
            System.out.println("\nYou are chatting with some fellow campers when the normal bubble of activity in the Mess Hall is shattered by a piercing scream. The Mess Hall is the most public place in the camp, making it unsuafe. Where should you go?");
            System.out.println("a. Run to the Counselor's office. \nb. Run to your cabin.");
            String answer2 = choice.nextLine();
            if (answer2.equals("a"))
            {
                System.out.println("\nYou run to the Counselor's office only to find your least favorite Counselor, Ted. He suggests that you and him stay inside until the police can come. What do you do?");
                System.out.println("a. Leave Ted because he's annoying.\nb. Stay with Ted.");
                String answer3 = choice.nextLine();
                if (answer3.equals("a"))
                {
                    System.out.println("\nYou know you can't put up with Ted, so you leave towards the front entrance on your own. Unfortunately for you, Jason soon finds and ambushes you. \nYou met an unfortunate end.");
                }
                else if (answer3.equals("b"))
                {
                    System.out.println("\nJason soon appears in front of the Counselor's Office. Ted says he'll try to buy you time to escape. You run out the backdoor and don't look back until you reach the front entrance as police arrive. \nYou escaped!");
                }
            }
            else if (answer2.equals("b"))
            {
                System.out.println("\nSoon after arriving to your cabin, you hear heavy footsteps on the front porch, followed by a loud banging on the front door. What do you do?");
                System.out.println("a. Hide under your bed.\nb. Climb out the back window.");
                String answer3 = choice.nextLine();
                if (answer3.equals("a"))
                {
                    System.out.println("\nYour panic makes you believe you wont be found under the bed, despite Jason already knowing you are inside. He soon finds you cowering in fear. \nYou met an unfortunate end.");
                }
                else if (answer3.equals("b"))
                {
                    System.out.println("\nYou now realize that the camp is no longer safe, and that you should reach the front entrance to leave. Which route do you take?");
                    System.out.println("a. Detour through the forest to the front gate.\nb. Take the fastest route to the front entrance.");
                    String answer4 = choice.nextLine();
                    if (answer4.equals("a"))
                    {
                        System.out.println("\nYou decide to take the forest route to diminish any chances of running into Jason again. This wise decision resulted in you safely reaching the front entrance. \nYou escaped!");
                    }
                    else if (answer4.equals("b"))
                    {
                        System.out.println("\nYour rushed decision resulted in you running into Jason again.\nYou met an Unfortunate end.");
                    }
                }
            }
        }
    }
}