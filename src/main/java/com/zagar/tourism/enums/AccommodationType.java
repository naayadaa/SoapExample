package com.zagar.tourism.enums;



import com.zagar.tourism.Child;

import java.util.List;

/**
 * Created by naayadaa on 16.08.16.
 */

public class AccommodationType {

        private int adults;
    private List<Child> children;


    private String accommodationType;

    public AccommodationType() {
    }

    public AccommodationType(int adults, List<Child> children){
        this.adults = adults;
        this.children = children;
        if(children != null && !children.isEmpty()){
            accommodationType = adults + "AD" + " + " + children.size() + "CH"; // TODO do graduation by age
        }
        else  accommodationType = adults + "AD";
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public String getAccommodationType() {
        return accommodationType;
    }

    public void setAccommodationType(String accommodationType) {
        this.accommodationType = accommodationType;
    }
}
