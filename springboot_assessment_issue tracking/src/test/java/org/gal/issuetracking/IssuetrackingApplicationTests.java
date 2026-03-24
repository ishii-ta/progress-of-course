package org.gal.issuetracking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IssuetrackingApplicationTests {

    @Test
    void testGetUnresolvedIssues() {
        System.out.println("Test for unresolved issues API");
    }

    @Test
    void testGetIssuesThisMonth() {
        System.out.println("Test for issues raised this month API");
    }

    @Test
    void testGetEmployeesThisMonth() {
        System.out.println("Test for employees who raised issues this month");
    }
}