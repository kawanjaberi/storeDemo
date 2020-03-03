package org.store.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "userProfile")
public class UserProfile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUserProfile;

    @NotNull
    @Size(max = 70)
    private String userFirstName;

    @NotNull
    @Size(max = 70)
    private String userLastName;

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private Gender usergender;

    @Temporal(TemporalType.DATE)
    @Column(name = "dob")
    private Date userDateOfBirth;

    private String userIdNumber;

    @Pattern(regexp = "(^$|[0-9]{10})")
    private Long userPhone;

    @Size(max = 100)
    private String userAddress1;

    @Size(max = 100)
    private String userAddress2;

    private String userPostalCode1;
    private String userPostalCode2;

    @Size(max = 100)
    private String userCity;

    @Size(max = 100)
    private String userState;

    @Size(max = 100)
    private String userCountry;

    @Lob
    private byte[] userPicture;

    private Long userBankNumber;

//    @OneToOne(mappedBy = "idUserProfile")
//    private User user;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idUser", nullable = false)
    private User user;

    public UserProfile() {

    }

    public UserProfile(String userFirstName, String userLastName, Gender usergender,
                       Date userDateOfBirth, String userIdNumber, Long userPhone,
                       String userAddress1, String userAddress2,
                       String userPostalCode1, String userPostalCode2,
                       String userCity, String userState, String userCountry,
                       byte[] userPicture, Long userBankNumber) {

        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.usergender = usergender;
        this.userDateOfBirth = userDateOfBirth;
        this.userIdNumber = userIdNumber;
        this.userPhone = userPhone;
        this.userAddress1 = userAddress1;
        this.userAddress2 = userAddress2;
        this.userPostalCode1 = userPostalCode1;
        this.userPostalCode2 = userPostalCode2;
        this.userCity = userCity;
        this.userState = userState;
        this.userCountry = userCountry;
        this.userPicture = userPicture;
        this.userBankNumber = userBankNumber;
    }

    public Long getIdUserProfile() {
        return idUserProfile;
    }

    public void setIdUserProfile(Long idUserProfile) {
        this.idUserProfile = idUserProfile;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public Gender getUsergender() {
        return usergender;
    }

    public void setUsergender(Gender usergender) {
        this.usergender = usergender;
    }

    public Date getUserDateOfBirth() {
        return userDateOfBirth;
    }

    public void setUserDateOfBirth(Date userDateOfBirth) {
        this.userDateOfBirth = userDateOfBirth;
    }

    public String getUserIdNumber() {
        return userIdNumber;
    }

    public void setUserIdNumber(String userIdNumber) {
        this.userIdNumber = userIdNumber;
    }

    public Long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress1() {
        return userAddress1;
    }

    public void setUserAddress1(String userAddress1) {
        this.userAddress1 = userAddress1;
    }

    public String getUserAddress2() {
        return userAddress2;
    }

    public void setUserAddress2(String userAddress2) {
        this.userAddress2 = userAddress2;
    }

    public String getUserPostalCode1() {
        return userPostalCode1;
    }

    public void setUserPostalCode1(String userPostalCode1) {
        this.userPostalCode1 = userPostalCode1;
    }

    public String getUserPostalCode2() {
        return userPostalCode2;
    }

    public void setUserPostalCode2(String userPostalCode2) {
        this.userPostalCode2 = userPostalCode2;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public byte[] getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(byte[] userPicture) {
        this.userPicture = userPicture;
    }

    public Long getUserBankNumber() {
        return userBankNumber;
    }

    public void setUserBankNumber(Long userBankNumber) {
        this.userBankNumber = userBankNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
