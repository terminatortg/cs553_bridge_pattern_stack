import java.util.Enumeration;

/**
 * Created by thomasgross on 2/22/17.
 */
public class LinkedListStack<E> implements IStackImpl<E>
{
    private LinkedList<E> m_list;

    public LinkedListStack()
    {
        this.m_list = new LinkedList<E>();
    }

    public LinkedListStack(Enumeration<E> elems)
    {
        this.m_list = new LinkedList<E>();

        while (elems.hasMoreElements())
        {
            this.m_list.insertFirst(elems.nextElement());
        }
    }

    public void push(E x)
    {
        this.m_list.insertFirst(x);
    }

    public E pop()
    {
        if (!this.m_list.isEmpty())
        {
            return (E) this.m_list.deleteFirst();
        }

        return null;
    }

    @Override
    public boolean isEmpty()
    {
        return this.m_list.isEmpty();
    }

    @Override
    public int size()
    {
        return this.m_list.size();
    }

    @Override
    public Enumeration<E> elements()
    {
        return this.m_list.elements();
    }
}
