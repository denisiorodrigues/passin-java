package com.dentech.passin.domain.event;

import jakarta.persistence.*;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    privite String id;

    Private String title;
}
