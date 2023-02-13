package com.zerobase.morse.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class ParticipantList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int applyNo;
    private int studyNo;
    private String email;
    private String applyStatus;
    private LocalDateTime applyDt;

    @ManyToOne
    private Member member;

    @ManyToOne
    private ChatRoom chatRoom;
}