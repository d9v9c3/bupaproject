
package com.bupa.ohmb.indra.project.dtosend;

public class Login {

	private String email;

	private String pass;

	private Integer deviceId;

	private String deviceIp;

	public Login() {
	}

	/**
	 * 
	 * @param deviceIp
	 * @param pass
	 * @param deviceId
	 * @param email
	 */
	public Login(String email, String pass, Integer deviceId, String deviceIp) {
		super();
		this.email = email;
		this.pass = pass;
		this.deviceId = deviceId;
		this.deviceIp = deviceIp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Integer getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceIp() {
		return deviceIp;
	}

	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}

}
