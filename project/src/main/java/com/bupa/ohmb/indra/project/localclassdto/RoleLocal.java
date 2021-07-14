package com.bupa.ohmb.indra.project.localclassdto;

public class RoleLocal {
	
	private String roleId;
	private String description;

	public RoleLocal(String roleId, String description) {
		super();
		this.roleId = roleId;
		this.description = description;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
