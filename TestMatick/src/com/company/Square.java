/*
 * Copyright (c) 2021. Created by Ihor Hudyma
 */

package com.company;

import static java.lang.Math.pow;

public class Square extends Figure {

    private int side;

    public Square (String color, String type, int side)
    {
        super(color, type);
        this.side = side;
        area();
    }

    @Override
    public void area() {area = pow(side, 2); }

    public int getSide ()
    {
        return side;
    }
}
