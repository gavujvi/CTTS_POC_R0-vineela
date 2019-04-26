package gov.wisconsin.admin.transport.response;

import gov.wisconsin.admin.data.pojo.T019_Staff_Profile_Cargo;
import gov.wisconsin.framework.transport.FwResponse;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class GetStaffProfileResponse extends FwResponse {
	private List<T019_Staff_Profile_Cargo> resultList = new ArrayList<T019_Staff_Profile_Cargo>();

	public List<T019_Staff_Profile_Cargo> getResultList() {
		return resultList;
	}

	public void setResultList(List<T019_Staff_Profile_Cargo> resultList) {
		this.resultList = resultList;
	}
}