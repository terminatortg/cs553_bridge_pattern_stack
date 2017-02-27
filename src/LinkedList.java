import java.util.Enumeration;

/**
 * Created by thomasgross on 2/22/17.
 */
public class LinkedList<E>
{
    private int m_size;

    private class Node<E> {
        private E data;

        private Node<E> next;

        public Node()
        {

        }

        public Node(E value)
        {
            this.data = value;
        }

        public void setData(E data)
        {
            this.data = data;
        }

        public void setNext(Node<E> next)
        {
            this.next = next;
        }

        public E getData()
        {
            return (E) this.data;
        }

        public Node<E> getNext()
        {
            return this.next;
        }
    }


    private Node<E> m_first;

    private class Iter<E> implements Enumeration<E>
    {
        private LinkedList.Node current = LinkedList.this.m_first;

        public boolean hasMoreElements()
        {
            return current != null;
        }

        public E nextElement()
        {
            E result = (E) current.getData();
            current = current.getNext();
            return result;
        }
    }

    public LinkedList()
    {
        this.m_first = null;
        this.m_size = 0;
    }

    public LinkedList(LinkedList<E> aLinkedList)
    {
        Node<E> pt = aLinkedList.head();

        Node<E> newNode = new Node<E>();
        this.m_first = newNode;

        while (pt != null)
        {
            newNode.setData(pt.getData());
            pt = pt.getNext();
            if (pt != null)
            {
                newNode.setNext(new Node<E>());
                newNode = newNode.getNext();
            }
        }
    }

    public Node<E> head()
    {
        return this.m_first;
    }

    public void insertFirst(E data)
    {
        Node<E> n = new Node(data);
        n.setNext(this.m_first);
        this.m_first = n;
        this.m_size++;
    }

    public E deleteFirst()
    {
        Node<E> temp = this.m_first;
        this.m_first = this.m_first.getNext();
        this.m_size--;
        return temp.data;
    }

    public boolean isEmpty()
    {
        return (this.m_first == null);
    }

    public int size()
    {
        return this.m_size;
    }

    public Enumeration<E> elements()
    {
        return new Iter<E>();
    }
}
