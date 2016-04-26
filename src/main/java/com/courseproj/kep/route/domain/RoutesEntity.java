package com.courseproj.kep.route.domain;

import com.courseproj.kep.entity.BaseEntity;

import javax.persistence.*;

/**
 * Created by volke on 17.04.2016.
 */
@Entity
@Table(name = "routes", schema = "freight_transportation", catalog = "")
public class RoutesEntity extends BaseEntity {
    private int idroutes;
    private String directionofTransportation;
    private String startPoint;
    private String endPoint;
    private String distance;
    private String transportationTime;
    private String endPointPickUp;

    @Id
    @Column(name = "idroutes")
    public int getIdroutes() {
        return idroutes;
    }

    public void setIdroutes(int idroutes) {
        this.idroutes = idroutes;
    }

    @Basic
    @Column(name = "directionofTransportation")
    public String getDirectionofTransportation() {
        return directionofTransportation;
    }

    public void setDirectionofTransportation(String directionofTransportation) {
        this.directionofTransportation = directionofTransportation;
    }

    @Basic
    @Column(name = "startPoint")
    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    @Basic
    @Column(name = "endPoint")
    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    @Basic
    @Column(name = "distance")
    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Basic
    @Column(name = "transportationTime")
    public String getTransportationTime() {
        return transportationTime;
    }

    public void setTransportationTime(String transportationTime) {
        this.transportationTime = transportationTime;
    }

    @Basic
    @Column(name = "endPointPickUp")
    public String getEndPointPickUp() {
        return endPointPickUp;
    }

    public void setEndPointPickUp(String endPointPickUp) {
        this.endPointPickUp = endPointPickUp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoutesEntity that = (RoutesEntity) o;

        if (idroutes != that.idroutes) return false;
        if (directionofTransportation != null ? !directionofTransportation.equals(that.directionofTransportation) : that.directionofTransportation != null)
            return false;
        if (startPoint != null ? !startPoint.equals(that.startPoint) : that.startPoint != null) return false;
        if (endPoint != null ? !endPoint.equals(that.endPoint) : that.endPoint != null) return false;
        if (distance != null ? !distance.equals(that.distance) : that.distance != null) return false;
        if (transportationTime != null ? !transportationTime.equals(that.transportationTime) : that.transportationTime != null)
            return false;
        if (endPointPickUp != null ? !endPointPickUp.equals(that.endPointPickUp) : that.endPointPickUp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idroutes;
        result = 31 * result + (directionofTransportation != null ? directionofTransportation.hashCode() : 0);
        result = 31 * result + (startPoint != null ? startPoint.hashCode() : 0);
        result = 31 * result + (endPoint != null ? endPoint.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        result = 31 * result + (transportationTime != null ? transportationTime.hashCode() : 0);
        result = 31 * result + (endPointPickUp != null ? endPointPickUp.hashCode() : 0);
        return result;
    }
}
