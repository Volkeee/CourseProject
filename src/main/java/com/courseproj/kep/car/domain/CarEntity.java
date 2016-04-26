package com.courseproj.kep.car.domain;

import com.courseproj.kep.entity.BaseEntity;

import javax.persistence.*;

/**
 * Created by volke on 17.04.2016.
 */
@Entity
@Table(name = "car", schema = "freight_transportation", catalog = "")
@IdClass(CarEntityPK.class)
public class CarEntity extends BaseEntity {
    private int idcar;
    private String type;
    private String brand;
    private String model;
    private String payload;
    private int wheelbaseBridges;
    private String licensePlateNumber;
    private String carYear;
    private int companieId;

    @Id
    @Column(name = "idcar")
    public int getIdcar() {
        return idcar;
    }

    public void setIdcar(int idcar) {
        this.idcar = idcar;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "brand")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "payload")
    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    @Basic
    @Column(name = "wheelbaseBridges")
    public int getWheelbaseBridges() {
        return wheelbaseBridges;
    }

    public void setWheelbaseBridges(int wheelbaseBridges) {
        this.wheelbaseBridges = wheelbaseBridges;
    }

    @Basic
    @Column(name = "licensePlateNumber")
    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    @Basic
    @Column(name = "carYear")
    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    @Id
    @Column(name = "companieID")
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

        CarEntity carEntity = (CarEntity) o;

        if (idcar != carEntity.idcar) return false;
        if (wheelbaseBridges != carEntity.wheelbaseBridges) return false;
        if (companieId != carEntity.companieId) return false;
        if (type != null ? !type.equals(carEntity.type) : carEntity.type != null) return false;
        if (brand != null ? !brand.equals(carEntity.brand) : carEntity.brand != null) return false;
        if (model != null ? !model.equals(carEntity.model) : carEntity.model != null) return false;
        if (payload != null ? !payload.equals(carEntity.payload) : carEntity.payload != null) return false;
        if (licensePlateNumber != null ? !licensePlateNumber.equals(carEntity.licensePlateNumber) : carEntity.licensePlateNumber != null)
            return false;
        if (carYear != null ? !carYear.equals(carEntity.carYear) : carEntity.carYear != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idcar;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (payload != null ? payload.hashCode() : 0);
        result = 31 * result + wheelbaseBridges;
        result = 31 * result + (licensePlateNumber != null ? licensePlateNumber.hashCode() : 0);
        result = 31 * result + (carYear != null ? carYear.hashCode() : 0);
        result = 31 * result + companieId;
        return result;
    }
}
