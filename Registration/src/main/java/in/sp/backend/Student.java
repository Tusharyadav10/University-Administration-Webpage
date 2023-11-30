package in.sp.backend;

public class Student {
	private String fName;
	private String lName;
	private String name;
	private String roll;
	
	private String base64Image;
	
	public String getBase64Image( ) {
		return base64Image;
	}
	
	public void setBase64Image(String base64Image) {
		this.base64Image = base64Image;
	}

	public String getFname() {
		return fName;
	}
	
	public void setFname(String fName2) {
		this.fName = fName2;
		
	}

	public String getLname() {
		return lName;
	}
	
	public void setLname(String lName2) {
		this.lName = lName2;	
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;	
	}
	
	public String getRoll() {
		return roll;
	}
	
	public void setRoll(String roll) {
		this.roll = roll;
	}
	
	// other fields...
	// other getters and setters...
}
