package com.qianfeng.pojo;

public class CrmCourseType {
    private String coursetypeid;

    private Double coursecost;

    private Integer total;

    private String coursename;

    private String remark;

    public String getCoursetypeid() {
        return coursetypeid;
    }

    public void setCoursetypeid(String coursetypeid) {
        this.coursetypeid = coursetypeid == null ? null : coursetypeid.trim();
    }

    public Double getCoursecost() {
        return coursecost;
    }

    public void setCoursecost(Double coursecost) {
        this.coursecost = coursecost;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}