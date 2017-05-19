package com.sigit.pattern.behavioral.interceptfilter;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/18/2017.
 *         Copyright 2017
 */


public interface ServiceHandler {

    public void doHandleIssue(Issue issue , CustomerServiceFilterChain customerServiceFilterChain );
}
