package com.jacky.app01.client;

import com.jacky.app01.config.GithubClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chenjiaqi
 * @create 2020-02-23
 */
@FeignClient(name = "github-client", url = "https://api.github.com", configuration = GithubClientConfig.class)
public interface GithubClient {
    @RequestMapping(value = "/search/repositories", method = RequestMethod.GET)
    String searchRepo(@RequestParam("q") String queryStr);
}
