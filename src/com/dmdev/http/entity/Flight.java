package com.dmdev.http.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Flight {


    private Long id;
    private String flightNo;
    private LocalDateTime DepartureDate;
    private String DepartureAirportCode;
    private LocalDateTime arrivalAirportCode;
    private Integer aircraftId;
    private FlightStatus status;

    public Flight(Long id, String flightNo, LocalDateTime departureDate, String departureAirportCode, LocalDateTime arrivalDate, String arrivalAirportCode, Integer aircraftId, FlightStatus status) {
            this.id = id;
            this.flightNo = flightNo;
            DepartureDate = departureDate;
            DepartureAirportCode = departureAirportCode;
            this.arrivalAirportCode = LocalDateTime.parse(arrivalAirportCode);
            this.aircraftId = aircraftId;
            this.status = status;
        }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public LocalDateTime getDepartureDate() {
        return DepartureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        DepartureDate = departureDate;
    }

    public String getDepartureAirportCode() {
        return DepartureAirportCode;
    }

    public void setDepartureAirportCode(String departureAirportCode) {
        DepartureAirportCode = departureAirportCode;
    }

    public LocalDateTime getArrivalAirportCode() {
        return arrivalAirportCode;
    }

    public void setArrivalAirportCode(LocalDateTime arrivalAirportCode) {
        this.arrivalAirportCode = arrivalAirportCode;
    }

    public Integer getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(Integer aircraftId) {
        this.aircraftId = aircraftId;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(id, flight.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", flightNo='" + flightNo + '\'' +
                ", DepartureDate=" + DepartureDate +
                ", DepartureAirportCode='" + DepartureAirportCode + '\'' +
                ", arrivalAirportCode=" + arrivalAirportCode +
                ", aircraftId=" + aircraftId +
                ", status=" + status +
                '}';
    }
}
