package com.myob.learning.booklibrary

import org.springframework.stereotype.Repository
import javax.annotation.PostConstruct

@Repository
class BookRepository {
  private val books = mutableListOf<BookModel>()
  fun findAll() = books

  @PostConstruct
  private fun init() {

    // Fill our "database"
    books.add(BookModel(
        "0765326353",
        "The Way of Kings",
        "Brandon Sanderson",
        coverURL = "https://d.gr-assets.com/books/1448127430l/7235533.jpg"))

    books.add(BookModel(
        "0345391802",
        "The Hitchhiker's Guide to the Galaxy",
        "Douglas Adams",
        coverURL = "https://d.gr-assets.com/books/1327656754l/11.jpg"))

    books.add(BookModel(
        "076531178X",
        "Mistborn: The Final Empire",
        "Brandon Sanderson",
        coverURL = "https://d.gr-assets.com/books/1437254833l/68428.jpg"))
  }
}
