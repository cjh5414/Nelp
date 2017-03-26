package us.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="account_number")
    private String account_number;
    @Column(name="password")
    private String password;
    @OneToMany(mappedBy = "user_id")
    private List<Participation> participationList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public List<Participation> getParticipationList() {
        return participationList;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addParticipantion(Participation participation){ this.participationList.add(participation); }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public void participateMeeting(Meeting meeting) {

    }

    //public void leaveMeeting(Participation participation {
    //participationList.remove(participation);
    //}
}
