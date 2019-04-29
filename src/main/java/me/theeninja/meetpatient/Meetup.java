package me.theeninja.meetpatient;

import lombok.Data;
import lombok.NonNull;

import java.util.Set;

@Data
public class Meetup {
    private Meeter initiator;

    @NonNull
    private final Set<Meeter> attendees;

    @NonNull
    private final Set<Meeter> invitees;

    private Location location;

    public void setLocation(final Location location) {
        if (!this.location.equals(location)) {
            getInvitees().addAll(getAttendees());
            getAttendees().clear();
        }
    }
}
