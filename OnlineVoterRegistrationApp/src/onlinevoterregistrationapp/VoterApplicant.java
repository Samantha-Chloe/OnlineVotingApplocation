package onlinevoterregistrationapp;
public class VoterApplicant {
	private String first_name, middle_name, last_name, full_address, city, province,municipality, date_of_birth;
	private int  zip_code;
        private String voterIDs, age, phone_number;
	VoterApplicant(String voterIDs, String last_name, String first_name, String middle_name, String age,String full_address, String city, String province, String municipality, int zip_code, String date_of_birth, String phone_number){
		this.voterIDs = voterIDs;
		this.last_name = last_name;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.age = age;
		this.full_address = full_address;
		this.city = city;
                this.province = province;
                this.municipality = municipality;
		this.zip_code = zip_code;
		this.date_of_birth = date_of_birth;
		this.phone_number = phone_number;
		
	}
	public String getVoterID() {
		return this.voterIDs;
	}
	public void setVoterID(String voterID) {
		this.voterIDs = voterID;
	}
	public String getLastName() {
		return this.last_name;
	}
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}
	public String getFirstname() {
		return this.first_name;
	}
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddleName() {
		return this.middle_name;
	}
	public void setMiddleName(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getFullAddress() {
		return this.full_address;
	}
	public void setFullAddress(String full_address) {
		this.full_address = full_address;
	}
	public String getCity() {
		return this.city;
	}
        public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
        public String getMunicipality() {
		return this.municipality;
	}
	public void setMunicipality(String municipality) {
		this.province = province;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return this.zip_code;
	}
	public void setZipCode(int zip_code) {
		this.zip_code = zip_code;
	}
	public String getDateOfBirth() {
		return this.date_of_birth;
	}
	public void setDateOfBirth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getPhoneNumber() {
		return this.phone_number;
	}
	public void setPhoneNumber(String phone_number) {
		this.phone_number = phone_number;
	}
	
}