package com.phi.soft.kafkastreamclientone.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class DomainCrawlerService {
    @Autowired
    private KafkaTemplate<String,Domain>kafkaTemplate;
    private final String TOPIC="web-domains";
    public void crawl(String name){
   Mono<DomainList>domainListMono= WebClient.create()
                .get()
                .uri("https://api.domainsdb.info/v1/domains/search?domain="+name+"&zone=com")
                .retrieve()
                .bodyToMono(DomainList.class);

   domainListMono.subscribe(domainList -> {
       domainList.domainList
               .forEach(domain -> {
                   kafkaTemplate.send(TOPIC,domain);
                   System.out.println("Domain message "+domain.getDomain());

               });
   });
    }


}

