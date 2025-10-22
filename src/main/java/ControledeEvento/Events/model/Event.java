package ControledeEvento.Events.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String title;
    private String description;
    private String category;
    private LocalDateTime eventDate;
    private String location;
    private double rating;

    @ManyToMany(mappedBy = "interestedEvents")
    private Set<User> interestedUsers = new HashSet<>();
}
