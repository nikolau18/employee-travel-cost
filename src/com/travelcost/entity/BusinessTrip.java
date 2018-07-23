package com.travelcost.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "business_trip")
public class BusinessTrip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "business_trip_id")
    private Long businessTripId;
    
    @Column(name = "start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    
    @Column(name = "end_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    
    @Column(name = "is_completed")
    private short isCompleted;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "businessTripId")
    private Collection<Bill> billCollection;
    
    @JoinColumn(name = "destination_id", referencedColumnName = "destination_id")
    @ManyToOne
    private Destination destinationId;
    
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    @ManyToOne
    private Employee employeeId;

    public BusinessTrip() {
    }

    public Long getBusinessTripId() {
        return businessTripId;
    }

    public void setBusinessTripId(Long businessTripId) {
        this.businessTripId = businessTripId;
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

    public short getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(short isCompleted) {
        this.isCompleted = isCompleted;
    }

    @XmlTransient
    public Collection<Bill> getBillCollection() {
        return billCollection;
    }

    public void setBillCollection(Collection<Bill> billCollection) {
        this.billCollection = billCollection;
    }

    public Destination getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Destination destinationId) {
        this.destinationId = destinationId;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

	@Override
	public String toString() {
		return "BusinessTrip [businessTripId=" + businessTripId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", isCompleted=" + isCompleted + ", billCollection=" + billCollection + ", destinationId="
				+ destinationId + ", employeeId=" + employeeId + "]";
	}
    
    
    
}
