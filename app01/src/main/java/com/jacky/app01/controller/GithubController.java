package com.jacky.app01.controller;

import com.jacky.app01.client.GithubClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjiaqi
 * @create 2020-02-23
 */
@RestController
public class GithubController {
    @Autowired
    private GithubClient githubClient;

    @GetMapping("/search/github")
    public String searchGithubRepoByStr(@RequestParam("str") String queryStr) {
        return githubClient.searchRepo(queryStr);
    }
}
