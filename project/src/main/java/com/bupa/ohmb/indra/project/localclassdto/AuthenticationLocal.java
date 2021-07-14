package com.bupa.ohmb.indra.project.localclassdto;

public class AuthenticationLocal {
	private String accessToken;

	private Integer expiresIn;

	private Integer refreshExpiresIn;

	private String refreshToken;

	private String tokenType;

	public AuthenticationLocal() {
	}

	public AuthenticationLocal(String accessToken, Integer expiresIn, Integer refreshExpiresIn, String refreshToken,
			String tokenType) {
		super();
		this.accessToken = accessToken;
		this.expiresIn = expiresIn;
		this.refreshExpiresIn = refreshExpiresIn;
		this.refreshToken = refreshToken;
		this.tokenType = tokenType;

	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Integer getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
	}

	public Integer getRefreshExpiresIn() {
		return refreshExpiresIn;
	}

	public void setRefreshExpiresIn(Integer refreshExpiresIn) {
		this.refreshExpiresIn = refreshExpiresIn;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	
	public String toString() {
		return "AuthenticationLocal [accessToken=" + accessToken + ", expiresIn=" + expiresIn + ", refreshExpiresIn="
				+ refreshExpiresIn + ", refreshToken=" + refreshToken + ", tokenType=" + tokenType + "]";
	}
	

}
