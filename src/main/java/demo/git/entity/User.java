package demo.git.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
	
	private long id;
	private String login;
	private String name;
	private String type;
	
	@JsonProperty ("avatar_url")
	private String avatarUrl;   
	
	@JsonProperty ("created_at")
	private String createdAt;
	
	

	public User() {
	}

	public long getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", name=" + name + ", type=" + type + ", avatarUrl=" + avatarUrl
				+ ", createdAt=" + createdAt + "]";
	}

	
	
}
