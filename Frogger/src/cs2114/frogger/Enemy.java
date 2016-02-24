package cs2114.frogger;

import sofia.graphics.RectangleShape;
import sofia.app.ShapeScreen;


/**
 * // -------------------------------------------------------------------------
/**
 *  Enemy class. Orcs from Mordor
 *
 *  @author Alan Kai (yogijogi)
 *  @version Apr 6, 2015
 */
public class Enemy extends RectangleShape
{

    // ----------------------------------------------------------
    /**
     * Create a new Enemy object.
     * @param left Left bounds
     * @param top Top Bounds
     * @param right Right Bounds
     * @param bottom Bottom Bounds
     * @param screen Main Screen
     */
    public Enemy(float left, float top, float right, float bottom,
        ShapeScreen screen)
    {
        super(left, top, right, bottom);
        this.setImage("orc");
    }

}
