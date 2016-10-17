package com.zagar.tourism;

import java.util.List;

/**
 * Created by naayadaa on 16.08.16.
 */
public class Hotel {

    private String country;

    private String district;

    private String city;

    private String hotelCategory;

    private String hotelName;

    private Double latitude;

    private Double longitude;

    private List<HotelOption> options;

    private HotelDescription description;

    public Hotel() {
    }

    public Hotel(String hotelCategory, String hotelName) {

        this.hotelCategory = hotelCategory;
        this.hotelName = hotelName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHotelCategory() {
        return hotelCategory;
    }

    public void setHotelCategory(String hotelCategory) {
        this.hotelCategory = hotelCategory;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public List<HotelOption> getOptions() {
        return options;
    }

    public void setOptions(List<HotelOption> options) {
        this.options = options;
    }

    public HotelDescription getDescription() {
        return description;
    }

    public void setDescription(HotelDescription description) {
        this.description = description;
    }
}
