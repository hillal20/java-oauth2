package com.lambdaschool.oauth2.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "useremails", uniqueConstraints = {@UniqueConstraint(columnNames = {"userid", "useremail"})}) // we are saying the user and the email are unique means
        // only one person and one email in this table
public class Useremail extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long useremailid;

    @Column(nullable = false)
    @Email
    private String useremail; // email of the user

    @ManyToOne
    @JoinColumn(name = "userid", //  id referring to a user has this  email. and the user has an array of the emails
                nullable = false)
    @JsonIgnoreProperties("useremails")// referring to be a part of the emails list in the user
    private User user;

    public Useremail() {
    }

    public Useremail(User user, String useremail) {
        this.useremail = useremail;
        this.user = user;
    }

    public long getUseremailid()
    {
        return useremailid;
    }

    public void setUseremailid(long useremailid)
    {
        this.useremailid = useremailid;
    }

    public String getUseremail() {
        if (useremail == null) // this is possible when updating a user
             {
            return null;
        } else {
            return useremail.toLowerCase();
        }
    }

    public void setUseremail(String useremail)
    {
        this.useremail = useremail.toLowerCase();
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Useremail{" + "useremailid=" + useremailid + ", useremail='" + useremail + '\'' + ", user=" + user.getUsername() + '}';
    }
}
