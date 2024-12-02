# Biblioteca 

## Java Beans

- Book:
  - Campos:
    - isbn: String
    - Titulo: String
    - Año: int
    - autores: Autor[]
  - Métodos:
    - hasAuthor(nif): Dado un nif devuelve si el libro tiene ese autor 
- Autor:
  - Campos:
    - nif
    - Nombre
    - Apellidos
- Biblioteca:
  - Campos:
    - Nombre
    - Libros: Libro[]
  - Métodos
    - hasBook(isbn): dado un isbn devuelve si el libro existe en la biblioteca
    - hasAuthor(authorNif): dado un nif devuelve si hay algún libro de ese autor
    - countBooks(authroNif):  dado un nif devuelve el número de libros del autor
    - countYearBooks(year): dado un año, devuelve el número de libros de ese año.
    - findBook(isbn): dado un isbn, devuelve el libro con ese isbn. Si no lo encuentra, devuelve null

## Componentes

- AuthorReader
- BookReader
- LibraryReader

## Ejemplo de datos

{
  name: "Mi biblio",
  books:[
    {
      isbn: "0002432424234234", 
      title: "Libro 1", 
      year: 2020, 
      authors:[ 
        {nif: "0000X",name:"Bob", surname:"Esponja"}
      ]
    },
    {
      isbn: "345345345",
      title: "Libro 2",
      year: 2023,
      authors:[
        {nif: "0000X",name:"Bob", surname:"Esponja"},
        {nif: "0001X",name:"Peppa", surname:"Pig"}
      ]
    }
  ]
}