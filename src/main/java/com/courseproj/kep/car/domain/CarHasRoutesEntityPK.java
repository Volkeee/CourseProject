package com.courseproj.kep.car.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by volke on 17.04.2016.
 */
public class CarHasRoutesEntityPK implements Serializable {
    private int carIdcar;
    private int routesIdroutes;

    @Column(name = "car_idcar")
    @Id
    public int getCarIdcar() {
        return carIdcar;
    }

    public void setCarIdcar(int carIdcar) {
        this.carIdcar = carIdcar;
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

        CarHasRoutesEntityPK that = (CarHasRoutesEntityPK) o;

        if (carIdcar != that.carIdcar) return false;
        if (routesIdroutes != that.routesIdroutes) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carIdcar;
        result = 31 * result + routesIdroutes;
        return result;
    }
}
