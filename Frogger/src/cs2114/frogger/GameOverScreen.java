package cs2114.frogger;

import sofia.graphics.RectangleShape;
import sofia.app.ShapeScreen;

/**
 * // -------------------------------------------------------------------------
/**
 *  Gave Over Screen
 *  You lose! Restarts game when touched
 *
 *  @author Alan Kai (yogijogi)
 *  @version Apr 23, 2015
 */
public class GameOverScreen extends ShapeScreen
{
    private boolean isScreen = false;
    /**
     * Initialize
     */
    public void initialize()
    {
        RectangleShape background = new RectangleShape(0, 0, getWidth(), getHeight());
        background.setActive(false);
        background.setImage("defeated");
        add(background);
        isScreen = true;
    }
    // ----------------------------------------------------------
    /**
     * On touch up, change screens
     * @param x X position
     * @param y Y position
     */
    public void onTouchUp(float x, float y)
    {
        presentScreen(MainScreen.class);
        finish();
    }
    // ----------------------------------------------------------
    /**
     * For testing
     * @return true if screen is used
     */
    public boolean isScreen()
    {
        return isScreen;
    }
}
