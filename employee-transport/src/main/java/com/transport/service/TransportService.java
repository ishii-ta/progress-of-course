package com.transport.service;

import com.transport.dao.CabAllocationRepository;
import com.transport.dao.CabRepository;
import com.transport.dao.EmployeeRepository;
import com.transport.dto.TransportDto;
import com.transport.model.Cab;
import com.transport.model.CabAllocation;
import com.transport.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TransportService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private CabRepository cabRepository;
    
    @Autowired
    private CabAllocationRepository cabAllocationRepository;

    public TransportDto getTransportDetailsForEmployee(Long empId) {
        Optional<Employee> employeeOpt = employeeRepository.findById(empId);
        if (employeeOpt.isEmpty()) {
            return null;
        }

        Employee employee = employeeOpt.get();
        Cab cab = cabRepository.findByAssignedToEmpId(empId);

        TransportDto dto = new TransportDto();
        dto.setEmpId(employee.getEmpId());
        dto.setEmpName(employee.getName());
        dto.setHomeAddress(employee.getHomeAddress());

        if (cab != null) {
            dto.setCabId(cab.getCabId());
            dto.setVehicleNumber(cab.getVehicleNumber());
            dto.setDriverName(cab.getDriverName());
        }

        return dto;
    }

    public List<Cab> getAvailableCabs(LocalDate date) {
        return cabRepository.findAvailableCabsByDate(date);
    }

    public CabAllocation allocateCab(Long empId, Long cabId, LocalDate date) {
        Optional<Employee> employeeOpt = employeeRepository.findById(empId);
        Optional<Cab> cabOpt = cabRepository.findById(cabId);

        if (employeeOpt.isEmpty() || cabOpt.isEmpty()) {
            throw new IllegalArgumentException("Invalid Employee ID or Cab ID");
        }

        // Optional: Check if the cab is already allocated on this date
        // Since we only list available cabs, the frontend shouldn't send an already allocated cab,
        // but adding a safety check here would be good practice.
        
        CabAllocation allocation = new CabAllocation(cabOpt.get(), employeeOpt.get(), date);
        return cabAllocationRepository.save(allocation);
    }
}
