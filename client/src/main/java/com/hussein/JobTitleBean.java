/**
 * JobTitleBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hussein;

public class JobTitleBean  implements java.io.Serializable {
    private String _code;

    private String _departmentid;

    private String _fullname;

    private String _jobcompetency;

    private String _jobdoc;

    private String _jobresponsibility;

    private String _jobtitleid;

    private String _jobtitleremark;

    private String _lastChangdate;

    private String _shortname;

    private String action;

    public JobTitleBean() {
    }

    public JobTitleBean(
           String _code,
           String _departmentid,
           String _fullname,
           String _jobcompetency,
           String _jobdoc,
           String _jobresponsibility,
           String _jobtitleid,
           String _jobtitleremark,
           String _lastChangdate,
           String _shortname,
           String action) {
           this._code = _code;
           this._departmentid = _departmentid;
           this._fullname = _fullname;
           this._jobcompetency = _jobcompetency;
           this._jobdoc = _jobdoc;
           this._jobresponsibility = _jobresponsibility;
           this._jobtitleid = _jobtitleid;
           this._jobtitleremark = _jobtitleremark;
           this._lastChangdate = _lastChangdate;
           this._shortname = _shortname;
           this.action = action;
    }


    /**
     * Gets the _code value for this JobTitleBean.
     * 
     * @return _code
     */
    public String get_code() {
        return _code;
    }


    /**
     * Sets the _code value for this JobTitleBean.
     * 
     * @param _code
     */
    public void set_code(String _code) {
        this._code = _code;
    }


    /**
     * Gets the _departmentid value for this JobTitleBean.
     * 
     * @return _departmentid
     */
    public String get_departmentid() {
        return _departmentid;
    }


    /**
     * Sets the _departmentid value for this JobTitleBean.
     * 
     * @param _departmentid
     */
    public void set_departmentid(String _departmentid) {
        this._departmentid = _departmentid;
    }


    /**
     * Gets the _fullname value for this JobTitleBean.
     * 
     * @return _fullname
     */
    public String get_fullname() {
        return _fullname;
    }


    /**
     * Sets the _fullname value for this JobTitleBean.
     * 
     * @param _fullname
     */
    public void set_fullname(String _fullname) {
        this._fullname = _fullname;
    }


    /**
     * Gets the _jobcompetency value for this JobTitleBean.
     * 
     * @return _jobcompetency
     */
    public String get_jobcompetency() {
        return _jobcompetency;
    }


    /**
     * Sets the _jobcompetency value for this JobTitleBean.
     * 
     * @param _jobcompetency
     */
    public void set_jobcompetency(String _jobcompetency) {
        this._jobcompetency = _jobcompetency;
    }


    /**
     * Gets the _jobdoc value for this JobTitleBean.
     * 
     * @return _jobdoc
     */
    public String get_jobdoc() {
        return _jobdoc;
    }


    /**
     * Sets the _jobdoc value for this JobTitleBean.
     * 
     * @param _jobdoc
     */
    public void set_jobdoc(String _jobdoc) {
        this._jobdoc = _jobdoc;
    }


    /**
     * Gets the _jobresponsibility value for this JobTitleBean.
     * 
     * @return _jobresponsibility
     */
    public String get_jobresponsibility() {
        return _jobresponsibility;
    }


    /**
     * Sets the _jobresponsibility value for this JobTitleBean.
     * 
     * @param _jobresponsibility
     */
    public void set_jobresponsibility(String _jobresponsibility) {
        this._jobresponsibility = _jobresponsibility;
    }


    /**
     * Gets the _jobtitleid value for this JobTitleBean.
     * 
     * @return _jobtitleid
     */
    public String get_jobtitleid() {
        return _jobtitleid;
    }


    /**
     * Sets the _jobtitleid value for this JobTitleBean.
     * 
     * @param _jobtitleid
     */
    public void set_jobtitleid(String _jobtitleid) {
        this._jobtitleid = _jobtitleid;
    }


    /**
     * Gets the _jobtitleremark value for this JobTitleBean.
     * 
     * @return _jobtitleremark
     */
    public String get_jobtitleremark() {
        return _jobtitleremark;
    }


    /**
     * Sets the _jobtitleremark value for this JobTitleBean.
     * 
     * @param _jobtitleremark
     */
    public void set_jobtitleremark(String _jobtitleremark) {
        this._jobtitleremark = _jobtitleremark;
    }


    /**
     * Gets the _lastChangdate value for this JobTitleBean.
     * 
     * @return _lastChangdate
     */
    public String get_lastChangdate() {
        return _lastChangdate;
    }


    /**
     * Sets the _lastChangdate value for this JobTitleBean.
     * 
     * @param _lastChangdate
     */
    public void set_lastChangdate(String _lastChangdate) {
        this._lastChangdate = _lastChangdate;
    }


    /**
     * Gets the _shortname value for this JobTitleBean.
     * 
     * @return _shortname
     */
    public String get_shortname() {
        return _shortname;
    }


    /**
     * Sets the _shortname value for this JobTitleBean.
     * 
     * @param _shortname
     */
    public void set_shortname(String _shortname) {
        this._shortname = _shortname;
    }


    /**
     * Gets the action value for this JobTitleBean.
     * 
     * @return action
     */
    public String getAction() {
        return action;
    }


    /**
     * Sets the action value for this JobTitleBean.
     * 
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof JobTitleBean)) return false;
        JobTitleBean other = (JobTitleBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._code==null && other.get_code()==null) || 
             (this._code!=null &&
              this._code.equals(other.get_code()))) &&
            ((this._departmentid==null && other.get_departmentid()==null) || 
             (this._departmentid!=null &&
              this._departmentid.equals(other.get_departmentid()))) &&
            ((this._fullname==null && other.get_fullname()==null) || 
             (this._fullname!=null &&
              this._fullname.equals(other.get_fullname()))) &&
            ((this._jobcompetency==null && other.get_jobcompetency()==null) || 
             (this._jobcompetency!=null &&
              this._jobcompetency.equals(other.get_jobcompetency()))) &&
            ((this._jobdoc==null && other.get_jobdoc()==null) || 
             (this._jobdoc!=null &&
              this._jobdoc.equals(other.get_jobdoc()))) &&
            ((this._jobresponsibility==null && other.get_jobresponsibility()==null) || 
             (this._jobresponsibility!=null &&
              this._jobresponsibility.equals(other.get_jobresponsibility()))) &&
            ((this._jobtitleid==null && other.get_jobtitleid()==null) || 
             (this._jobtitleid!=null &&
              this._jobtitleid.equals(other.get_jobtitleid()))) &&
            ((this._jobtitleremark==null && other.get_jobtitleremark()==null) || 
             (this._jobtitleremark!=null &&
              this._jobtitleremark.equals(other.get_jobtitleremark()))) &&
            ((this._lastChangdate==null && other.get_lastChangdate()==null) || 
             (this._lastChangdate!=null &&
              this._lastChangdate.equals(other.get_lastChangdate()))) &&
            ((this._shortname==null && other.get_shortname()==null) || 
             (this._shortname!=null &&
              this._shortname.equals(other.get_shortname()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get_code() != null) {
            _hashCode += get_code().hashCode();
        }
        if (get_departmentid() != null) {
            _hashCode += get_departmentid().hashCode();
        }
        if (get_fullname() != null) {
            _hashCode += get_fullname().hashCode();
        }
        if (get_jobcompetency() != null) {
            _hashCode += get_jobcompetency().hashCode();
        }
        if (get_jobdoc() != null) {
            _hashCode += get_jobdoc().hashCode();
        }
        if (get_jobresponsibility() != null) {
            _hashCode += get_jobresponsibility().hashCode();
        }
        if (get_jobtitleid() != null) {
            _hashCode += get_jobtitleid().hashCode();
        }
        if (get_jobtitleremark() != null) {
            _hashCode += get_jobtitleremark().hashCode();
        }
        if (get_lastChangdate() != null) {
            _hashCode += get_lastChangdate().hashCode();
        }
        if (get_shortname() != null) {
            _hashCode += get_shortname().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JobTitleBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "JobTitleBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_departmentid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_departmentid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_fullname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_fullname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_jobcompetency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_jobcompetency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_jobdoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_jobdoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_jobresponsibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_jobresponsibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_jobtitleid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_jobtitleid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_jobtitleremark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_jobtitleremark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_lastChangdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_lastChangdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_shortname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_shortname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
