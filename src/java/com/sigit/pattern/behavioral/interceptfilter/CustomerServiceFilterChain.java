package com.sigit.pattern.behavioral.interceptfilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/18/2017.
 *         Copyright 2017
 */


public class CustomerServiceFilterChain implements ComplainProcessFilterChain{

    private Iterator<ServiceHandler> iterator;
    private ManagementResponse target;


    public CustomerServiceFilterChain(ManagementResponse target, ServiceHandler... serviceHandlers) {
        List<ServiceHandler> list = new ArrayList<>();
        Collections.addAll(list, serviceHandlers);
        iterator = list.iterator();
        this.target = target;
    }


    public void doHandleIssue(Issue issue) {
        if (iterator.hasNext()) {
            iterator.next().doHandleIssue(issue, this);
        } else {
            // done
            target.doHandleIssue(issue);
        }


    }


}
