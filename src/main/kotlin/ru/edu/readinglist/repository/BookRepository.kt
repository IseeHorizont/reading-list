package ru.edu.readinglist.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.edu.readinglist.entity.Book
import java.util.UUID

@Repository
interface BookRepository : JpaRepository<Book, UUID> {
}