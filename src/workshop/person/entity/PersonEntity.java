package workshop.person.entity;

public class PersonEntity {
//	 PersonEntity(String name, String ssn, String address, String phone)
	private String name;
	private char gender;
	private String ssn;
	private String address;
	private String phone;
	
	//������
	public PersonEntity() {
		
	}
	public PersonEntity(String name, String ssn, String address, String phone) {
		setName(name);
		setSsn(ssn);
		setAddress(address);
		setPhone(phone);
	}

	//getter, setter �޼���
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
			this.gender = '��';
		}else if(gender =='2' || gender=='4') {
			this.gender = '��';
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
