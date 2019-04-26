package gov.wisconsin.admin.business;

import gov.wisconsin.admin.data.dao.T019_Staff_Profile_DAO;
import gov.wisconsin.admin.data.dao.T035_HolidayTime_DAO;
import gov.wisconsin.admin.data.pojo.T019_Staff_Profile_Cargo;
import gov.wisconsin.admin.data.pojo.T035_HolidayTime_Cargo;
import gov.wisconsin.framework.base.FwAbstractBO;
import gov.wisconsin.framework.constant.FwConstants;
import gov.wisconsin.framework.exception.FwExceptionManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = FwConstants.PROTOTYPE_SCOPE)

public class StaffProfileBO extends FwAbstractBO {
private @Autowired T019_Staff_Profile_DAO staff_Profile_DAO;

	
	public List<T019_Staff_Profile_Cargo> getAllStaffDetails(String username) {
		try {
			return staff_Profile_DAO.findAll();
		} catch(Exception e) {
			FwExceptionManager.handleException(this.getClass(), e);
		}
		
		return null;
	}
	public List<T019_Staff_Profile_Cargo> getActiveStaffNames(String username) {
		try {
			return staff_Profile_DAO.getStaffFirstAndLastNames();
		} catch(Exception e) {
			FwExceptionManager.handleException(this.getClass(), e);
		}
		
		return null;
	}
}