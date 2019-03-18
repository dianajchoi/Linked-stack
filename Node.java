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
 * This generic class represents an entry in a linked list.
 * 
 * @author Diana Choi
 *
 */
public class Node<T> {

	/**
	 * This field represents the data that is stored in this entry.
	 */
	private T data;

	/**
	 * This field represents the next entry in the linked list.
	 */
	private Node<T> next;

	/**
	 * This constructor initializes the data in this entry but does not hold a
	 * next entry.
	 * 
	 * @param data
	 *            The data to be stored in this Node<T>.
	 */
	public Node(T data) {
		this(data, null);
	}

	/**
	 * This constructor initializes the data in this entry and the next Node<T>
	 * in the linked list.
	 * 
	 * @param data
	 *            The data to be stored in this Node<T>.
	 * @param next
	 *            The next Node<T> in the linked list.
	 */
	public Node(T data, Node<T> next) {
		setData(data);
		setNext(next);
	}

	/**
	 * This method accesses the data stored in this Node<T>.
	 * 
	 * @return the data in this Node<T>.
	 */
	public T getData() {
		return data;
	}

	/**
	 * This method accesses the next referenced Node<T> in the linked list.
	 * 
	 * @return the next Node<T> in the linked list.
	 */
	public Node<T> getNext() {
		return next;
	}

	/**
	 * This method sets the data in this Node<T>.
	 * 
	 * @param data
	 *            The new data to be stored in this Node<T>.
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * This method sets the next Node<T> to be referenced in the linked list.
	 * 
	 * @param next
	 *            The new next Node<T> in the linked list.
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}

}
