import java.util.Enumeration;

/**
 * Created by thomasgross on 2/22/17.
 */
public interface IStackImpl <E>
{
    void push(E x);

    E pop();

    boolean isEmpty();

    int size();

    Enumeration<E> elements();
}
