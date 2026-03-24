package org.gal.issuetracking.service;

import org.gal.issuetracking.model.Issue;
import org.gal.issuetracking.repository.IssueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueService {

    private final IssueRepository issueRepository;

    public IssueService(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }


    public List<Issue> getUnresolvedIssues(Long employeeId) {
        return issueRepository.findByEmployeeIdAndResolvedFalse(employeeId);
    }


    public List<Issue> getIssuesThisMonth() {
        return issueRepository.findIssuesThisMonth();
    }

    public List<String> getEmployeesThisMonth() {
        return issueRepository.findEmployeeNamesThisMonth();
    }
}