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
    private static String name = "Probability";
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
        int r,p,s;
        r=p=s=0;
        for (String mv :opponentMoves){
            if (mv=="r"){
                r++;
            }
            if (mv=="p"){
                p++;
            }
            if (mv=="s"){
                s++;
            }
        }
        if (r>p&&r>s){
            return "p";
        }
        else if (p>r&&p>s){
            return "s";
        }
        else if (s>r&&s>p){
            return "r";
        }
        else{
            return new String[] {"r","p","s"}[new Random().nextInt(3)];
        }
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

