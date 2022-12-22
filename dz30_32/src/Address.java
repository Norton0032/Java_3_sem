
import java.io.Serializable;

public final class Address implements Serializable {
    private String cityName;
    private int zipCode;
    private String streetName;
    private int buildingNumber;
    private int apartmentNumber;
    private char buildingLetter;
    private Address EMPTY_ADDRESS;


    public Address(String cityName, int zipCode, String streetName, int buildingNumber, char buildingLetter, int apartmentNumber) {
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.apartmentNumber = apartmentNumber;
        this.buildingLetter = buildingLetter;
    }

    public String getCityName() {
        return cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public char getBuildingLetter() {
        return buildingLetter;
    }

}
