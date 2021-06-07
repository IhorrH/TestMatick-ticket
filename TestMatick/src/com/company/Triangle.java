/*
 * Copyright (c) 2021. Created by Ihor Hudyma
 */

package com.company;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle extends Figure {

    private int leg1;
    private int leg2;
    private double hypotenuse;

    public Triangle (String color, String type, int leg1, int leg2)
    {
        super(color, type);
        this.leg1 = leg1;
        this.leg2 = leg2;
        area();
        hypotenuse();
    }

    @Override
    public void area() {area = (double) leg1 * leg2 / 2; }

    public void hypotenuse()
    {
        hypotenuse = sqrt(pow(leg1, 2) + pow(leg2, 2));
    }

    public int getLeg1 ()
    {
        return leg1;
    }

    public int getLeg2 ()
    {
        return leg2;
    }

    public double getHypotenuse ()
    {
        return hypotenuse;
    }
}
