package com.cyberworld.peers.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "saved_posts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SavedPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private Users user;

    @ManyToOne
    @JoinColumn(name = "postID", nullable = false)
    private Posts post;

    @Column(nullable = false, updatable = false)
    private Instant savedAt = Instant.now();
}
