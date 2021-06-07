/*
 * Copyright (c) 2021. Created by Ihor Hudyma
 */

package com.company;

public class Trapezoid extends Figure {

    private int baseB;
    private int baseA;
    private int height;

    public Trapezoid (String color, String type, int baseA, int baseB, int height)
    {
        super(color, type);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
        area();
    }

    @Override
    public void area() {area = (double) (baseA + baseB) / 2 * height; }

    public int getBaseA()
    {
        return baseA;
    }

    public int getBaseB()
    {
        return baseB;
    }

    public int getHeight ()
    {
        return height;
    }
}
