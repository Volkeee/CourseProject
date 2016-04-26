package com.courseproj.kep.car.domain;

import javax.persistence.*;

/**
 * Created by volke on 17.04.2016.
 */
@Entity
@Table(name = "car_has_routes", schema = "freight_transportation")
@IdClass(CarHasRoutesEntityPK.class)
public class CarHasRoutesEntity {
    private int carIdcar;
    private int routesIdroutes;

    @Id
    @Column(name = "car_idcar")
    public int getCarIdcar() {
        return carIdcar;
    }

    public void setCarIdcar(int carIdcar) {
        this.carIdcar = carIdcar;
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

        CarHasRoutesEntity that = (CarHasRoutesEntity) o;

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
