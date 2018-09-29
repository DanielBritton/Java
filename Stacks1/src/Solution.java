public static class Stack {
	(
	/* size of stack array */

	private int maxSize;

	private Object[] stackArray;

	/* top of stack */

	private int top;

	/* constructor */

	public Stack(int s) {

		maxSize = s; // set array size

		stackArray = new Object[maxSize]; // create array

		top = -1; // no items yet }

	}

	/* put item on top of stack */

	public void push(Object j) {

		top++;

		stackArray[top] = j; // increment top, insert item

	}

	/* take item from top of stack */

	public Object pop() {

		return stackArray[top--]; // access item, decrement top

	}

	/* peek at top of stack */

	public Object peek() {

		return stackArray[top];

	}

	/* true if stack is empty */

	public boolean isEmpty() {

		return (top == -1);

	}

	/* true if stack is full */

	public boolean isFull() {

		return (top == maxSize - 1);

	}

	/* empty stack */

	public void makeEmpty() {

		top = -1;

	}

}

	public static boolean parenthesesMatching(String string) {

		byte[][] braces = { { '{', '}' }, { '[', ']' }, { '(', ')' } };

		char b1;

		char b2;

		Stack theStack = new Stack(20);

		for (int i = 0; i < string.length(); i++) {

			b1 = string.charAt(i);

			// Opening brackets are placed on a stack

			if (b1 == '{' || b1 == '(' || b1 == '[' || b1 == '<') {

				theStack.push(b1);

			}

			// When the program comes across a closing bracket it pops from

			// the ‘opening bracket stack’ and this should match

			if (b1 == '}' || b1 == ')' || b1 == ']' || b1 == '>') {

				if (theStack.isEmpty())

					return false;

				b2 = (char) theStack.pop();

				switch (b2) {

				case '{':

					if (b1 != '}')

						return false;

					break;

				case '(':

					if (b1 != ')')

						return false;

					break;

				case '[':

					if (b1 != ']')

						return false;

					break;

				case '<':

					if (b1 != '>')

						return false;

				}

			}

		}

		return (theStack.isEmpty());

	}

	/*
	 * 
	 * Complete the function below.
	 * 
	 */

	static String[] braces(String[] values) {

        String[] res = new String[values.length];

       for (int i = 0; i < values.length; i++) {

           res[i] =  parenthesesMatching(values[i]) ? "YES": "NO";

       }

       

        return res;

    }