package controllers;
import models.Book;
import java.util.Set;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.books.*;

public class BooksController extends Controller{

    // For all books to user
    public Result index(){
        Set<Book> books = Book.allBooks();
        return ok(index.render(books));
    }

    // To create a book
    public Result create(){
        return TODO;
    }

    // To save a book
    public Result save(){
        return TODO;
    }

    // To edit a book
    public Result edit(Integer id){
        return TODO;
    }

    // To update a book
    public Result update(){
        return TODO;
    }

    // To delete a book
    public Result destroy(Integer id){
        return TODO;
    }

    // For book details
    public Result show(Integer id){
        return TODO;
    }
}
