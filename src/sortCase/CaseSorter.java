package sortCase;

import java.util.ArrayList;

public class CaseSorter {
	//public static ArrayList<Case> newList;

	public void main() {
		getCase();
		filterCase();
	}

	private void filterCase() {
		// TODO Auto-generated method stub

	}

	public static ArrayList<Case> caseSort(ArrayList<Case> srcCase) {
		ArrayList<Case> newList = null;
		for (int i = 0; i < srcCase.size(); i++) {
			Case theCase=srcCase.get(i);
			getRelys(theCase,null);
		}
		
		return newList;
	}

	public static  ArrayList<Case> getRelys(Case theCase,ArrayList<Case> tmpList) {
		//ArrayList<Case> tmpList=null;
		while (theCase.getRely()!=null) {
			getRelys(theCase.getRely(),tmpList);			
		}
		tmpList.add(theCase);
		return tmpList;
		
	}

	private void getCase() {
		// TODO Auto-generated method stub

	}

}
