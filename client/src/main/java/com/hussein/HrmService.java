/**
 * HrmService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hussein;

public interface HrmService extends javax.xml.rpc.Service {
    public String getHrmServiceHttpPortAddress();

    public com.hussein.HrmServicePortType getHrmServiceHttpPort() throws javax.xml.rpc.ServiceException;

    public com.hussein.HrmServicePortType getHrmServiceHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
