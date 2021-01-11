package makeup.example.demo.Models.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ExceptionProductNotFound  extends RuntimeException{
    public ExceptionProductNotFound(Long id) {
        super(String.format("Product with %d was not found!", id));
    }

}