package com.sigit.pattern.behavioral.interceptfilter;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/18/2017.
 *         Copyright 2017
 */


public class Customer {

    private Issue issue;
    private boolean happyState ;

    public Customer(Issue issue) {
        this.issue = issue;
        issue.setAdditionalInfo("Issue sent by customer , id :" + issue.getIssueId());
    }


    public Issue getIssue() {
        return issue;
    }


    public boolean isHappyState() {
        return happyState;
    }

    public void setHappyState(boolean happyState) {
        this.happyState = happyState;
    }
}
