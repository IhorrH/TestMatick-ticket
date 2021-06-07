/*
 * Copyright (c) 2021. Created by Ihor Hudyma
 */

package com.company;

import static java.lang.Math.pow;
import static java.lang.Math.PI;

public class Circle extends Figure {

    private int radius;

    public Circle (String color, String type, int radius)
    {
        super(color, type);
        this.radius = radius;
        area();
    }

    @Override
    public void area()
    {
        area = PI * pow(radius, 2);
    }

    public int getRadius ()
    {
        return radius;
    }
}
