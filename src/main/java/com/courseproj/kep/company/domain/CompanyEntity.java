package com.courseproj.kep.company.domain;

import javax.persistence.*;

/**
 * Created by volke on 17.04.2016.
 */
@Entity
@Table(name = "companies", schema = "freight_transportation")
public class CompanyEntity {
    private int idcompanies;
    private String name;
    private String town;
    private String address;
    private String phoneNumber;
    private String schedule;
    private String manager;
    private int carsQuantity;
    private String webSite;
    private byte foreign;

    @Id
    @Column(name = "idcompanies")
    public int getIdcompanies() {
        return idcompanies;
    }

    public void setIdcompanies(int idcompanies) {
        this.idcompanies = idcompanies;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "town")
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "schedule")
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Basic
    @Column(name = "manager")
    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Basic
    @Column(name = "carsQuantity")
    public int getCarsQuantity() {
        return carsQuantity;
    }

    public void setCarsQuantity(int carsQuantity) {
        this.carsQuantity = carsQuantity;
    }

    @Basic
    @Column(name = "WEB-site")
    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    @Basic
    @Column(name = "foreign")
    public byte getForeign() {
        return foreign;
    }

    public void setForeign(byte foreign) {
        this.foreign = foreign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompanyEntity that = (CompanyEntity) o;

        if (idcompanies != that.idcompanies) return false;
        if (carsQuantity != that.carsQuantity) return false;
        if (foreign != that.foreign) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (town != null ? !town.equals(that.town) : that.town != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (schedule != null ? !schedule.equals(that.schedule) : that.schedule != null) return false;
        if (manager != null ? !manager.equals(that.manager) : that.manager != null) return false;
        if (webSite != null ? !webSite.equals(that.webSite) : that.webSite != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idcompanies;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (town != null ? town.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (schedule != null ? schedule.hashCode() : 0);
        result = 31 * result + (manager != null ? manager.hashCode() : 0);
        result = 31 * result + carsQuantity;
        result = 31 * result + (webSite != null ? webSite.hashCode() : 0);
        result = 31 * result + (int) foreign;
        return result;
    }
}
