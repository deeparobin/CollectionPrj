/**
 * 
 */
package org.ictkerala.training26;
import java.util.Iterator;
import java.util.Stack;
/**
 * @author 91944
 *
 */
public class CollectionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> name = new Stack<String>();
		name.push("Milan");
		name.push("Meera");
		name.push("Varun");
		name.push("Sreya");
		
		Iterator<String> itr=name.iterator();
		while (itr.hasNext())
		{
			System.out.print(itr.next()+"   ");
		
		}
				System.out.println();
				System.out.println(name.pop());  //Prints the last inserted item
	}

}
