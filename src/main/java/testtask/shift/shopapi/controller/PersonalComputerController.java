package testtask.shift.shopapi.controller;

import com.sun.istack.NotNull;
import org.springframework.web.bind.annotation.*;
import testtask.shift.shopapi.model.PersonalComputer;
import testtask.shift.shopapi.service.PersonalComputerService;

@RestController
@RequestMapping("/api/pcs")
public class PersonalComputerController {
    private final PersonalComputerService personalComputerService;

    public PersonalComputerController(PersonalComputerService personalComputerService) {
        this.personalComputerService = personalComputerService;
    }

    @GetMapping(value = {"", "/"}, produces = "application/json")
    public @NotNull
    Iterable<PersonalComputer> getPersonalComputers() {
        return personalComputerService.getAllPersonalComputers();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public PersonalComputer getPersonalComputer(@PathVariable long id) {
        return personalComputerService.getPersonalComputer(id);
    }

    @PostMapping(value = "/add", produces = "application/json")
    public PersonalComputer createNewPersonalComputer(@RequestBody PersonalComputer newPersonalComputer) {
        return personalComputerService.save(newPersonalComputer);
    }

    @PutMapping(value = "/{id}", produces = "application/json")
    public PersonalComputer editPersonalComputer(@PathVariable long id,
                                                 @RequestBody @org.jetbrains.annotations.NotNull PersonalComputer newPersonalComputer){
        personalComputerService.getPersonalComputer(id);
        newPersonalComputer.setId(id);
        return personalComputerService.save(newPersonalComputer);
    }
}
