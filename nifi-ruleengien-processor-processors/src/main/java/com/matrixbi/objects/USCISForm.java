package com.matrixbi.objects;

import java.io.Serializable;

public class USCISForm {

    private String formType;
    private String formSubType;
    private String status;
    private String destServiceCenterAbbr;

    public USCISForm() {
    }

    public USCISForm(String formType, String formSubType, String status, String destServiceCenterAbbr ) {
        this.formType = formType;
        this.formSubType = formSubType;
        this.status = status;
        this.destServiceCenterAbbr = destServiceCenterAbbr;
    }

    /**
     * @return the formType
     */
    public String getFormType() {
        return formType;
    }

    /**
     * @param formType the formType to set
     */
    public void setFormType(String formType) {
        this.formType = formType;
    }

    /**
     * @return the formSubType
     */
    public String getFormSubType() {
        return formSubType;
    }

    /**
     * @param formSubType the formSubType to set
     */
    public void setFormSubType(String formSubType) {
        this.formSubType = formSubType;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the destServiceCenterAbbr
     */
    public String getDestServiceCenterAbbr() {
        return destServiceCenterAbbr;
    }

    /**
     * @param destServiceCenterAbbr the destServiceCenterAbbr to set
     */
    public void setDestServiceCenterAbbr(String destServiceCenterAbbr) {
        this.destServiceCenterAbbr = destServiceCenterAbbr;
    }
}