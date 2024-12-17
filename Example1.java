import java.util.*;
/**
 * Example1 Player will first play rock, then all scissors
 */
public class Example1 implements Player

{
    private static String name = "Example";
    private static String strategy = "Rock then all scissors";

    public String move(String [] myMoves, String [] opponentMoves, int myScore, int opponentScore)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter move (r/p/s): ");
        String userInput = scanner.nextLine().trim().toLowerCase();
        return userInput;
        // if(myMoves.length == 0)
        //     return "r";
        // else
        //     return "s";
    }

    public String getName()
    {
        return name;
    }
}
