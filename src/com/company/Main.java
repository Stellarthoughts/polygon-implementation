package com.company;

public class Main {

    public static void main(String[] args) {
        Vector2d p1 = new Vector2d(3,0);
        Vector2d p2 = new Vector2d(0,4);
        Vector2d p3 = new Vector2d(0,0);

        System.out.println("Triangle:\n");

        Triangle tri = new Triangle();
        try {
            tri.Construct(p1, p2, p3);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            return;
        }

        System.out.println(tri + "\n");
        tri.Rotate(new Vector2d(0,0), Math.PI /2);
        System.out.println(tri + "\n");
        tri.Resize(new Vector2d(0,0), 0.5);
        System.out.println(tri + "\n");
        tri.Move(new Vector2d(1,1));
        System.out.println(tri + "\n");
        tri.Rotate(new Vector2d(0,0), -Math.PI /2);
        System.out.println(tri + "\n");

        Vector2d p4 = new Vector2d(3,4);
        System.out.println("Rectangle:\n");

        Rectangle rect = new Rectangle();
        try {
            rect.Construct(p1, p2, p3, p4);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            return;
        }

        System.out.println(rect + "\n");
        rect.Rotate(new Vector2d(0,0), Math.PI /2);
        System.out.println(rect + "\n");
    }
}
