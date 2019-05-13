package com.matrixbi.objects;

import java.io.Serializable;

public class ServiceCenterCurrentLoad {

    private String formType;
    private String serviceCenterAbbr;
    private int numFormsSent;
    private Double currentLoadPercentage;
    private Double underUtilizationPercentage;

    public ServiceCenterCurrentLoad() {
    }

    public ServiceCenterCurrentLoad(String formType, String serviceCenterAbbr, int numFormsSent, Double currentLoadPercentage, Double underUtilizationPercentage) {
        this.formType = formType;
        this.serviceCenterAbbr = serviceCenterAbbr;
        this.numFormsSent = numFormsSent;
        this.currentLoadPercentage = currentLoadPercentage;
        this.underUtilizationPercentage = underUtilizationPercentage;
    }


    // Given the total number of msgs processed in server, compute current Service Center Load Percentage
    public void computeNewCurrentLoadPercentage( int totalMsgsProcessed ) {
        // System.out.println("POJO: computeNewCurrentLoadPercentage: SC: " + getServiceCenterAbbr() + " numFormsSent: " + getNumFormsSent() + " Total #msgs: " + totalMsgsProcessed + " %: " + ((double)getNumFormsSent() / (double)totalMsgsProcessed) * 100.0);
        setCurrentLoadPercentage( ((double) getNumFormsSent() / (double)totalMsgsProcessed) * 100.0 );
    }

    public void computeNewuUnderUtilizationPercentage( Double desiredLoadPercent ) {
       // System.out.println("POJO: computeNewuUnderUtilizationPercentage: SC: " + getServiceCenterAbbr() + " getCurrentLoadPercentage: " + getCurrentLoadPercentage() + " desiredLoadPercent: " + desiredLoadPercent + " New UU%: " + getUnderUtilizationPercentage() );
        setUnderUtilizationPercentage( desiredLoadPercent - getCurrentLoadPercentage() );
    }

    public String getformType() {
        return this.formType;
    }

    public void setformType(String formType) {
        this.formType = formType;
    }

    public String getServiceCenterAbbr() {
        return this.serviceCenterAbbr;
    }

    public void setServiceCenterAbbr(String serviceCenterAbbr) {
        this.serviceCenterAbbr = serviceCenterAbbr;
    }

    public int getNumFormsSent() {
        return this.numFormsSent;
    }

    public void setNumFormsSent(int numFormsSent) {
        this.numFormsSent = numFormsSent;
    }

    public Double getCurrentLoadPercentage() {
        return this.currentLoadPercentage;
    }

    public void setCurrentLoadPercentage(Double currentLoadPercentage) {
        this.currentLoadPercentage = currentLoadPercentage;
    }

    public Double getUnderUtilizationPercentage() {
        return this.underUtilizationPercentage;
    }

    public void setUnderUtilizationPercentage(Double underUtilizationPercentage) {
        this.underUtilizationPercentage = underUtilizationPercentage;
    }

    public void setUnderUtilizationPercentage(int  underUtilizationPercentage) {
        this.underUtilizationPercentage = Double.valueOf( underUtilizationPercentage );
    }

    public ServiceCenterCurrentLoad formType(String formType) {
        this.formType = formType;
        return this;
    }

    public ServiceCenterCurrentLoad serviceCenterAbbr(String serviceCenterAbbr) {
        this.serviceCenterAbbr = serviceCenterAbbr;
        return this;
    }

    public ServiceCenterCurrentLoad numFormsSent(int numFormsSent) {
        this.numFormsSent = numFormsSent;
        return this;
    }

    public ServiceCenterCurrentLoad currentLoadPercentage(Double currentLoadPercentage) {
        this.currentLoadPercentage = currentLoadPercentage;
        return this;
    }

    public ServiceCenterCurrentLoad underUtilizationPercentage(Double underUtilizationPercentage) {
        this.underUtilizationPercentage = underUtilizationPercentage;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " formType='" + getformType() + "'" +
            ", serviceCenterAbbr='" + getServiceCenterAbbr() + "'" +
            ", numFormsSent='" + getNumFormsSent() + "'" +
            ", currentLoadPercentage='" + getCurrentLoadPercentage() + "'" +
            ", underUtilizationPercentage='" + getUnderUtilizationPercentage() + "'" +
            "}";
    }

}