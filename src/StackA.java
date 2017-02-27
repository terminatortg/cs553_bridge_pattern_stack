import java.util.Enumeration;

/**
 * Created by thomasgross on 2/23/17.
 */
public class StackA<E>
{
    private IStackImpl<E> m_stackImpl;

    public StackA()
    {
        this.m_stackImpl = new ArrayStack<E>();
    }

    public void push(E val)
    {
        if (this.m_stackImpl.size() == 10)
        {
            System.out.println("Switching to Linked List based stack.");
            LinkedListStack<E> copy = new LinkedListStack<E>();
            Enumeration<E> iter = this.m_stackImpl.elements();

            while (iter.hasMoreElements())
            {
                copy.push(iter.nextElement());
            }

            LinkedListStack<E> lList = new LinkedListStack<E>(copy.elements());
            this.m_stackImpl = lList;
        }

        this.m_stackImpl.push(val);
    }

    public E pop()
    {
        return (E) this.m_stackImpl.pop();
    }

    public boolean isEmpty()
    {
        return this.m_stackImpl.isEmpty();
    }

    public int size()
    {
        return this.m_stackImpl.size();
    }

    public Enumeration<E> elements()
    {
        return this.m_stackImpl.elements();
    }
}
