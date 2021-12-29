package com.solvd.socialNetwork.binary;

public class BasicInfo {
    private long id;
    private long countriesId;
    private long schoolId;
    private long jobsId;

    public BasicInfo() {
    }

    public BasicInfo(long id, long countriesId, long schoolId, long jobsId) {
        this.id = id;
        this.countriesId = countriesId;
        this.schoolId = schoolId;
        this.jobsId = jobsId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCountriesId() {
        return countriesId;
    }

    public void setCountriesId(long countriesId) {
        this.countriesId = countriesId;
    }

    public long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(long schoolId) {
        this.schoolId = schoolId;
    }

    public long getJobsId() {
        return jobsId;
    }

    public void setJobsId(long jobsId) {
        this.jobsId = jobsId;
    }
}
