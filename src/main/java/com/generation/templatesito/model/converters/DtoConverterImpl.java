package com.generation.templatesito.model.converters;

import com.generation.templatesito.model.dtos.BookDTO;
import com.generation.templatesito.model.entities.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class DtoConverterImpl implements DtoConverter
{

    @Override
    public Book convertToBook(BookDTO dto)
    {
        Book res = new Book();
        res.setAuthor(dto.getAutore());
        res.setTitle(dto.getTitolo());
        res.setYear(dto.getAnno());

        return res;
    }
}
