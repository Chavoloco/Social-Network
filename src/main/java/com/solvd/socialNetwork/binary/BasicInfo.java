package com.solvd.socialNetwork.binary;

public class BasicInfo {
    private long id;
    private long locationId;
    private long schoolId;
    private long jobsId;

    public BasicInfo() {
    }

    public BasicInfo(long id, long locationId, long schoolId, long jobsId) {
        this.id = id;
        this.locationId = locationId;
        this.schoolId = schoolId;
        this.jobsId = jobsId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long countriesId) {
        this.locationId = countriesId;
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
