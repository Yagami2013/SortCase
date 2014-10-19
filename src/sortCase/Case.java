package sortCase;

public class Case {
	private String casename;
	private Case reliantCase;
	public  Case() {}
	public  Case(String name, Case rely) {
		this.casename=name;
		this.reliantCase=rely;
	}
	public String getName() {
		return casename;
	}

	public Case getRely() {
		return reliantCase;
	}

	public void setName(String name) {
		this.casename = name;
	}

	public void setRely(Case rely) {
		this.reliantCase = rely;
	}
}