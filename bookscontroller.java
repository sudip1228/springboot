package springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookscontroller {

	
	@GetMapping("/books")//'get' is used to retrieve data.
	public List<Book> getallbooks(){
		return Arrays.asList(new Book(11,"science","sudip"));
	}
	
	
	
}
