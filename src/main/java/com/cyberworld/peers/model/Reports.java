package com.cyberworld.peers.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "reports")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportId;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private Users user;

    @ManyToOne
    @JoinColumn(name = "reportedUserID")
    private Users reportedUser;

    @ManyToOne
    @JoinColumn(name = "reportedPostID")
    private Posts reportedPost;

    @ManyToOne
    @JoinColumn(name = "reportedCommentID")
    private Comments reportedComment;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String reason;

    @Column(nullable = false, updatable = false)
    private Instant createdAt = Instant.now();
}
