package com.transport.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "cab_allocation")
public class CabAllocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long allocationId;

    @ManyToOne
    @JoinColumn(name = "cab_id")
    private Cab cab;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

    private LocalDate allocationDate;

    public CabAllocation() {}

    public CabAllocation(Cab cab, Employee employee, LocalDate allocationDate) {
        this.cab = cab;
        this.employee = employee;
        this.allocationDate = allocationDate;
    }

    public Long getAllocationId() { return allocationId; }
    public void setAllocationId(Long allocationId) { this.allocationId = allocationId; }

    public Cab getCab() { return cab; }
    public void setCab(Cab cab) { this.cab = cab; }

    public Employee getEmployee() { return employee; }
    public void setEmployee(Employee employee) { this.employee = employee; }

    public LocalDate getAllocationDate() { return allocationDate; }
    public void setAllocationDate(LocalDate allocationDate) { this.allocationDate = allocationDate; }
}
