package springframwork.spring6webapp.services;

import springframwork.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
