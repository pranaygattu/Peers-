package com.cyberworld.peers.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "followers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Followers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "followerID", nullable = false)
    private Users follower;

    @ManyToOne
    @JoinColumn(name = "followingID", nullable = false)
    private Users following;

    @Column(nullable = false, updatable = false)
    private Instant createdAt = Instant.now();
}
