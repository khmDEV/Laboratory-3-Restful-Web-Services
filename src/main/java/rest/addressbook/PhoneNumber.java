package rest.addressbook;

import static rest.addressbook.PhoneType.*;

/**
 * A phone number
 *
 */
public class PhoneNumber {

	private String number;
	private PhoneType type = HOME;

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public PhoneType getType() {
		return type;
	}
	public void setType(PhoneType type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PhoneNumber){
			PhoneNumber p=(PhoneNumber)obj;
			return p.getNumber()==getNumber()
								&& p.getType()==getType();
		}
		return false;
	}

}
