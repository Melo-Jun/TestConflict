package com.melo.SSM.generator.domain;

import java.io.Serializable;

/**
 * 
 * @TableName tbl_emp
 */
public class TblEmp implements Serializable {
    /**
     * 
     */
    private Integer emp_id;

    /**
     * 
     */
    private String emp_name;

    /**
     * 
     */
    private String gender;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private Integer d_id;

    private static final long serialVersionUID = 1L;

    public TblEmp() {
    }

    public TblEmp(String emp_name, String gender) {
        this.emp_name = emp_name;
        this.gender = gender;
    }

    /**
     * 
     */
    public Integer getEmp_id() {
        return emp_id;
    }

    /**
     * 
     */
    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    /**
     * 
     */
    public String getEmp_name() {
        return emp_name;
    }

    /**
     * 
     */
    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    /**
     * 
     */
    public String getGender() {
        return gender;
    }

    /**
     * 
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     */
    public Integer getD_id() {
        return d_id;
    }

    /**
     * 
     */
    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TblEmp other = (TblEmp) that;
        return (this.getEmp_id() == null ? other.getEmp_id() == null : this.getEmp_id().equals(other.getEmp_id()))
            && (this.getEmp_name() == null ? other.getEmp_name() == null : this.getEmp_name().equals(other.getEmp_name()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getD_id() == null ? other.getD_id() == null : this.getD_id().equals(other.getD_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmp_id() == null) ? 0 : getEmp_id().hashCode());
        result = prime * result + ((getEmp_name() == null) ? 0 : getEmp_name().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getD_id() == null) ? 0 : getD_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", emp_id=").append(emp_id);
        sb.append(", emp_name=").append(emp_name);
        sb.append(", gender=").append(gender);
        sb.append(", email=").append(email);
        sb.append(", d_id=").append(d_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}