package chap99_homework.homework10;

import java.util.ArrayList;
import java.util.List;

public class TList<T> {
	private List<T> tList;
	private List<T> firstHalfList;
	private List<T> secondHalfList;
	
	public List<T> getFirstHalfList() {
		return firstHalfList;
	}

	public void setFirstHalfList(List<T> firstHalfList) {
		this.firstHalfList = firstHalfList;
	}

	public List<T> getSecondHalfList() {
		return secondHalfList;
	}

	public void setSecondHalfList(List<T> secondHalfList) {
		this.secondHalfList = secondHalfList;
	}

	public List<T> gettList() {
		return tList;
	}

	public void settList(List<T> tList) {
		this.tList = tList;
	}

	public void splitList() {
		firstHalfList = new ArrayList<T>();
		secondHalfList = new ArrayList<T>();
		
		for(int i = 0; i < this.tList.size(); i++) {
			if(tList.size() % 2 == 0) {
				if(i < tList.size() / 2) {
					firstHalfList.add(tList.get(i));
				} else {
					secondHalfList.add(tList.get(i));
				}
					
			} else {
				if(i < tList.size() / 2 + 1) {
					firstHalfList.add(tList.get(i));
				} else {
					secondHalfList.add(tList.get(i));
				}
			}
		}
	}
}
