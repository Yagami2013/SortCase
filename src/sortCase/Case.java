package sortCase;

class Case {
	private String casename;
	private String reliantCase;

	public String getName() {
		return casename;
	}

	public String getRely() {
		return reliantCase;
	}

	public void setName(String name) {
		this.casename = name;
	}

	public void setRely(String rely) {
		this.reliantCase = rely;
	}
}