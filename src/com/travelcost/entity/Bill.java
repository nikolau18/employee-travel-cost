package com.travelcost.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "bill")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bill_id")
    private Long billId;
    
    @Column(name = "type")
    private String type;
    
   @Column(name = "amount")
    private BigDecimal amount;
    
    @Column(name = "recieve_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recieveDate;
    @JoinColumn(name = "business_trip_id", referencedColumnName = "business_trip_id")
    @ManyToOne(optional = false)
    private BusinessTrip businessTripId;

    public Bill() {
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getRecieveDate() {
        return recieveDate;
    }

    public void setRecieveDate(Date recieveDate) {
        this.recieveDate = recieveDate;
    }

    public BusinessTrip getBusinessTripId() {
        return businessTripId;
    }

    public void setBusinessTripId(BusinessTrip businessTripId) {
        this.businessTripId = businessTripId;
    }

	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", type=" + type + ", amount=" + amount + ", recieveDate=" + recieveDate
				+ ", businessTripId=" + businessTripId + "]";
	}
    
}
