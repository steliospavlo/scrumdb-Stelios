package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable{

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String username;
//    @OneToMany(targetEntity = Question.class)
//    private List<Question> userQuestions;

    public User() {
    }

    public User(String username) {
        this.username = username;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public List<Question> getUserQuestions() {
//        return userQuestions;
//    }
//
//    public void setUserQuestions(List<Question> userQuestions) {
//        this.userQuestions = userQuestions;
//    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + '}';
    }

}
