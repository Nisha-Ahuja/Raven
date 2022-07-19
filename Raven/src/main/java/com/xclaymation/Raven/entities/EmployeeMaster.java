package com.xclaymation.Raven.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeMaster {
	
	@Id
	public int Empid;
	public String Emp_Name ;
	public int RoleId ;
	public String RoleName ;
	public int AvatarID ;
	public  int Avatarcostumeid ;
	public String EmailID ;
	public String IsManager ;
	public String WorkersManager ;
	// Hire_Date date,
	public int CompanyId ;
	public int Program_Count ;
	
	public EmployeeMaster(int empid, String emp_Name, int roleId, String roleName, int avatarID, int avatarcostumeid,
			String emailID, String isManager, String workersManager, int companyId, int program_Count,
			int completed_Count, int pending_Count) {
		super();
		Empid = empid;
		Emp_Name = emp_Name;
		RoleId = roleId;
		RoleName = roleName;
		AvatarID = avatarID;
		Avatarcostumeid = avatarcostumeid;
		EmailID = emailID;
		IsManager = isManager;
		WorkersManager = workersManager;
		CompanyId = companyId;
		Program_Count = program_Count;
		Completed_Count = completed_Count;
		Pending_Count = pending_Count;
	}
	public int Completed_Count;
	public int Pending_Count;
	
	
	public EmployeeMaster()
	{
		
	}

	
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmp_Name() {
		return Emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}
	public int getRoleId() {
		return RoleId;
	}
	public void setRoleId(int roleId) {
		RoleId = roleId;
	}
	public String getRoleName() {
		return RoleName;
	}
	public void setRoleName(String roleName) {
		RoleName = roleName;
	}
	public int getAvatarID() {
		return AvatarID;
	}
	public void setAvatarID(int avatarID) {
		AvatarID = avatarID;
	}
	public int getAvatarcostumeid() {
		return Avatarcostumeid;
	}
	public void setAvatarcostumeid(int avatarcostumeid) {
		Avatarcostumeid = avatarcostumeid;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getIsManager() {
		return IsManager;
	}
	public void setIsManager(String isManager) {
		IsManager = isManager;
	}
	public String getWorkersManager() {
		return WorkersManager;
	}
	public void setWorkersManager(String workersManager) {
		WorkersManager = workersManager;
	}
	public int getCompanyId() {
		return CompanyId;
	}
	public void setCompanyId(int companyId) {
		CompanyId = companyId;
	}
	public int getProgram_Count() {
		return Program_Count;
	}
	public void setProgram_Count(int program_Count) {
		Program_Count = program_Count;
	}
	public int getCompleted_Count() {
		return Completed_Count;
	}
	public void setCompleted_Count(int completed_Count) {
		Completed_Count = completed_Count;
	}
	public int getPending_Count() {
		return Pending_Count;
	}
	public void setPending_Count(int pending_Count) {
		Pending_Count = pending_Count;
	}
	

}
