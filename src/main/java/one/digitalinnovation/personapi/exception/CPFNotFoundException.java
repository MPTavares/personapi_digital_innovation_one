package one.digitalinnovation.personapi.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CPFNotFoundException extends Exception {
    public CPFNotFoundException(String phone) {
        super(String.format("Person with phone %s not found!", phone));
    }
}
