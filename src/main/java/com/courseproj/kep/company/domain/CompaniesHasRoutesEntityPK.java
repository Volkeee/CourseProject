package com.courseproj.kep.company.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by volke on 17.04.2016.
 */
public class CompaniesHasRoutesEntityPK implements Serializable {
    private int companiesIdcompanies;
    private int routesIdroutes;

    @Column(name = "companies_idcompanies")
    @Id
    public int getCompaniesIdcompanies() {
        return companiesIdcompanies;
    }

    public void setCompaniesIdcompanies(int companiesIdcompanies) {
        this.companiesIdcompanies = companiesIdcompanies;
    }

    @Column(name = "routes_idroutes")
    @Id
    public int getRoutesIdroutes() {
        return routesIdroutes;
    }

    public void setRoutesIdroutes(int routesIdroutes) {
        this.routesIdroutes = routesIdroutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompaniesHasRoutesEntityPK that = (CompaniesHasRoutesEntityPK) o;

        if (companiesIdcompanies != that.companiesIdcompanies) return false;
        if (routesIdroutes != that.routesIdroutes) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = companiesIdcompanies;
        result = 31 * result + routesIdroutes;
        return result;
    }
}
