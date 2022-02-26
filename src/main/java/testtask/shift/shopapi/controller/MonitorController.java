package testtask.shift.shopapi.controller;

import com.sun.istack.NotNull;
import org.springframework.web.bind.annotation.*;
import testtask.shift.shopapi.model.Monitor;
import testtask.shift.shopapi.service.MonitorService;

@RestController
@RequestMapping("/api/monitors")
public class MonitorController {
    private final MonitorService monitorService;

    public MonitorController(MonitorService monitorService) {
        this.monitorService = monitorService;
    }

    @GetMapping(value = {"", "/"}, produces = "application/json")
    public @NotNull
    Iterable<Monitor> getMonitors() {
        return monitorService.getAllMonitors();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Monitor getMonitor(@PathVariable long id) {
        return monitorService.getMonitor(id);
    }

    @PostMapping(value = "/add", produces = "application/json")
    public Monitor createNewMonitor(@RequestBody Monitor newMonitor) {
        return monitorService.save(newMonitor);
    }

    @PutMapping(value = "/{id}", produces = "application/json")
    public Monitor editMonitor(@PathVariable long id,
                                                 @RequestBody @org.jetbrains.annotations.NotNull Monitor newMonitor){
        monitorService.getMonitor(id);
        newMonitor.setId(id);
        return monitorService.save(newMonitor);
    }
}
