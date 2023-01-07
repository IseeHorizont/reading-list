package ru.edu.readinglist.entity

import jakarta.persistence.*
import ru.edu.readinglist.data.ReadingStatus
import java.util.UUID

@Entity
@Table(name = "book")
class Book(

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id : UUID,

    @Column(name = "owner_id")
    val ownerId : String,

    @Column(name = "title")
    val title : String,

    @Column(name = "author")
    val author : String,

    @Column(name = "status")
    var status : ReadingStatus = ReadingStatus.READING,

    @Column(name = "date_of_read")
    val dateOfRead : String
)
