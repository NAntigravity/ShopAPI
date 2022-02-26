package testtask.shift.shopapi.service;

import com.sun.istack.NotNull;
import org.springframework.validation.annotation.Validated;
import testtask.shift.shopapi.model.Monitor;

@Validated
public interface MonitorService {
    @NotNull
    Iterable<Monitor> getAllMonitors();

    Monitor getMonitor(long id);

    Monitor save(Monitor monitor);
}
