package Assignment11;

import java.io.ObjectStreamException;
import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (this == obj) return true;
		if (getClass() != obj.getClass()) return false;
		Key cast = (Key) obj;
		return firstName.equals(cast.firstName) && lastName.equals(cast.lastName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}


}
