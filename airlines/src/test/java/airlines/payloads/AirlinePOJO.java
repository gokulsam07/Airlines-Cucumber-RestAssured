package airlines.payloads;

import com.fasterxml.jackson.databind.ObjectMapper;

public class AirlinePOJO {

	private int id;
	private String name;
	private String country;
	private String logo;
	private String head_quaters;
	private String website;
	private int established;



	public AirlinePOJO() {


	}
	public AirlinePOJO(int id, String name, String country, String logo, String head_quaters, String website,int established ) {

		this.id=id;
		this.name=name;
		this.country=country;
		this.logo=logo;
		this.head_quaters=head_quaters;
		this.website=website;
		this.established=established;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getHead_quaters() {
		return head_quaters;
	}
	public void setHead_quaters(String head_quaters) {
		this.head_quaters = head_quaters;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public int getEstablished() {
		return established;
	}
	public void setEstablished(int established) {
		this.established = established;
	}
	@Override
	public String toString() {
		try {
			// Create an instance of the ObjectMapper
			ObjectMapper objectMapper = new ObjectMapper();
			// Serialize the object to JSON
			return objectMapper.writeValueAsString(this);
		} catch (Exception e) {
			e.printStackTrace();
			return super.toString();
		}
	}


}
