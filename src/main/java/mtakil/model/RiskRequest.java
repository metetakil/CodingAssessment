package mtakil.model;

import java.io.Serializable;
import java.util.List;

public class RiskRequest implements Serializable {

    private String issueDate;
    private String maturityDate;
    private List<String> underlyings;
    private RecordSummary recordSummary;
    private List<String> floatings;
    private List<Float> floatingsReset;
    private int[][] edges;
    private KnockinBarrier knockinBarrier;
    private int dividend;
    private int trend;
    private String rating;
    private List<String> initialReferenceDates;
    private List<String> finalReferenceDates;
    private List<String> earlyRedemption;
    private List<InterimPayment> interimPayments;
    private boolean memoryFlag;

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }

    public List<String> getUnderlyings() {
        return underlyings;
    }

    public void setUnderlyings(List<String> underlyings) {
        this.underlyings = underlyings;
    }

    public RecordSummary getRecordSummary() {
        return recordSummary;
    }

    public void setRecordSummary(RecordSummary recordSummary) {
        this.recordSummary = recordSummary;
    }

    public List<String> getFloatings() {
        return floatings;
    }

    public void setFloatings(List<String> floatings) {
        this.floatings = floatings;
    }

    public List<Float> getFloatingsReset() {
        return floatingsReset;
    }

    public void setFloatingsReset(List<Float> floatingsReset) {
        this.floatingsReset = floatingsReset;
    }

    public KnockinBarrier getKnockinBarrier() {
        return knockinBarrier;
    }

    public void setKnockinBarrier(KnockinBarrier knockinBarrier) {
        this.knockinBarrier = knockinBarrier;
    }

    public int[][] getEdges() {
        return edges;
    }

    public void setEdges(int[][] edges) {
        this.edges = edges;
    }

    public int getDividend() {
        return dividend;
    }

    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    public int getTrend() {
        return trend;
    }

    public void setTrend(int trend) {
        this.trend = trend;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public List<String> getInitialReferenceDates() {
        return initialReferenceDates;
    }

    public void setInitialReferenceDates(List<String> initialReferenceDates) {
        this.initialReferenceDates = initialReferenceDates;
    }

    public List<String> getFinalReferenceDates() {
        return finalReferenceDates;
    }

    public void setFinalReferenceDates(List<String> finalReferenceDates) {
        this.finalReferenceDates = finalReferenceDates;
    }

    public List<String> getEarlyRedemption() {
        return earlyRedemption;
    }

    public void setEarlyRedemption(List<String> earlyRedemption) {
        this.earlyRedemption = earlyRedemption;
    }

    public List<InterimPayment> getInterimPayments() {
        return interimPayments;
    }

    public void setInterimPayments(List<InterimPayment> interimPayments) {
        this.interimPayments = interimPayments;
    }

    public boolean isMemoryFlag() {
        return memoryFlag;
    }

    public void setMemoryFlag(boolean memoryFlag) {
        this.memoryFlag = memoryFlag;
    }

}
