package com.codingbz.Library.Management.System.Service;

import com.codingbz.Library.Management.System.Entity.Author;
import com.codingbz.Library.Management.System.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;
    public void addAuthor(Author author){
        authorRepository.save(author);
    }
}
