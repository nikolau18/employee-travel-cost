package com.travelcost.entity;

import java.math.BigDecimal;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "destination")
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "destination_id")
    private Long destinationId;
    
    @Column(name = "country")
    private String country;
    
    @Column(name = "city")
    private String city;
    
    @Column(name = "daily_cost")
    private BigDecimal dailyCost;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "destinationId")
    private Collection<BusinessTrip> businessTripCollection;

    public Destination() {
    }

    public Long getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BigDecimal getDailyCost() {
        return dailyCost;
    }

    public void setDailyCost(BigDecimal dailyCost) {
        this.dailyCost = dailyCost;
    }

    @XmlTransient
    public Collection<BusinessTrip> getBusinessTripCollection() {
        return businessTripCollection;
    }

    public void setBusinessTripCollection(Collection<BusinessTrip> businessTripCollection) {
        this.businessTripCollection = businessTripCollection;
    }

	@Override
	public String toString() {
		return "Destination [destinationId=" + destinationId + ", country=" + country + ", city=" + city
				+ ", dailyCost=" + dailyCost + ", businessTripCollection=" + businessTripCollection + "]";
	}

    
}
