package my.com.model.BeanPostProcesModels;

public class Company {
	
	private String cName;
	private Person ownar1;

	public Person getOwnar1() {
		return ownar1;
	}

	public void setOwnar1(Person ownar1) {
		this.ownar1 = ownar1;
	}


	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

}
