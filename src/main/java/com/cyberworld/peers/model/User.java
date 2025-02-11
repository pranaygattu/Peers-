// package com.cyberworld.peers.model;

// import jakarta.persistence.*;
// import lombok.*;

// import java.time.Instant;

// @Entity
// @Table(name = "users")
// @Getter
// @Setter
// @NoArgsConstructor
// @AllArgsConstructor
// @Builder
// public class User {

// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// private Long userId;

// @Column(nullable = false, unique = true, length = 50)
// private String username;

// @Column(nullable = false, unique = true, length = 100)
// private String email;

// @Column(nullable = false)
// private String passwordHash;

// private String fullName;
// private String profilePicture;

// @Column(columnDefinition = "TEXT")
// private String bio;

// @Column(nullable = false, updatable = false)
// private Instant createdAt = Instant.now();
// }
