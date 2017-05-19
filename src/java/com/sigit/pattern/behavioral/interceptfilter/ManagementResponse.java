package com.sigit.pattern.behavioral.interceptfilter;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/18/2017.
 *         Copyright 2017
 */


public class ManagementResponse {

    public void doHandleIssue(Issue issue) {
        issue.setHandleBy("By Management ");
        issue.setAdditionalInfo("Issue closed by management ");
        System.out.println("ManagementResponse.doHandleIssue");
    }


}
