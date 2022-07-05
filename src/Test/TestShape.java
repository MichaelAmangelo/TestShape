package Test;

public class TestShape
{
    public static void main(String[] args)
    {

      Circle c1 = new Circle(2.67);
      System.out.println("c1: ");
      System.out.println(c1.toString());
      System.out.println();

      Circle c2 = new Circle( false, "Red",3 );
      System.out.println("c2: ");
      System.out.println(c2.toString());
      System.out.println();

      Rectangle r1 = new Rectangle(true, "Blue", 2, 3);
      System.out.println("r1: ");
      System.out.println(r1.toString());
      System.out.println();

      Rectangle r2 = new Rectangle(false, "Red", 3.2, 4);
      System.out.println("r2: ");
      System.out.println(r2.toString());

    }
}