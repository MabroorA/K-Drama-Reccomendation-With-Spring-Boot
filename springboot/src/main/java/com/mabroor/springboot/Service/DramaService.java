package com.mabroor.springboot.Service;

import com.mabroor.springboot.domain.Actor;
import com.mabroor.springboot.domain.Drama;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DramaService {

    private final WebClient webClient;

    public DramaService(WebClient.Builder builder ) {
        webClient = builder.baseUrl("https://api.tvmaze.com").build();
    }

    public Flux<Drama> GetShows(){
        return this.webClient
                .get()
                .uri("/shows")
                .retrieve()
                .bodyToFlux(Drama.class);
    }

    public Flux<Drama> GetShowsByRelevancey(@RequestParam String name){
        return this.webClient
                .get()
                .uri("/search/shows?q={name}", name)
                .retrieve()
                .bodyToFlux(Drama.class);
    }
    public Mono<Drama> GetShowByName(@RequestParam String name){
        return this.webClient
                .get()
                .uri("/singlesearch/shows?q={name}",name)
                .retrieve()
                .bodyToMono(Drama.class);
    }

    public Mono<Drama> GetShowByID(@RequestParam String id){
        return this.webClient
                .get()
                .uri("/lookup/shows?tvrage={id}",id)
                .retrieve()
                .bodyToMono(Drama.class);
    }


    public Flux<Actor> GetActorByName(@RequestParam String name) {
        return this.webClient
                .get()
                .uri("/search/people?q={name}",name)
                .retrieve()
                .bodyToFlux(Actor.class);

    }
}
