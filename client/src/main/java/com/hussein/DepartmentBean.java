/**
 * DepartmentBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hussein;

public class DepartmentBean  implements java.io.Serializable {
    private String _canceled;

    private String _code;

    private String _departmentid;

    private String _fullname;

    private String _shortname;

    private String _showorder;

    private String _subcompanyid;

    private String _supdepartmentid;

    private String action;

    private String lastChangdate;

    public DepartmentBean() {
    }

    public DepartmentBean(
           String _canceled,
           String _code,
           String _departmentid,
           String _fullname,
           String _shortname,
           String _showorder,
           String _subcompanyid,
           String _supdepartmentid,
           String action,
           String lastChangdate) {
           this._canceled = _canceled;
           this._code = _code;
           this._departmentid = _departmentid;
           this._fullname = _fullname;
           this._shortname = _shortname;
           this._showorder = _showorder;
           this._subcompanyid = _subcompanyid;
           this._supdepartmentid = _supdepartmentid;
           this.action = action;
           this.lastChangdate = lastChangdate;
    }


    /**
     * Gets the _canceled value for this DepartmentBean.
     * 
     * @return _canceled
     */
    public String get_canceled() {
        return _canceled;
    }


    /**
     * Sets the _canceled value for this DepartmentBean.
     * 
     * @param _canceled
     */
    public void set_canceled(String _canceled) {
        this._canceled = _canceled;
    }


    /**
     * Gets the _code value for this DepartmentBean.
     * 
     * @return _code
     */
    public String get_code() {
        return _code;
    }


    /**
     * Sets the _code value for this DepartmentBean.
     * 
     * @param _code
     */
    public void set_code(String _code) {
        this._code = _code;
    }


    /**
     * Gets the _departmentid value for this DepartmentBean.
     * 
     * @return _departmentid
     */
    public String get_departmentid() {
        return _departmentid;
    }


    /**
     * Sets the _departmentid value for this DepartmentBean.
     * 
     * @param _departmentid
     */
    public void set_departmentid(String _departmentid) {
        this._departmentid = _departmentid;
    }


    /**
     * Gets the _fullname value for this DepartmentBean.
     * 
     * @return _fullname
     */
    public String get_fullname() {
        return _fullname;
    }


    /**
     * Sets the _fullname value for this DepartmentBean.
     * 
     * @param _fullname
     */
    public void set_fullname(String _fullname) {
        this._fullname = _fullname;
    }


    /**
     * Gets the _shortname value for this DepartmentBean.
     * 
     * @return _shortname
     */
    public String get_shortname() {
        return _shortname;
    }


    /**
     * Sets the _shortname value for this DepartmentBean.
     * 
     * @param _shortname
     */
    public void set_shortname(String _shortname) {
        this._shortname = _shortname;
    }


    /**
     * Gets the _showorder value for this DepartmentBean.
     * 
     * @return _showorder
     */
    public String get_showorder() {
        return _showorder;
    }


    /**
     * Sets the _showorder value for this DepartmentBean.
     * 
     * @param _showorder
     */
    public void set_showorder(String _showorder) {
        this._showorder = _showorder;
    }


    /**
     * Gets the _subcompanyid value for this DepartmentBean.
     * 
     * @return _subcompanyid
     */
    public String get_subcompanyid() {
        return _subcompanyid;
    }


    /**
     * Sets the _subcompanyid value for this DepartmentBean.
     * 
     * @param _subcompanyid
     */
    public void set_subcompanyid(String _subcompanyid) {
        this._subcompanyid = _subcompanyid;
    }


    /**
     * Gets the _supdepartmentid value for this DepartmentBean.
     * 
     * @return _supdepartmentid
     */
    public String get_supdepartmentid() {
        return _supdepartmentid;
    }


    /**
     * Sets the _supdepartmentid value for this DepartmentBean.
     * 
     * @param _supdepartmentid
     */
    public void set_supdepartmentid(String _supdepartmentid) {
        this._supdepartmentid = _supdepartmentid;
    }


    /**
     * Gets the action value for this DepartmentBean.
     * 
     * @return action
     */
    public String getAction() {
        return action;
    }


    /**
     * Sets the action value for this DepartmentBean.
     * 
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }


    /**
     * Gets the lastChangdate value for this DepartmentBean.
     * 
     * @return lastChangdate
     */
    public String getLastChangdate() {
        return lastChangdate;
    }


    /**
     * Sets the lastChangdate value for this DepartmentBean.
     * 
     * @param lastChangdate
     */
    public void setLastChangdate(String lastChangdate) {
        this.lastChangdate = lastChangdate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DepartmentBean)) return false;
        DepartmentBean other = (DepartmentBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._canceled==null && other.get_canceled()==null) || 
             (this._canceled!=null &&
              this._canceled.equals(other.get_canceled()))) &&
            ((this._code==null && other.get_code()==null) || 
             (this._code!=null &&
              this._code.equals(other.get_code()))) &&
            ((this._departmentid==null && other.get_departmentid()==null) || 
             (this._departmentid!=null &&
              this._departmentid.equals(other.get_departmentid()))) &&
            ((this._fullname==null && other.get_fullname()==null) || 
             (this._fullname!=null &&
              this._fullname.equals(other.get_fullname()))) &&
            ((this._shortname==null && other.get_shortname()==null) || 
             (this._shortname!=null &&
              this._shortname.equals(other.get_shortname()))) &&
            ((this._showorder==null && other.get_showorder()==null) || 
             (this._showorder!=null &&
              this._showorder.equals(other.get_showorder()))) &&
            ((this._subcompanyid==null && other.get_subcompanyid()==null) || 
             (this._subcompanyid!=null &&
              this._subcompanyid.equals(other.get_subcompanyid()))) &&
            ((this._supdepartmentid==null && other.get_supdepartmentid()==null) || 
             (this._supdepartmentid!=null &&
              this._supdepartmentid.equals(other.get_supdepartmentid()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.lastChangdate==null && other.getLastChangdate()==null) || 
             (this.lastChangdate!=null &&
              this.lastChangdate.equals(other.getLastChangdate())));
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
        if (get_canceled() != null) {
            _hashCode += get_canceled().hashCode();
        }
        if (get_code() != null) {
            _hashCode += get_code().hashCode();
        }
        if (get_departmentid() != null) {
            _hashCode += get_departmentid().hashCode();
        }
        if (get_fullname() != null) {
            _hashCode += get_fullname().hashCode();
        }
        if (get_shortname() != null) {
            _hashCode += get_shortname().hashCode();
        }
        if (get_showorder() != null) {
            _hashCode += get_showorder().hashCode();
        }
        if (get_subcompanyid() != null) {
            _hashCode += get_subcompanyid().hashCode();
        }
        if (get_supdepartmentid() != null) {
            _hashCode += get_supdepartmentid().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getLastChangdate() != null) {
            _hashCode += getLastChangdate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepartmentBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "DepartmentBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_canceled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_canceled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("_shortname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_shortname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_showorder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_showorder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_subcompanyid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_subcompanyid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_supdepartmentid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_supdepartmentid"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastChangdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "lastChangdate"));
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
