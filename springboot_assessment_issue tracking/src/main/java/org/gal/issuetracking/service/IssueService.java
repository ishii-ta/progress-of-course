package org.gal.issuetracking.service;

import org.gal.issuetracking.model.Issue;
import org.gal.issuetracking.repository.IssueRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class IssueService {

    private final IssueRepository issueRepository;

    public IssueService(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    public List<Issue> getUnresolvedIssues(Long empId) {
        return issueRepository.findByEmployeeIdAndResolvedFalse(empId);
    }

    public List<Issue> getIssuesThisMonth() {

        LocalDate start = LocalDate.now().withDayOfMonth(1);
        LocalDate end = LocalDate.now();

        return issueRepository.findByCreatedDateBetween(start,end);
    }

}