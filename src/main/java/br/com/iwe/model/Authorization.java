package br.com.iwe.model;

public class Authorization {

	private String clientId;
	private String userPoolId;
	private String username;
	private String password;

	public Authorization() {
		super();
	}

	public Authorization(String clientId, String userPoolId, String username, String password) {
		super();
		this.clientId = clientId;
		this.userPoolId = userPoolId;
		this.username = username;
		this.password = password;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getUserPoolId() {
		return userPoolId;
	}

	public void setUserPoolId(String userPoolId) {
		this.userPoolId = userPoolId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}