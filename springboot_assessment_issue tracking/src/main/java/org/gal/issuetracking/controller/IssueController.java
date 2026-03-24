package org.gal.issuetracking.controller;

import org.gal.issuetracking.model.Issue;
import org.gal.issuetracking.service.IssueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/issues")
public class IssueController {

    private static final Logger logger = LoggerFactory.getLogger(IssueController.class);

    private final IssueService issueService;

    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }

    @GetMapping("/unresolved/{employeeId}")
    public List<Issue> getUnresolvedIssues(@PathVariable Long employeeId) {

        logger.info("Fetching unresolved issues for employee ID: {}", employeeId);

        return issueService.getUnresolvedIssues(employeeId);
    }


    @GetMapping("/this-month")
    public List<Issue> getIssuesThisMonth() {

        logger.info("Fetching all issues raised this month");

        return issueService.getIssuesThisMonth();
    }

    @GetMapping("/employees-this-month")
    public List<String> getEmployeesWhoRaisedIssuesThisMonth() {

        logger.info("Fetching employee names who raised issues this month");

        return issueService.getEmployeesThisMonth();
    }
}