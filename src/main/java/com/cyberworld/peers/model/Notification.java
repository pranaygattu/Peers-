package com.cyberworld.peers.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "notifications")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationId;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private Users user;

    @Column(nullable = false)
    private String type; // like, comment, follow, message

    @Column(nullable = false)
    private Long sourceId; // Can be postId, commentId, or userId

    private Boolean isRead = false;

    @Column(nullable = false, updatable = false)
    private Instant createdAt = Instant.now();
}
