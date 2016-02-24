package cs2114.frogger;

import sofia.graphics.LineShape;

// -------------------------------------------------------------------------
/**
 *  Boundary of the map. The floor is lava!!
 *
 *  @author Alan Kai (yogijogi)
 *  @version Apr 17, 2015
 */
public class Boundary extends LineShape
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a new boundary segment with the specified coordinates.
     *
     * @param left the x-coordinate of the first point
     * @param top the y-coordinate of the first point
     * @param right the x-coordinate of the second point
     * @param bottom the y-coordinate of the second point
     */
    public Boundary(float left, float top, float right, float bottom)
    {
        super(left, top, right, bottom);
        //setFriction(2.0f);

    }
}
