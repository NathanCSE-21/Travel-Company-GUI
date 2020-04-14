import java.io.Serializable;

public class NewProfile implements Serializable{
	String ID;
	String firstName;
	String lastName;
	String address;
	String phone;
	Float tripCost;
	String travelType;
	String paymentType;
	String mdContact;
	String mdPhone;
	String illness;
	String allergy;
	
	public NewProfile(String ID, String firstName,String lastName, String address,String phone,Float tripCost, String travelType
			, String paymentType, String mdContact, String mdPhone, String illness, String allergy) {
		super();
		
		this.ID = ID;
		this.firstName= firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.tripCost = tripCost;
		this.travelType = travelType;
		this.paymentType = paymentType;
		this.mdContact = mdContact;
		this.mdPhone = mdPhone;
		this.illness = illness;
		this.allergy = allergy;
		
	}
	
	@Override
    public String toString() {
        return "Profile [AgentID: " + ID + ", firstName: " + firstName + ", lastName: " + lastName +
        		", address: " + address + ", phone: " + phone + ", tripCost: " + tripCost + ", travelType: " + travelType
        		+ ", paymentType: " + paymentType + ", mdContact: " + mdContact + ", mdPhone: " + mdPhone
        		+ ", illness: " +illness + ", allergy: " + allergy +"]";
    }
	
}

