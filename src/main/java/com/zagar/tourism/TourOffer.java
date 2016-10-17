package com.zagar.tourism;



import com.zagar.tourism.enums.AccommodationType;
import com.zagar.tourism.enums.Board;

import java.util.Date;

/**
 * Created by naayadaa on 16.08.16.
 */
public class TourOffer {

    private Date startDate;

    private Date endDate;

    private Tour tour;

    private Integer nights;

    private Hotel hotel;

    private AccommodationType accommodationType;

    private Board board;

    private Double price;

    public TourOffer() {
    }

    public TourOffer(Date startDate, Date endDate, Tour tour, Integer nights,
                     Hotel hotel, AccommodationType accommodationType, Board board, Double price) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.tour = tour;
        this.nights = nights;
        this.hotel = hotel;
        this.accommodationType = accommodationType;
        this.board = board;
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Integer getNights() {
        return nights;
    }

    public void setNights(Integer nights) {
        this.nights = nights;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public AccommodationType getAccommodationType() {
        return accommodationType;
    }

    public void setAccommodationType(AccommodationType accommodationType) {
        this.accommodationType = accommodationType;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
