package _0913;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");

		System.out.println("총 객체수 : " + set.size());
		System.out.println();

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		} // 순서가 없으므로 넣은 순서와 상관없이 하나씩 다 가 져온다.

		set.remove("JDBC");
		set.remove("iBATIS");

		System.out.println("총 객체수 : " + set.size());
		System.out.println();

		iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.clear();
		if (set.isEmpty())
			System.out.println("비어있음");
	}
}
