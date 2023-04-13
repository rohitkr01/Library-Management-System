package com.codingbz.Library.Management.System.Service;

import com.codingbz.Library.Management.System.Entity.Author;
import com.codingbz.Library.Management.System.Entity.Book;
import com.codingbz.Library.Management.System.Repository.AuthorRepository;
import com.codingbz.Library.Management.System.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    AuthorRepository authorRepository;

    public void addBook(Book book) throws Exception {
        Author author;
        try{
            author = authorRepository.findById(book.getAuthor().getId()).get();
        }
        catch(Exception e){
            throw new Exception("Author Id not present,so Book not added");
        }
        List<Book> booksWritten = author.getBooks();
        booksWritten.add(book);

        authorRepository.save(author);
    }
}
