package endterm;

import java.util.Comparator;

public class AccountComparator implements Comparator<SampleAccount>{

	@Override
	public int compare(SampleAccount o1, SampleAccount o2) {
		return o1.nickname.compareTo(o2.nickname);
	}


}
