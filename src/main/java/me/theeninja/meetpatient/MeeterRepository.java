package me.theeninja.meetpatient;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface MeeterRepository extends PagingAndSortingRepository<Meeter, Long> {
    Set<Meeter> findByName(final @Param("name") String name);
}
