package com.project.lunchBooking.model

import javax.persistence.*

@Entity
data class User(
    // IDENTITY: generated by DB (increasing)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    @Column
    var name: String,

    @Column
    var price: Float
)
