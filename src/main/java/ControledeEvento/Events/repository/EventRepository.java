package ControledeEvento.Events.repository;

import ControledeEvento.Events.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findbyCategory(String category);
    List<Event> findByLocation(String location);
}
