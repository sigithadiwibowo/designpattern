package com.sigit.pattern.behavioral.interceptfilter;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/18/2017.
 *         Copyright 2017
 */


public class Issue {

    private int issueId;
    private int issueDesc;
    private String handleBy;
    private int issuePriority ;

    private Object additionalInfo ;

    public int getIssueId() {
        return issueId;
    }

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public int getIssueDesc() {
        return issueDesc;
    }

    public void setIssueDesc(int issueDesc) {
        this.issueDesc = issueDesc;
    }

    public String getHandleBy() {
        return handleBy;
    }

    public void setHandleBy(String handleBy) {
        this.handleBy = handleBy;
    }

    public int getIssuePriority() {
        return issuePriority;
    }

    public void setIssuePriority(int issuePriority) {
        this.issuePriority = issuePriority;
    }

    public Object getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(Object additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


}
