package ru.edu.readinglist.service.impl

import org.springframework.stereotype.Service
import ru.edu.readinglist.entity.Book
import ru.edu.readinglist.repository.BookRepository
import ru.edu.readinglist.service.BookService
import java.util.*

@Service
class BookServiceImpl(
    private val bookRepository: BookRepository
) : BookService {
    override fun getAllBooks(): List<Book> {
        return bookRepository.findAll()
    }
}