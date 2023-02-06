package com.codilla.collections.adv.maps.homework;

public class Principal {

    private String directorsName;
    private String schoolName;

    public Principal(String directorsName, String schoolName) {
        this.directorsName = directorsName;
        this.schoolName = schoolName;
    }

    public String getDirectorsName() {
        return directorsName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return "directorsName= " + directorsName + '\'' +
                ", schoolName= " + schoolName + '\'';
    }
}
