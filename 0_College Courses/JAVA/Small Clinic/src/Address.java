/*
 * User Address
 */
public class Address {
	private String province;
	private String city;
	private String streetName;
	private String buildingNumber;
	private String roomNo;
	private String postalCode;
	//address setter
	public void setAddress(String province, String city,String streetName,
			String buildingNumber,String roomNo,String postalCode){		
		this.province = province;
		this.city = city;
		this.streetName = streetName;
		this.buildingNumber = buildingNumber;
		this.roomNo = roomNo;
		this.postalCode = postalCode;
	}
	//address getter
	public String getAddress() {
		String address = roomNo + "-" + buildingNumber + "," + streetName +  "," 
				+ city + "," + province + "," + postalCode;
		return address;	
	}
}
