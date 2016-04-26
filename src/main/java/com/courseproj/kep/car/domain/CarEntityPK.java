package com.courseproj.kep.car.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by volke on 17.04.2016.
 */
public class CarEntityPK implements Serializable {
    private int idcar;
    private int companieId;

    @Column(name = "idcar")
    @Id
    public int getIdcar() {
        return idcar;
    }

    public void setIdcar(int idcar) {
        this.idcar = idcar;
    }

    @Column(name = "companieID")
    @Id
    public int getCompanieId() {
        return companieId;
    }

    public void setCompanieId(int companieId) {
        this.companieId = companieId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarEntityPK that = (CarEntityPK) o;

        if (idcar != that.idcar) return false;
        if (companieId != that.companieId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idcar;
        result = 31 * result + companieId;
        return result;
    }
}
