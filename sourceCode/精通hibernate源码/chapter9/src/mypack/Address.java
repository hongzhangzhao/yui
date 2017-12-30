package mypack;
import java.io.Serializable;

public class Address implements Serializable {

    private final String province;
    private final String city;
    private final String street;
    private final String zipcode;

    public Address(String province, String city, String street, String zipcode) {
        this.street = street;
        this.city = city;
        this.province = province;
        this.zipcode = zipcode;

    }

    public String getProvince() {
        return this.province;
    }
    public String getCity() {
        return this.city;
    }

    public String getStreet() {
        return this.street;
    }

    public String getZipcode() {
        return this.zipcode;
    }


    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

	 final Address address = (Address) o;

	 if(!province.equals(address.province)) return false;
	 if(!city.equals(address.city)) return false;
	 if(!street.equals(address.street)) return false;
	 if(!zipcode.equals(address.zipcode)) return false;
	 return true;
    }
    public int hashCode(){
        int result;
	result= (province==null?0:province.hashCode());
	result = 29 * result + (city==null?0:city.hashCode());
        result = 29 * result + (street==null?0:street.hashCode());
        result = 29 * result + (zipcode==null?0:zipcode.hashCode());
	return result;
    }
}
