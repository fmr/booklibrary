package com.myob.learning.booklibrary

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController(private val bookService: BookService) {
  @GetMapping("/")
  fun getBooks() = bookService.getAll()
}
