package com.courseproj.kep.company.domain;

import javax.persistence.*;

/**
 * Created by volke on 17.04.2016.
 */
@Entity
@Table(name = "companies_has_routes", schema = "freight_transportation", catalog = "")
@IdClass(CompaniesHasRoutesEntityPK.class)
public class CompaniesHasRoutesEntity {
    private int companiesIdcompanies;
    private int routesIdroutes;

    @Id
    @Column(name = "companies_idcompanies")
    public int getCompaniesIdcompanies() {
        return companiesIdcompanies;
    }

    public void setCompaniesIdcompanies(int companiesIdcompanies) {
        this.companiesIdcompanies = companiesIdcompanies;
    }

    @Id
    @Column(name = "routes_idroutes")
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

        CompaniesHasRoutesEntity that = (CompaniesHasRoutesEntity) o;

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
