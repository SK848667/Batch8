package com.syntax.class29;

interface Shape {
        void input();
        void area();
    }
    class Circle implements Shape
    {
        int r = 0;
        double pi = 3.14, ar = 0;
        @Override
        public void input()
        {
            r = 5;
        }
        @Override
        public void area()
        {
            ar = pi * r * r;
            System.out.println("Area of circle:"+ar);
        }
    }
    class Square extends Circle
    {
        int l = 0, b = 0;
        double ar;
        public void input()
        {
            super.input();
            l = 6;
            b = 4;
        }
        public void area()
        {
            super.area();
            ar = l * b;
            System.out.println("Area of square:"+ar);
        }
    }
    public class Demo
    {
        public static void main(String[] args)
        {
            Square obj = new Square();
            obj.input();
            obj.area();
        }
    }
