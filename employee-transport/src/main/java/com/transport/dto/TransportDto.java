package com.transport.dto;

public class TransportDto {

    private Long empId;
    private String empName;
    private String homeAddress;
    private Long cabId;
    private String vehicleNumber;
    private String driverName;

    public TransportDto() {}

    public Long getEmpId() { return empId; }
    public void setEmpId(Long empId) { this.empId = empId; }
    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }
    public String getHomeAddress() { return homeAddress; }
    public void setHomeAddress(String homeAddress) { this.homeAddress = homeAddress; }
    public Long getCabId() { return cabId; }
    public void setCabId(Long cabId) { this.cabId = cabId; }
    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }
    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) { this.driverName = driverName; }
}
