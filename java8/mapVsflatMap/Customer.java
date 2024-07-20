package mapVsflatMap;

import java.util.List;

public class Customer {

    private int id;
    private String name;
    private String email;
    private List<String> phoneNumbers;
    private List<Customer> familymembers;


	public Customer() {
    }

    public Customer(int id, String name, String email, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
    }

    public Customer(int id, String name, String email, List<String> phoneNumbers , List<Customer> familymembers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
        this.familymembers = familymembers;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    
    public List<Customer> getFamilymembers() {
		return familymembers;
	}

	public void setFamilymembers(List<Customer> familymembers) {
		this.familymembers = familymembers;
	}
}
