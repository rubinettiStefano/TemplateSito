package com.generation.templatesito.model.repositories;

import com.generation.templatesito.model.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book,Long>
{
}
