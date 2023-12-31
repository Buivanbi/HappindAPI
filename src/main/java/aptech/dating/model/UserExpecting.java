package aptech.dating.model;
// Generated Oct 30, 2023, 4:19:04 PM by Hibernate Tools 4.3.6.Final

import static jakarta.persistence.GenerationType.IDENTITY;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * UserExpecting generated by hbm2java
 */
@Entity
@Table(name = "user_expecting")
public class UserExpecting implements java.io.Serializable {

	private Integer id;
	private Expecting expecting;
	private User user;
	private boolean choose;

	public UserExpecting() {
	}

	public UserExpecting(Expecting expecting, User user, boolean choose) {
		this.expecting = expecting;
		this.user = user;
		this.choose = choose;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	 @JsonIgnore @JoinColumn(name = "expecting_id", nullable = false)
	public Expecting getExpecting() {
		return this.expecting;
	}

	public void setExpecting(Expecting expecting) {
		this.expecting = expecting;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	 @JsonIgnore @JoinColumn(name = "user_id", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Column(name="choose")
	public boolean isChoose() {
		return choose;
	}

	public void setChoose(boolean choose) {
		this.choose = choose;
	}

}
