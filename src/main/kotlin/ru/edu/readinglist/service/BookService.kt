package ru.edu.readinglist.service

import ru.edu.readinglist.entity.Book

interface BookService {

    fun getAllBooks() : List<Book>

}