package com.zagar.tourism;

import java.util.Date;
import java.util.List;

/**
 * Created by naayadaa on 17.10.16.
 */
public class TourSearchRequest {
    private long departureCityId;

    private long countryId;

    private long regionId;

    private long cityId;

    private long tourTypeId;

    private String hotelCategory;

    private List<Child> children;

    private int adultsNumber;

    private List<Date> departureDates;

    private long mealId;



}
