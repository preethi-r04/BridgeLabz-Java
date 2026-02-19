package ioprogramming.reflectionannotation.reflection.intermediate.author;

public class AnnotationReader {
    public static void main(String[] args) {
        Class<Book> clazz = Book.class;

        Author author = clazz.getAnnotation(Author.class);
        System.out.println(author.name());
    }
}

