package gov.wisconsin.admin.data.dao;

import gov.wisconsin.admin.data.pojo.T019_Staff_Profile_Cargo;
import gov.wisconsin.admin.data.pojo.T019_Staff_Profile_PK;
import gov.wisconsin.framework.data.FwDAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface T019_Staff_Profile_DAO extends JpaRepository<T019_Staff_Profile_Cargo, T019_Staff_Profile_PK>, FwDAO {
	@Query(value = "SELECT * FROM T019_Staff_Profile", nativeQuery = true)
	public List<T019_Staff_Profile_Cargo> getUserNames();
	
	@Query(value = "SELECT * FROM T019_Staff_Profile WHERE TIMESHEET_REQD_IND = 'Y'", nativeQuery = true)
	public List<T019_Staff_Profile_Cargo> getStaffFirstAndLastNames();

}


