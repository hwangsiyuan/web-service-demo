package com.hussein;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws RemoteException, ServiceException {
        WorkflowServiceLocator workflowServiceLocator = new WorkflowServiceLocator();
        WorkflowServicePortType workflowServiceHttpPort = workflowServiceLocator.getWorkflowServiceHttpPort();
        int count = workflowServiceHttpPort.getToDoWorkflowRequestCount(1, new String[]{});
        System.out.println(count);
    }
}
