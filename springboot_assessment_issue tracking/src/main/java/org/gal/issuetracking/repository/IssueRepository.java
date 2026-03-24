package org.gal.issuetracking.repository;

import org.gal.issuetracking.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IssueRepository extends JpaRepository<Issue, Long> {


    List<Issue> findByEmployeeIdAndResolvedFalse(Long employeeId);


    @Query("SELECT i FROM Issue i WHERE MONTH(i.createdDate)=MONTH(CURRENT_DATE) AND YEAR(i.createdDate)=YEAR(CURRENT_DATE)")
    List<Issue> findIssuesThisMonth();


    @Query("SELECT DISTINCT i.employee.name FROM Issue i WHERE MONTH(i.createdDate)=MONTH(CURRENT_DATE) AND YEAR(i.createdDate)=YEAR(CURRENT_DATE)")
    List<String> findEmployeeNamesThisMonth();
}