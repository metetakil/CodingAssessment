package mtakil.model;

import java.io.Serializable;

public class InterimPayment implements Serializable {

    private String couponType;
    private String interval;
    private int rate;
    private String paymentDate;
    private String redemptionDate;
    private String observationDate;
    private String determinationDate;

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getRedemptionDate() {
        return redemptionDate;
    }

    public void setRedemptionDate(String redemptionDate) {
        this.redemptionDate = redemptionDate;
    }

    public String getObservationDate() {
        return observationDate;
    }

    public void setObservationDate(String observationDate) {
        this.observationDate = observationDate;
    }

    public String getDeterminationDate() {
        return determinationDate;
    }

    public void setDeterminationDate(String determinationDate) {
        this.determinationDate = determinationDate;
    }
}
