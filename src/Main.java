import java.util.Scanner;

public class Main
{

    static Scanner scan = new Scanner(System.in);
    static String answer;
    static int i;

    public static void main(String[] args)
    {
        do
        {
        System.out.println(
                "Welcome to the AREA calculator." +
                        "\nWith this calculator you will be able to calculate the areas of geometric objects.");

        System.out.println("Choose the type of object you want to calculate the area of: " +
                "\npress 1 for Circle \n" +
                "press 2 for Rectangle\n" +
                "press 3 for Triangle");


        try
        {
            i = scan.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Lol.. you did bad mate...");
            System.out.println(e);
        }


            try
            {
                switch (i)
                {
                    case 1:
                        areaCircle();
                        break;
                    case 2:
                        areaRectangle();
                        break;
                    case 3:
                        areaRightTriangle();
                        break;
                    default:
                        System.out.println("No no no..");
                        break;
                }

                System.out.println("Do you want to find the area of another object. Press Y for yes. Press N for no.");

            }
            catch(Exception e)
            {
                System.out.println("Nope. you're in for a shitty night..");
                System.out.println(e);
            }

        }
        while(scan.next().equalsIgnoreCase("Y"));


        scan.close();

    }

    static void areaRectangle()
    {
        do
        {

            try
            {
                double a,  b;
                System.out.println("Please enter the length of the rectangle: ");
                a = scan.nextDouble();
                System.out.println("Please enter the width of the rectangle: ");
                b = scan.nextDouble();

                System.out.println("Area of the rectangle is: ");
                System.out.println(a * b );

                System.out.println("Do you want to find the area of another rectangle. Press Y for yes. Press N for no.");
                answer = scan.next();
            }
            catch (Exception e)
            {
                System.out.println("You fucked up my man!");
                System.out.println(e);
            }


        }
        while(answer.equalsIgnoreCase("Y"));
    }

    static void areaCircle()
    {
        do
        {

            try
            {
                System.out.println("Please enter the radius: ");
                double radius = scan.nextDouble();

                System.out.println("Area of the circle is: ");
                System.out.println(Math.PI * Math.pow(radius, 2));

                System.out.println("Do you want to find the area of another circle. Press Y for yes. Press N for no.");
                answer = scan.next();
            }
            catch (Exception e)
            {
                System.out.println("You fucked up my man!");
                System.out.println(e);
            }


        }
        while(answer.equalsIgnoreCase("Y"));
    }

    static void areaRightTriangle()
    {
        do
        {

            try
            {
                double a,  b, x;
                System.out.println("Please enter the length of the base: ");
                a = scan.nextDouble();
                System.out.println("Please enter the length of the height: ");
                b = scan.nextDouble();

                System.out.println("Area of the triangle is: ");
                x = 0.5;
                System.out.println(a * b * x);

                System.out.println("Do you want to find the area of another triangle. Press Y for yes. Press N for no.");
                answer = scan.next();
            }
            catch (Exception e)
            {
                System.out.println("You fucked up my man!");
                System.out.println(e);
            }


        }
        while(answer.equalsIgnoreCase("Y"));
    }

}