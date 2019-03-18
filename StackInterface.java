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
 * This generic interface represents the Stack ADT and all its methods to be
 * implemented.
 * 
 * @author Diana Choi
 *
 */
public interface StackInterface<T> {

	/**
	 * This method adds a new entry to the top of the stack.
	 * 
	 * @param newEntry
	 *            the data of the new entry to be added.
	 */
	public void push(T newEntry);

	/**
	 * This method removes and returns the topmost entry of the stack.
	 * 
	 * @return the topmost entry of the stack if the stack is not empty.
	 */
	public T pop();

	/**
	 * This method returns the topmost entry of the stack but does not modify
	 * the stack.
	 * 
	 * @return the topmost entry of the stack if the stack is not empty; null
	 *         otherwise.
	 */
	public T peek();

	/**
	 * This method returns whether the stack is empty or not.
	 * 
	 * @return true if the stack is empty; false otherwise.
	 */
	public boolean isEmpty();

	/**
	 * This method clears the stack of all entries and makes the stack empty.
	 */
	public void clear();
}
