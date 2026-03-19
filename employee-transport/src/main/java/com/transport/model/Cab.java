package com.transport.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cab")
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cabId;

    private String driverName;
    private String vehicleNumber;
    private Long assignedToEmpId;

    public Cab() {}

    public Cab(String driverName, String vehicleNumber, Long assignedToEmpId) {
        this.driverName = driverName;
        this.vehicleNumber = vehicleNumber;
        this.assignedToEmpId = assignedToEmpId;
    }

    public Long getCabId() { return cabId; }
    public void setCabId(Long cabId) { this.cabId = cabId; }
    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) { this.driverName = driverName; }
    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }
    public Long getAssignedToEmpId() { return assignedToEmpId; }
    public void setAssignedToEmpId(Long assignedToEmpId) { this.assignedToEmpId = assignedToEmpId; }
}
