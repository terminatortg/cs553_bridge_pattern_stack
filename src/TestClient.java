import java.util.Enumeration;

/**
 * Created by thomasgross on 2/26/17.
 */
public class TestClient
{
    public static void main(String[] unused)
    {
        StackA<Integer> stackA = new StackA<Integer>();

        stackA.push(new Integer(100));
        stackA.push(new Integer(200));
        System.out.println("Stack size: " + stackA.size());
        stackA.pop();
        System.out.println("Stack size: " + stackA.size());
        stackA.push(new Integer(101));
        stackA.push(new Integer(102));
        stackA.push(new Integer(103));
        stackA.push(new Integer(104));

        Enumeration<Integer> iter = stackA.elements();
        while (iter.hasMoreElements())
        {
            System.out.println("Stack contains: " + iter.nextElement());
        }

        System.out.println("Stack size: " + stackA.size());

        stackA.push(new Integer(105));
        stackA.push(new Integer(106));
        stackA.push(new Integer(107));
        stackA.push(new Integer(108));
        stackA.push(new Integer(109));
        stackA.push(new Integer(110));

        Enumeration<Integer> iter2 = stackA.elements();
        while (iter2.hasMoreElements())
        {
            System.out.println("Stack contains: " + iter2.nextElement());
        }

        System.out.println("Stack size: " + stackA.size());

    }
}
