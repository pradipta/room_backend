package com.pradipta.room.user.entity;

import com.pradipta.room.post.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Id
    private String username;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String phone;
    private String firstName;
    private String lastName;
    @OneToMany(targetEntity = Post.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_post_fk", referencedColumnName = "username")
    private List<Post> posts;
    @OneToMany(targetEntity = User.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_following_fk", referencedColumnName = "username")
    private List<User> following;
}
