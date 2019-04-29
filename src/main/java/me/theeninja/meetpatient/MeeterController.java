package me.theeninja.meetpatient;

import lombok.AccessLevel;
import lombok.Getter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MeeterController {
    @Getter(AccessLevel.PRIVATE)
    private final AtomicLong mostRecentMeeterID = new AtomicLong(-1);

    @RequestMapping("/meeter")
    public Meeter newMeeter(final @RequestParam(value = "name") String name) {
        final long newMeeterID = getMostRecentMeeterID().incrementAndGet();

        return new Meeter(newMeeterID, name);
    }
}
