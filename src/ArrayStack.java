import java.util.Enumeration;

/**
 * Created by thomasgross on 2/22/17.
 */
public class ArrayStack<E> implements IStackImpl<E>
{
    private final static int SIZE = 10;

    private int m_index;

    private E[] m_stack;

    private class Iter<E> implements Enumeration<E>
    {
        private int index = size() - 1;

        public boolean hasMoreElements()
        {
            return index > -1;
        }

        public E nextElement()
        {
            if (this.hasMoreElements())
            {
                return (E) m_stack[index--];
            }
            else
            {
                throw new IllegalStateException();
            }
        }
    }

    public ArrayStack()
    {
        this.m_index = -1;
        this.m_stack = (E[]) new Object[SIZE];
    }

    public void push(E x)
    {
        if (this.size() >= SIZE)
            return;

        this.m_stack[++this.m_index] = x;
    }

    public Enumeration<E> elements()
    {
        return new Iter<E>();
    }

    public E pop()
    {
        if (this.size() == 0)
        {
            return null;
        }
        else
        {
            return (E) this.m_stack[this.m_index--];
        }
    }

    public boolean isEmpty()
    {
        return (this.m_index == -1);
    }

    public int size()
    {
        return (this.m_index + 1);
    }

}
