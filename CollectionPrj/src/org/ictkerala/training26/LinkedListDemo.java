/**
 * 
 */
package org.ictkerala.training26;
import java.util.LinkedList;
/**
 * @author 91944
 *
 */
public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> lst=new LinkedList<Integer>();
			for(int i=1;i<=4;i++)
				{
					lst.add(i);
				}
				
			System.out.println(lst);
			
			for(int j=0;j<lst.size();j++) 
				{
					System.out.println(lst.get(j));
				}
		
		
	}
	}


