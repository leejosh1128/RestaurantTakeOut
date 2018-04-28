
public class Resturtant {
	private int restId = 0;
	private String restName = "";
	private int restZip = 0;
	private String restNumber = "";
	private String restDesc = "";

	public Resturtant() {

	}

	public Resturtant(int id, String name, int zip, String number, String description) {
		restId = id;
		restName = name;
		restZip = zip;
		restNumber = number;
		restDesc = description;

	}

	public void setRestName(String name) {
		restName = name;
	}

	public void setRestZip(int zip) {
		restZip = zip;
	}

	public void setRestId(int id) {
		restId = id;
	}

	public void setRestNumber(String number) {
		restNumber = number;
	}

	public void setRestDesc(String description) {
		restDesc = description;
	}

	public String getRestName() {
		return restName;
	}

	public int getRestZip() {
		return restZip;
	}

	public int getRestId() {
		return restId;
	}

	public String getRestDesc() {
		return restDesc;
	}

	public String getRestNumber() {
		return restNumber;
	}

}
