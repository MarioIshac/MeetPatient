package me.theeninja.meetpatient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Meeter {
    @Id
    @GeneratedValue
    private final long id;

    @NonNull
    private final String name;

    @NonNull
    private final Set<Meeter> friends = new HashSet<>();
    
    private Location targetLocation;
}
