package aptech.dating.model;
// Generated Oct 30, 2023, 4:19:04 PM by Hibernate Tools 4.3.6.Final

import static jakarta.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Hobby generated by hbm2java
 */
@Entity
@Table(name = "hobby")
public class Hobby implements java.io.Serializable {

	private Integer id;
	private String name;
	private Set<UserHobby> userHobbies = new HashSet<UserHobby>(0);

	public Hobby() {
	}

	public Hobby(String name) {
		this.name = name;
	}

	public Hobby(String name, Set<UserHobby> userHobbies) {
		this.name = name;
		this.userHobbies = userHobbies;
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

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hobby")
	public Set<UserHobby> getUserHobbies() {
		return this.userHobbies;
	}

	public void setUserHobbies(Set<UserHobby> userHobbies) {
		this.userHobbies = userHobbies;
	}

}
