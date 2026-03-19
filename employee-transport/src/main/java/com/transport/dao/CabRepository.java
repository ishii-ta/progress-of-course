package com.transport.dao;

import com.transport.model.Cab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CabRepository extends JpaRepository<Cab, Long> {
    Cab findByAssignedToEmpId(Long empId);

    @Query("SELECT c FROM Cab c WHERE c.cabId NOT IN (SELECT ca.cab.cabId FROM CabAllocation ca WHERE ca.allocationDate = :date)")
    List<Cab> findAvailableCabsByDate(@Param("date") LocalDate date);
}
