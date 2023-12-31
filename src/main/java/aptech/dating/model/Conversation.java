package aptech.dating.model;
// Generated Oct 30, 2023, 4:19:04 PM by Hibernate Tools 4.3.6.Final

import static jakarta.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * Conversation generated by hbm2java
 */
@Entity
@Table(name = "conversation")
public class Conversation implements java.io.Serializable {

	private Integer id;
	private String type;
	private Date createdAt;
	private Set<Message> messages = new HashSet<Message>(0);
	private Set<VideoCall> videoCalls = new HashSet<VideoCall>(0);
	private Set<UserConversation> userConversations = new HashSet<UserConversation>(0);

	public Conversation() {
	}

	public Conversation(String type, Date createdAt) {
		this.type = type;
		this.createdAt = createdAt;
	}

	public Conversation(String type, Date createdAt, Set<Message> messages, Set<VideoCall> videoCalls,
			Set<UserConversation> userConversations) {
		this.type = type;
		this.createdAt = createdAt;
		this.messages = messages;
		this.videoCalls = videoCalls;
		this.userConversations = userConversations;
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

	@Column(name = "type", nullable = false)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, length = 23)
	public Date getCreateAt() {
		return this.createdAt;
	}

	public void setCreateAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "conversation")
	public Set<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "conversation")
	public Set<VideoCall> getVideoCalls() {
		return this.videoCalls;
	}

	public void setVideoCalls(Set<VideoCall> videoCalls) {
		this.videoCalls = videoCalls;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "conversation")
	public Set<UserConversation> getUserConversations() {
		return this.userConversations;
	}

	public void setUserConversations(Set<UserConversation> userConversations) {
		this.userConversations = userConversations;
	}

}
