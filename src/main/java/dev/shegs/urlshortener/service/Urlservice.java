package dev.shegs.urlshortener.service;

import dev.shegs.urlshortener.model.Url;
import dev.shegs.urlshortener.model.UrlDto;
import org.springframework.stereotype.Service;

@Service
public interface Urlservice {

    public Url generateShortLink(UrlDto urlDto);
    public Url persistShortLink(Url url);
    public Url getEncodedUrl(String url);
    public void deleteShortLink(Url url);

}
