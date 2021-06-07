/*
 * Copyright (c) 2021. Created by Ihor Hudyma
 */

package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        Random random = new Random();
        String[] colors = new String[] {"червоний", "помаранчевий", "жовтий", "зелений", "голубий", "синій", "фіолетовий"};
        String[] types = new String[] {"коло", "квадрат", "трапеція", "трикутник"};
        List<Circle> circles = new ArrayList<>();
        List<Square> squares = new ArrayList<>();
        List<Trapezoid> trapezoids = new ArrayList<>();
        List<Triangle> triangles = new ArrayList<>();
        for (int i = 0; i<random.nextInt(100) + 1; i++)
        {
            switch (random.nextInt(4) + 1)
            {
                case 1:
                    int radius = random.nextInt(10) + 1;
                    circles.add(new Circle(colors[random.nextInt(colors.length)], types[0], radius));
                    break;
                case 2:
                    int side = random.nextInt(10) + 1;
                    squares.add(new Square(colors[random.nextInt(colors.length)], types[1], side));
                    break;
                case 3:
                    int baseA = random.nextInt(10) + 1;
                    int baseB = random.nextInt(10) + 1;
                    int height = random.nextInt(10) + 1;
                    trapezoids.add(new Trapezoid(colors[random.nextInt(colors.length)], types[2], baseA, baseB, height));
                    break;
                case 4:
                    int leg1 = random.nextInt(10) + 1;
                    int leg2 = random.nextInt(10) + 1;
                    triangles.add(new Triangle(colors[random.nextInt(colors.length)], types[3], leg1, leg2));
                    break;
            }
        }
        for (Circle circle : circles)
        {
            System.out.println("Тип: " + circle.type + ", колір: " + circle.color + ", радіус: " + circle.getRadius() + ", площа: " + circle.area);
        }
        for (Square square : squares)
        {
            System.out.println("Тип: " + square.type + ", колір: " + square.color + ", сторона: " + square.getSide() + ", площа: " + square.area);
        }
        for (Trapezoid trapezoid : trapezoids)
        {
            System.out.println("Тип: " + trapezoid.type + ", колір: " + trapezoid.color + ", основа a: " + trapezoid.getBaseA() + ", основа b: " + trapezoid.getBaseB() + ", висота: " + trapezoid.getHeight() + ", Площа: " + trapezoid.area);
        }
        for (Triangle triangle : triangles)
        {
            System.out.println("Тип: " + triangle.type + ", колір: " + triangle.color + ", катет a: " + triangle.getLeg1() + ", катет b: " + triangle.getLeg2() + ", гіпотенуза: " + triangle.getHypotenuse() +  ", площа: " + triangle.area);
        }
    }
}
