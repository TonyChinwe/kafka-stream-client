package com.phi.soft.kafkastreamclientone.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DomainCrawlerController {
@Autowired
private DomainCrawlerService crawlerService;

    @GetMapping("/look-up/{name}")
    public String lookup(@PathVariable("name") final String name){
       crawlerService.crawl(name);
       return "Domain crawler finished";

    }
}
