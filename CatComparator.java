package Algorithm_Efficiency;

import java.util.Comparator;

public class CatComparator implements Comparator <NonComparableCat> {
	@Override
	public int compare(NonComparableCat o1, NonComparableCat o2) {
		return (o1.getAge() - o2.getAge());
	}
}
