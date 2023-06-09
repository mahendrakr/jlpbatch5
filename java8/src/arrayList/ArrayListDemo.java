package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> li= new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		//approach 1. using for loop.
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		System.out.println("****************************");
		//approach 2. using while loop.
		int index=0;
		while(index<li.size()) {
			System.out.println(li.get(index));
			index++;
		}
		System.out.println("****************************");
		//approach 3. using iterator.
		Iterator<Integer> it = li.iterator();
		while(it.hasNext()) {
      System.out.println(it.next());
		}
      System.out.println("****************************");
      //approach 4. using enumeration.
      Enumeration<Integer> en = Collections.enumeration(li);
      while(en.hasMoreElements()) {
    	  System.out.println(en.nextElement());
      }
      System.out.println("****************************");
      //approach 5. using lambda expression.
      li.forEach(number->System.out.println(number));
	}
	}


