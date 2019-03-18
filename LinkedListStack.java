/**
 * Name: Diana Choi
 * Project: #3
 * Due: May 24, 2017
 * Course: cs-240-01-sp17
 * 
 * Description: You are to implement a class that can convert an infix expression
 * into its postfix form using your own implementation of the Stack ADT.
 */

/**
 * This generic class represents an implementation of the Stack ADT using a
 * Linked List data structure.
 * 
 * @author Diana Choi
 *
 */
public class LinkedListStack<T> implements StackInterface<T> {

	/**
	 * This field represents the topmost entry of the stack.
	 */
	private Node<T> top;

	/**
	 * This default constructor sets the top Node<T> to null to create an empty
	 * stack.
	 */
	public LinkedListStack() {
		top = null;
	}

	/**
	 * This method adds a new entry to the top of the stack.
	 * 
	 * @param newEntry
	 *            the data of the new entry to be added.
	 */
	public void push(T newEntry) {
		top = new Node<>(newEntry, top);
	}

	/**
	 * This method removes and returns the topmost entry of the stack.
	 * 
	 * @return the topmost entry of the stack if the stack is not empty.
	 */
	public T pop() {
		if (top == null) {
			// throw exception
		}
		Node<T> e = top;
		top = top.getNext();
		e.setNext(null);
		return e.getData();
	}

	/**
	 * This method returns the topmost entry of the stack but does not modify
	 * the stack.
	 * 
	 * @return the topmost entry of the stack if the stack is not empty.
	 */
	public T peek() {
		if (top == null) {
			// throw exception
		}
		return top.getData();
	}

	/**
	 * This method returns whether the stack is empty or not.
	 * 
	 * @return true if the stack is empty; false otherwise.
	 */
	public boolean isEmpty() {
		return top == null;
	}

	/**
	 * This method clears the stack of all entries and makes the stack empty.
	 */
	public void clear() {
		Node<T> traverse = top;
		while (traverse != null) {
			Node<T> t = traverse;
			traverse = traverse.getNext();
			t.setData(null);
			t.setNext(null);
		}
		top = null;
	}
}