package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  // If there's nothing to rearrange, avoid unnecessary allocations
	  // (new char[] and new String) by returning the input String
	  if (input == null || input.length() < 2) {
	    return input;
	  }

	  char[] result = input.toCharArray();

	  for (int i = 0; i < result.length; i++) {
	    int swap_with = (int)(Math.random()*result.length);
	    char inter = result[swap_with];
	    result[swap_with] = result[i];
	    result[i] = inter;
	  }

	  return new String(result);
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
