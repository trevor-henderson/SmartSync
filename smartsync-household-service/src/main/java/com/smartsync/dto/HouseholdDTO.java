package com.smartsync.dto;

/**
 * @author Jack Meyer (jackcmeyer@gmail.com)
 *
 * The household data transfer object
 */
public class HouseholdDTO {

    /**
     * The nickname of the household
     */
    private String householdName;


    /**
     * The userId of the owner of the household
     */
    private String ownerId;

    /**
     * The first address line
     *
     * Ex. 111 Main ST SW
     */
    private String firstAddressLine;

    /**
     * The second address line
     *
     * Ex. Apt 111
     */
    private String secondAddressLine;

    /**
     * The city that the household is in
     *
     * Ex. Ames
     */
    private String city;

    /**
     * The state that the household is in
     * Ex. IA
     */
    private String state;

    /**
     * The zip code of the household
     */
    private int zipCode;

    public HouseholdDTO(String householdName, String ownerId, String firstAddressLine, String secondAddressLine,
                        String city, String state, int zipCode) {
        this.householdName = householdName;
        this.ownerId = ownerId;
        this.firstAddressLine = firstAddressLine;
        this.secondAddressLine = secondAddressLine;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public HouseholdDTO() {
        // default constructor
    }

    public String getHouseholdName() {
        return householdName;
    }

    public void setHouseholdName(String householdName) {
        this.householdName = householdName;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getFirstAddressLine() {
        return firstAddressLine;
    }

    public void setFirstAddressLine(String firstAddressLine) {
        this.firstAddressLine = firstAddressLine;
    }

    public String getSecondAddressLine() {
        return secondAddressLine;
    }

    public void setSecondAddressLine(String secondAddressLine) {
        this.secondAddressLine = secondAddressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
