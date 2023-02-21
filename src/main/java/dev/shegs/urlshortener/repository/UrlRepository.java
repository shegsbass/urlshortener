package dev.shegs.urlshortener.repository;

import dev.shegs.urlshortener.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<Url, Long> {
    public Url findByShortLink(String shortLink);
}
