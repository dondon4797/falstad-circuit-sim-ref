package com.falstad.jcircsim;

public class SquareRailElm extends RailElm
{
    public SquareRailElm(int xx, int yy)
    {
        super(xx, yy, WF_SQUARE);
    }

    Class getDumpClass()
    {
        return RailElm.class;
    }
}
