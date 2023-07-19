package day07.solved;

//Set Bulk operations

/**
 * Bulk operations are particularly well suited to Sets; when applied, they perform standard set-algebraic operations. Suppose s1 and s2 are sets.
 * s1.containsAll(s2) — returns true if s2 is a subset of s1. (s2 is a subset of s1 if set s1 contains all of the elements in s2.)
 * s1.addAll(s2) — transforms s1 into the union of s1 and s2. (The union of two sets is the set containing all of the elements contained in either set.)
 * s1.retainAll(s2) — transforms s1 into the intersection of s1 and s2. (The intersection of two sets is the set containing only the elements common to both sets.)
 * s1.removeAll(s2) — transforms s1 into the (asymmetric) set difference of s1 and s2. (For example, the set difference of s1 minus s2 is the set containing all of the elements found in s1 but not in s2.)
 */

import java.util.HashSet;
import java.util.Set;

public class SetBulkOperationsDemo {
	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<Integer> ();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		
		Set<Integer> s2 = new HashSet<Integer> ();
		s2.add(1);
		s2.add(2);
		s2.add(3);
		
		
		Set<Integer> union = new HashSet<Integer>(s1);
		union.addAll(s2);
		System.out.println(union);
		 
		Set<Integer> intersection = new HashSet<Integer>(s1);
		intersection.retainAll(s2);
		System.out.println(intersection);
		 
		Set<Integer> difference = new HashSet<Integer>(s1);
		difference.removeAll(s2);
		System.out.println(difference);
		
	}
}
