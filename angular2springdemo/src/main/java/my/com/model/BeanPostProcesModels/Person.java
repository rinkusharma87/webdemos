package my.com.model.BeanPostProcesModels;

public class Person {
	
	private String name;
	private String fatherName;
	private String village;
	
	
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	public void initM(){
		
		System.out.println(" init1 ");
		name = "Mr. "+name;
		this.setName(name);
		
		this.setVillage("Kalyanpur");
	}
	
}
