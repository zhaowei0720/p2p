package com.qianfeng.pojo;

import java.util.Date;

public class CrmClass {
    private String classid;

    private String coursetypeid;

    private String name;

    private Date begintime;

    private Date endtime;

    private String status;

    private Integer totalcount;

    private Integer upgradecount;

    private Integer changecount;

    private Integer runoffcount;

    private String remark;

    private Date uploadtime;

    private String uploadpath;

    private String uploadfilename;

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }

    public String getCoursetypeid() {
        return coursetypeid;
    }

    public void setCoursetypeid(String coursetypeid) {
        this.coursetypeid = coursetypeid == null ? null : coursetypeid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(Integer totalcount) {
        this.totalcount = totalcount;
    }

    public Integer getUpgradecount() {
        return upgradecount;
    }

    public void setUpgradecount(Integer upgradecount) {
        this.upgradecount = upgradecount;
    }

    public Integer getChangecount() {
        return changecount;
    }

    public void setChangecount(Integer changecount) {
        this.changecount = changecount;
    }

    public Integer getRunoffcount() {
        return runoffcount;
    }

    public void setRunoffcount(Integer runoffcount) {
        this.runoffcount = runoffcount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public String getUploadpath() {
        return uploadpath;
    }

    public void setUploadpath(String uploadpath) {
        this.uploadpath = uploadpath == null ? null : uploadpath.trim();
    }

    public String getUploadfilename() {
        return uploadfilename;
    }

    public void setUploadfilename(String uploadfilename) {
        this.uploadfilename = uploadfilename == null ? null : uploadfilename.trim();
    }
}