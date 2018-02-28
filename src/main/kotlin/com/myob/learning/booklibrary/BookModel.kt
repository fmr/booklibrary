package com.myob.learning.booklibrary


data class BookModel(val ISBN: String, val title: String, val author: String, val coverURL: String? = null)
