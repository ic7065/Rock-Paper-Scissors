import java.util.*;
/**
 * Each player or team will create their own Player, this is only an example....
 * 
 * Your code MUST INCLUDE a move method with the following signature. To insure that, you must implement
 * the Player interface
 * 
 * You can create additional methods but must have the move method
 * 
 * common: same, beat enemy last, rand plus same every 3 mvs??
 * Ian C
 * y m
 * r pm
 * s py
 * s rm
 * p ry
 * p ry
 * p p
 * s sy
 * 
 * y m
 * r pm
 * s py
 * s rm
 * p p
 * s p
 */
public class PlayerExample implements Player
{
    private static String name = "Response Counter";
    /**
     * An example of a method - replace this comment with your own
     * You must create some kind of logic of what to play against your opponent...start thinking!
     * 
     * @return      the move you want to play against opponent
     *              "r" - rock
     *              "p" - paper
     *              "s" - scissors
     *              anything else - forfeit the turn
     */
    public String move(String [] myMoves, String [] opponentMoves, int myScore, int opponentScore)
    {
        int len=0;
        for (String s:myMoves) {
            if (s==null) break;
            len++;
        }
        if (len<2) return new String[] {"r","p","s"}[new Random().nextInt(3)];
        String myLastMove=myMoves[len-1];

        for (int i =len-2;i>=0;i--){
            if (myMoves[i]!=myLastMove) continue;
            if (opponentMoves[i + 1].equals("r")) return "p";
            if (opponentMoves[i + 1].equals("p")) return "s";
            if (opponentMoves[i + 1].equals("s")) return "r";            
        }

        return new String[] {"r","p","s"}[new Random().nextInt(3)];
    }
    /**
     * Returns the name of the player
     * 
     * @return      the name of the player              
     */
    public String getName()
    {
        return name;
    }
}

