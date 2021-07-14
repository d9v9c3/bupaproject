package com.bupa.ohmb.indra.project.localclassdto;

public class UsersLocal {
	private String id;
	private long policyId;
	private long memberId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String dob;
	private boolean shareInfo;

	public UsersLocal() {
		super();
	}

	public UsersLocal(String id, long policyId, long memberId, String firstName, String middleName, String lastName,
			String dob, boolean shareInfo) {
		super();
		this.id = id;
		this.policyId = policyId;
		this.memberId = memberId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.shareInfo = shareInfo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(long policyId) {
		this.policyId = policyId;
	}

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public boolean getShareInfo() {
		return shareInfo;
	}

	public void setShareInfo(boolean shareInfo) {
		this.shareInfo = shareInfo;
	}

}
