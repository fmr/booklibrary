# booklibrary

A RESTful API for showcasing learnings in Kotlin


## Usage

```bash
./gradlew bootRun
```

Then, open `http://localhost:8080` in your browser.

You should see the following results:

```json
[
  {
    "title": "The Way of Kings",
    "author": "Brandon Sanderson",
    "coverURL": "https://d.gr-assets.com/books/1448127430l/7235533.jpg",
    "isbn": "0765326353"
  },
  {
    "title": "The Hitchhiker's Guide to the Galaxy",
    "author": "Douglas Adams",
    "coverURL": "https://d.gr-assets.com/books/1327656754l/11.jpg",
    "isbn": "0345391802"
  },
  {
    "title": "Mistborn: The Final Empire",
    "author": "Brandon Sanderson",
    "coverURL": "https://d.gr-assets.com/books/1437254833l/68428.jpg",
    "isbn": "076531178X"
  }
]
```

## References

* [Writing a RESTful backend using Kotlin and Spring Boot](https://medium.com/@dime.kotevski/writing-a-restful-backend-using-kotlin-and-spring-boot-9f162c96e428)
* [Creating a RESTful Web Service with Spring Boot - Kotlin Programming Language](https://kotlinlang.org/docs/tutorials/spring-boot-restful.html)
