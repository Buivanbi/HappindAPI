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
 * Expecting generated by hbm2java
 */
@Entity
@Table(name = "expecting")
public class Expecting implements java.io.Serializable {

	private Integer id;
	private String name;
	private Set<UserExpecting> userExpectings = new HashSet<UserExpecting>(0);

	public Expecting() {
	}

	public Expecting(String name) {
		this.name = name;
	}

	public Expecting(String name, Set<UserExpecting> userExpectings) {
		this.name = name;
		this.userExpectings = userExpectings;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "expecting")
	public Set<UserExpecting> getUserExpectings() {
		return this.userExpectings;
	}

	public void setUserExpectings(Set<UserExpecting> userExpectings) {
		this.userExpectings = userExpectings;
	}

}
