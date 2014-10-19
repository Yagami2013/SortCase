package test;
import java.util.ArrayList;

import sortCase.Case;

public class Test{
	public void main() {
		testGetRelys();
	}

	public void testGetRelys(){
		ArrayList<Case> testlist=null;
		Case A1=new Case("a1", null);
		testlist.add(A1);
		Case A2=new Case("a2",A1);
		testlist.add(A2);
		Case A3=new Case("a3", A2);
		testlist.add(A3);
		Case B1=new Case("b1",null);
		testlist.add(B1);
		Case B2=new Case("b2",B1);
		testlist.add(B2);
		Case B3=new Case("b3", B2);
		testlist.add(B3);
		Case D1=new Case("d1",null);
		testlist.add(D1);
		Case D2=new Case("d2", D1);
		testlist.add(D2);
		Case D3=new Case("d3", D2);
		testlist.add(D3);
		testGetRely(testlist);
	}

	public void testGetRely(ArrayList<Case> testlist) {
		for (int i = 0; i < testlist.size(); i++) {
			System.out.println(testlist.get(i).getRely().getName());
		}
		
	}
}
