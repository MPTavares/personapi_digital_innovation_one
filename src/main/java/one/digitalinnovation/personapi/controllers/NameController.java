package one.digitalinnovation.personapi.controllers;

import lombok.AllArgsConstructor;
import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.exception.CPFNotFoundException;
import one.digitalinnovation.personapi.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cpf")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CPFController {
    private final PersonService personService;

    @GetMapping("/{cpf}")
    @ResponseStatus(HttpStatus.OK)
    public List<PersonDTO> findByPhone(@PathVariable String cpf) throws CPFNotFoundException {
        return personService.findByCPF(cpf);
    }
}
