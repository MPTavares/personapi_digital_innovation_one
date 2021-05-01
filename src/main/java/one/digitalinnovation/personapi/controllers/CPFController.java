package one.digitalinnovation.personapi.controllers;

import lombok.AllArgsConstructor;
import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.exception.PersonNotFoundException;
import one.digitalinnovation.personapi.exception.PhoneNotFoundException;
import one.digitalinnovation.personapi.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/phone")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CPFController {
    private final PersonService personService;

    @GetMapping("/{phone}")
    @ResponseStatus(HttpStatus.OK)
    public List<PersonDTO> findByPhone(@PathVariable String phone) throws PhoneNotFoundException {
        return personService.findByPhone(phone);
    }
}
