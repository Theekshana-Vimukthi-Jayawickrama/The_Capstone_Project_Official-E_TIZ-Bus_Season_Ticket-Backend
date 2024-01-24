package com.bus_season_ticket.capstone_project.User;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class UserPhotos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userPhotoName;

    private String PhotoType;

    //columnDefinition = "LONGBLOB"
    @Lob
    @Column(name = "Data", columnDefinition = "LONGBLOB" )
    private byte[] data;

    @OneToOne(mappedBy = "userPhoto")
    private User user;
}

