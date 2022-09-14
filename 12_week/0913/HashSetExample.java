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

		System.out.println("�� ��ü�� : " + set.size());
		System.out.println();

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		} // ������ �����Ƿ� ���� ������ ������� �ϳ��� �� �� ���´�.

		set.remove("JDBC");
		set.remove("iBATIS");

		System.out.println("�� ��ü�� : " + set.size());
		System.out.println();

		iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.clear();
		if (set.isEmpty())
			System.out.println("�������");
	}
}
