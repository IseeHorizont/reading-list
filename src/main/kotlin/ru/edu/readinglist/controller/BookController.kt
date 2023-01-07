package ru.edu.readinglist.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.edu.readinglist.entity.Book
import ru.edu.readinglist.service.impl.BookServiceImpl

@RestController
@RequestMapping("/books")
class BookController(
    private val bookServiceImpl: BookServiceImpl
) {

    @GetMapping("/")
    fun getAllBooks() : List<Book> {
        return bookServiceImpl.getAllBooks()
    }
}