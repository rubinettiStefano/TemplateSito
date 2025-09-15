package com.generation.templatesito.model.converters;

import com.generation.templatesito.model.dtos.BookDTO;
import com.generation.templatesito.model.entities.Book;

public interface DtoConverter
{
    Book convertToBook(BookDTO dto);
}
