package _0913;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LottoEx {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		Set<Integer> numList = new HashSet();

		while (numList.size() != 6) {
			numList.add((int) (Math.random() * 45) + 1);
		}

		Iterator<Integer> iterator = numList.iterator();
		while (iterator.hasNext()) {
			int element = iterator.next();
			System.out.print(element + " ");
			arrayList.add(element);
		}
		System.out.println();

		Collections.sort(arrayList);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
	}
}
