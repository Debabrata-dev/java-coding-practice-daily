package SetCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class MainSet {

	public static void main(String[] args) {
HashSet<Integer> h1=new HashSet<Integer>();
h1.add(21);
h1.add(12);
h1.add(3);
h1.add(90);
h1.add(43);
System.out.println(h1);
LinkedHashSet<Integer> l1=new LinkedHashSet<Integer>();
l1.add(21);
l1.add(12);
l1.add(3);
l1.add(90);
l1.add(43);
System.out.println(l1);
TreeSet<Integer> t1=new TreeSet<Integer>();
t1.add(21);
t1.add(12);
t1.add(3);
t1.add(90);
t1.add(43);
t1.add(34);
System.out.println(t1);
	}

}
//
//Set it is a type of collection it dosnot allow dubllicate element .
//Set is not index .
//Set is un order collection .
//set allow null but not duplicate  element .
//Set /HasSet /SortedSet/LinkedHashSet/Navigable set/Tree set
//Set------------------Set

//HasSetis un order collection
//LinkedHasSet follow insertion order .
//Sorted set and navigable set both are interface .
//Tree Set in sorted .

//////MAP\\\\\\
///Hashmap  HashTable  SotedMap
///LinkedHasmap          NavigableMap
///                        TreeMap


