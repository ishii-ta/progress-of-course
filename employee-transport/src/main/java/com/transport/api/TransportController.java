package com.transport.api;

import com.transport.dto.TransportDto;
import com.transport.model.Cab;
import com.transport.model.CabAllocation;
import com.transport.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/transport")
public class TransportController {

    @Autowired
    private TransportService transportService;

    @GetMapping("/cab-details/{empId}")
    public ResponseEntity<TransportDto> getCabDetailsForEmployee(@PathVariable Long empId) {
        TransportDto dto = transportService.getTransportDetailsForEmployee(empId);
        if (dto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/available-cabs")
    public ResponseEntity<List<Cab>> getAvailableCabs(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return ResponseEntity.ok(transportService.getAvailableCabs(date));
    }

    @PostMapping("/allocate")
    public ResponseEntity<CabAllocation> allocateCab(
            @RequestParam Long empId, 
            @RequestParam Long cabId, 
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        try {
            CabAllocation allocation = transportService.allocateCab(empId, cabId, date);
            return ResponseEntity.ok(allocation);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
