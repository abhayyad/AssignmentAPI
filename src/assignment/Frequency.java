package assignment;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Frequency {

	public static void main(String[] args) {

		List<Integer> numlist = new LinkedList<Integer>();
		numlist.add(10);
		numlist.add(20);
		numlist.add(30);
		numlist.add(40);
		numlist.add(40);
		numlist.add(10);
		numlist.add(10);
		numlist.add(10);
		numlist.add(20);
		numlist.add(30);
		numlist.add(30);
		numlist.add(30);
		numlist.add(30);
		numlist.add(30);
		numlist.add(30);

		System.out.println(numlist);

		Set<Integer> myset = new LinkedHashSet<Integer>();

		for (int i = 0; i < numlist.size(); i++) {

			myset.add(numlist.get(i));
		}

		// System.out.println(myset);

		Integer numarray[] = myset.toArray(new Integer[myset.size()]);

		for (int i = 0; i < numarray.length; i++) {

			int counter = 0;

			for (int j = 0; j < numlist.size(); j++) {

				if (numlist.get(j) == numarray[i]) {
					counter++;
				}
			}

			System.out.println("Frequency of " + numarray[i] + " is :" + counter);

		}

	}

}
