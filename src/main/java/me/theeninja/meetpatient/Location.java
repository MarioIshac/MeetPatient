package me.theeninja.meetpatient;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Location {
    private final double x;
    private final double y;
}
