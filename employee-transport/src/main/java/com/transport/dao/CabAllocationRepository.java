package com.transport.dao;

import com.transport.model.CabAllocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CabAllocationRepository extends JpaRepository<CabAllocation, Long> {
    List<CabAllocation> findByAllocationDate(LocalDate allocationDate);
    List<CabAllocation> findByEmployee_EmpId(Long empId);
}
