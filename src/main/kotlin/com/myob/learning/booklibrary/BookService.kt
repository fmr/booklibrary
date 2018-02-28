package com.myob.learning.booklibrary

import org.springframework.stereotype.Service

@Service
class BookService(private val bookRepository: BookRepository) {
  fun getAll(): List<BookModel> = bookRepository.findAll()
}
