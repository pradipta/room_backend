package com.pradipta.room.room.entity;

import com.pradipta.room.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Room {
    @Id
    private int id;
    private String roomName;
    private String roomDescription;
    @OneToMany(targetEntity = User.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "room_user_fk", referencedColumnName = "username")
    private List<User> users;
    private Boolean isActive = true;
}
