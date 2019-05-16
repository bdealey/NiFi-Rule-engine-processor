
package com.matrixbi.objects;

import java.io.Serializable;
import java.util.Objects; 

public class ServiceCenterDesiredLoad {

    private String formType;
    private String formSubType;
    private String serviceCenterAbbr;
    private Double desiredLoadPercentage;

    public ServiceCenterDesiredLoad() {
    }

    public ServiceCenterDesiredLoad(String formType, String formSubType, String serviceCenterAbbr, Double desiredLoadPercentage) {
        this.formType = formType;
        this.formSubType = formSubType;
        this.serviceCenterAbbr = serviceCenterAbbr;
        this.desiredLoadPercentage = desiredLoadPercentage;
    }

    public String getFormType() {
        return this.formType;
    }

    public String getFormSubType() {
        return this.formSubType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    public void setFormSubType(String formSubType) {
        this.formSubType = formSubType;
    }

    public String getServiceCenterAbbr() {
        return this.serviceCenterAbbr;
    }

    public void setServiceCenterAbbr(String serviceCenterAbbr) {
        this.serviceCenterAbbr = serviceCenterAbbr;
    }

    public Double getDesiredLoadPercentage() {
        return this.desiredLoadPercentage;
    }

    public void setDesiredLoadPercentage(Double desiredLoadPercentage) {
        this.desiredLoadPercentage = desiredLoadPercentage;
    }

    public ServiceCenterDesiredLoad formType(String formType) {
        this.formType = formType;
        return this;
    }

    public ServiceCenterDesiredLoad serviceCenterAbbr(String serviceCenterAbbr) {
        this.serviceCenterAbbr = serviceCenterAbbr;
        return this;
    }

    public ServiceCenterDesiredLoad desiredLoadPercentage(Double desiredLoadPercentage) {
        this.desiredLoadPercentage = desiredLoadPercentage;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ServiceCenterDesiredLoad)) {
            return false;
        }
        ServiceCenterDesiredLoad serviceCenterDesiredLoad = (ServiceCenterDesiredLoad) o;
        return Objects.equals(formType, serviceCenterDesiredLoad.formType) && Objects.equals(serviceCenterAbbr, serviceCenterDesiredLoad.serviceCenterAbbr) && Objects.equals(desiredLoadPercentage, serviceCenterDesiredLoad.desiredLoadPercentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formType, serviceCenterAbbr, desiredLoadPercentage);
    }

    @Override
    public String toString() {
        return "{" +
            " formType='" + getFormType() + "'" +
            ", formSubType='" + getFormSubType() + "'" +
            ", serviceCenterAbbr='" + getServiceCenterAbbr() + "'" +
            ", desiredLoadPercentage='" + getDesiredLoadPercentage() + "'" +
            "}";
    }

}