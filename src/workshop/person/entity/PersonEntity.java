package workshop.person.entity;

public class PersonEntity {
//	 PersonEntity(String name, String ssn, String address, String phone)
	private String name;
	private char gender;
	private String ssn;
	private String address;
	private String phone;
	
	//생성자
	public PersonEntity() {
		
	}
	public PersonEntity(String name, String ssn, String address, String phone) {
		setName(name);
		setSsn(ssn);
		setAddress(address);
		setPhone(phone);
	}

	//getter, setter 메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		if(gender =='1' || gender =='3'){
			this.gender = '남';
		}else if(gender =='2' || gender=='4') {
			this.gender = '여';
		}
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
		setGender(ssn.charAt(6));
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}
