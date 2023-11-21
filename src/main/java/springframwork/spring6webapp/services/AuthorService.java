package springframwork.spring6webapp.services;

import springframwork.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();

}
