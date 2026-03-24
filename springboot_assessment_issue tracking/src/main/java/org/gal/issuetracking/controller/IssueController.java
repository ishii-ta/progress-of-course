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

    private static final Logger logger =
            LoggerFactory.getLogger(IssueController.class);

    private final IssueService issueService;

    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }

    @GetMapping("/employee/{id}/unresolved")
    public List<Issue> getUnresolvedIssues(@PathVariable Long id) {

        logger.info("Fetching unresolved issues for employee {}", id);

        return issueService.getUnresolvedIssues(id);
    }

    @GetMapping("/month")
    public List<Issue> getIssuesThisMonth() {

        logger.info("Fetching issues raised this month");

        return issueService.getIssuesThisMonth();
    }

}