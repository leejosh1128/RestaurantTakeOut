public class Customer {
	private String myUsername = "";
	private int myZip = 0;

	public Customer() {

	}

	public Customer(String name, int zip) {
		myUsername = name;
		myZip = zip;
	}

	public void setUserName(String name) {
		myUsername = name;
	}

	public void setZip(int zip) {
		myZip = zip;
	}

	public String getUserName() {
		return myUsername;
	}

	public int getZip() {
		return myZip;
	}
}
