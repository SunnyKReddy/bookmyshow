package com.mskprojects.bookmyshow.repositories;

import com.mskprojects.bookmyshow.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShowRepository extends JpaRepository<Show, Long> {
    @Override
    Optional<Show> findById(Long showId);
    @Override
    Show save(Show show);
}
