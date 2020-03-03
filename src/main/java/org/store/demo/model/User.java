package org.store.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@ApiModel
@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty
    private Long idUser;

    @NotNull
    @Column(unique = true)
    @ApiModelProperty
    private String userName;

    @Email
    @NotNull
    @Column(unique = true)
    @ApiModelProperty
    private String userEmail;

    @ApiModelProperty
    private String userPassword;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "idUserProfile" , referencedColumnName = "idUser")
//    private UserProfile userProfile;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "user")
    @ApiModelProperty
    private UserProfile userProfile;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "user")
    @ApiModelProperty
    private Orders Order;

    // Hibernate requires a no-arg constructor
    public User() {

    }

    public User(String userName,  String userEmail, String userPassword) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }
}
