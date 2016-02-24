package cs2114.frogger;

import sofia.graphics.RectangleShape;

/**
 * // -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Alan Kai (yogijogi)
 *  @version Apr 21, 2015
 */
public class Goal extends RectangleShape
{
    private boolean gameIsWon;
    // ----------------------------------------------------------
    /**
     * Create a new Goal object.
     * @param left  left bound
     * @param top   top bound
     * @param right right bound
     * @param bottom    bottom bound
     * @param screen    Screen
     */
    public Goal(float left, float top, float right, float bottom,
        MainScreen screen)
    {
        super(left, top, right, bottom);
        setImage("ic_launcher");
        gameIsWon = false;
    }
    // ----------------------------------------------------------
    /**
     * Collision with player resets the game
     * @param frodo
     */
    public void onCollisionWith(Player frodo)
    {
        //animate(100).alpha(0).rotation(360).removeWhenComplete().play();
        gameIsWon = true;


    }
    // ----------------------------------------------------------
    /**
     * Game is won
     * @return true if goal is reached by player
     */
    public boolean gameIsWon()
    {
        return gameIsWon;
    }
}
