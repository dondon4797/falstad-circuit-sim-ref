package com.falstad.jcircsim.element;

public class ClockElm extends RailElm
{
    public static final String NAME = "Clock";

    public ClockElm(int xx, int yy)
    {
        super(xx, yy, WF_SQUARE);
        maxVoltage = 2.5;
        bias = 2.5;
        frequency = 100;
        flags |= FLAG_CLOCK;
    }

    public Class getDumpClass()
    {
        return RailElm.class;
    }
}
