package org.gal.issuetracking.repository;

import org.gal.issuetracking.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface IssueRepository extends JpaRepository<Issue, Long> {

    List<Issue> findByEmployeeIdAndResolvedFalse(Long empId);

    List<Issue> findByCreatedDateBetween(LocalDate start, LocalDate end);

}
