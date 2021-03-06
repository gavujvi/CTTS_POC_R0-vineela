package gov.wisconsin.admin.data.pojo;

import java.sql.Date;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Embedded;

import gov.wisconsin.framework.data.FwCargo;

@Entity @Data
@Table(name = "T019_Staff_Profile")
public class T019_Staff_Profile_Cargo implements FwCargo {

	@Id
	@Embedded
	private T019_Staff_Profile_PK PK;
	
	private String first_nam;
	private String last_nam;
	private String position_cd;
	private String bus_org_cd;
	private String bus_ph_no;
	private String home_ph_no;
	private String st_num_adr;
	private String st_name_adr;
	private String apt_adr;
	private String unit_adr;
	private String direction_adr;
	private String quadrant_adr;
	private String suffix_adr;
	private String line_2_adr;
	private String city_adr;
	private String state_adr;
	private String zip_cd_adr;
	private String company_cd;
	private String password;
	private String line_1_adr;
	private String wi_uniq_user_id;

	private Date dob_dt;
	private Date begin_dt;
	private Date end_dt;
	
	private Long bus_ext_num;

	private Character delete_flag;
	private Character devp_region_ind;
	private Character accp_region_ind;
	private Character prod_region_ind;
	private Character timesheet_reqd_ind;
	
	public T019_Staff_Profile_Cargo() {}

	public T019_Staff_Profile_PK getPK() {
		return PK;
	}

	public void setPK(T019_Staff_Profile_PK pK) {
		PK = pK;
	}

	public String getFirst_nam() {
		return first_nam;
	}

	public void setFirst_nam(String first_nam) {
		this.first_nam = first_nam;
	}

	public String getLast_nam() {
		return last_nam;
	}

	public void setLast_nam(String last_nam) {
		this.last_nam = last_nam;
	}

	public String getPosition_cd() {
		return position_cd;
	}

	public void setPosition_cd(String position_cd) {
		this.position_cd = position_cd;
	}

	public String getBus_org_cd() {
		return bus_org_cd;
	}

	public void setBus_org_cd(String bus_org_cd) {
		this.bus_org_cd = bus_org_cd;
	}

	public String getBus_ph_no() {
		return bus_ph_no;
	}

	public void setBus_ph_no(String bus_ph_no) {
		this.bus_ph_no = bus_ph_no;
	}

	public String getHome_ph_no() {
		return home_ph_no;
	}

	public void setHome_ph_no(String home_ph_no) {
		this.home_ph_no = home_ph_no;
	}

	public String getSt_num_adr() {
		return st_num_adr;
	}

	public void setSt_num_adr(String st_num_adr) {
		this.st_num_adr = st_num_adr;
	}

	public String getSt_name_adr() {
		return st_name_adr;
	}

	public void setSt_name_adr(String st_name_adr) {
		this.st_name_adr = st_name_adr;
	}

	public String getApt_adr() {
		return apt_adr;
	}

	public void setApt_adr(String apt_adr) {
		this.apt_adr = apt_adr;
	}

	public String getUnit_adr() {
		return unit_adr;
	}

	public void setUnit_adr(String unit_adr) {
		this.unit_adr = unit_adr;
	}

	public String getDirection_adr() {
		return direction_adr;
	}

	public void setDirection_adr(String direction_adr) {
		this.direction_adr = direction_adr;
	}

	public String getQuadrant_adr() {
		return quadrant_adr;
	}

	public void setQuadrant_adr(String quadrant_adr) {
		this.quadrant_adr = quadrant_adr;
	}

	public String getSuffix_adr() {
		return suffix_adr;
	}

	public void setSuffix_adr(String suffix_adr) {
		this.suffix_adr = suffix_adr;
	}

	public String getLine_2_adr() {
		return line_2_adr;
	}

	public void setLine_2_adr(String line_2_adr) {
		this.line_2_adr = line_2_adr;
	}

	public String getCity_adr() {
		return city_adr;
	}

	public void setCity_adr(String city_adr) {
		this.city_adr = city_adr;
	}

	public String getState_adr() {
		return state_adr;
	}

	public void setState_adr(String state_adr) {
		this.state_adr = state_adr;
	}

	public String getZip_cd_adr() {
		return zip_cd_adr;
	}

	public void setZip_cd_adr(String zip_cd_adr) {
		this.zip_cd_adr = zip_cd_adr;
	}

	public String getCompany_cd() {
		return company_cd;
	}

	public void setCompany_cd(String company_cd) {
		this.company_cd = company_cd;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLine_1_adr() {
		return line_1_adr;
	}

	public void setLine_1_adr(String line_1_adr) {
		this.line_1_adr = line_1_adr;
	}

	public String getWi_uniq_user_id() {
		return wi_uniq_user_id;
	}

	public void setWi_uniq_user_id(String wi_uniq_user_id) {
		this.wi_uniq_user_id = wi_uniq_user_id;
	}

	public Date getDob_dt() {
		return dob_dt;
	}

	public void setDob_dt(Date dob_dt) {
		this.dob_dt = dob_dt;
	}

	public Date getBegin_dt() {
		return begin_dt;
	}

	public void setBegin_dt(Date begin_dt) {
		this.begin_dt = begin_dt;
	}

	public Date getEnd_dt() {
		return end_dt;
	}

	public void setEnd_dt(Date end_dt) {
		this.end_dt = end_dt;
	}

	public Long getBus_ext_num() {
		return bus_ext_num;
	}

	public void setBus_ext_num(Long bus_ext_num) {
		this.bus_ext_num = bus_ext_num;
	}

	public Character getDelete_flag() {
		return delete_flag;
	}

	public void setDelete_flag(Character delete_flag) {
		this.delete_flag = delete_flag;
	}

	public Character getDevp_region_ind() {
		return devp_region_ind;
	}

	public void setDevp_region_ind(Character devp_region_ind) {
		this.devp_region_ind = devp_region_ind;
	}

	public Character getAccp_region_ind() {
		return accp_region_ind;
	}

	public void setAccp_region_ind(Character accp_region_ind) {
		this.accp_region_ind = accp_region_ind;
	}

	public Character getProd_region_ind() {
		return prod_region_ind;
	}

	public void setProd_region_ind(Character prod_region_ind) {
		this.prod_region_ind = prod_region_ind;
	}

	public Character getTimesheet_reqd_ind() {
		return timesheet_reqd_ind;
	}

	public void setTimesheet_reqd_ind(Character timesheet_reqd_ind) {
		this.timesheet_reqd_ind = timesheet_reqd_ind;
	}

}