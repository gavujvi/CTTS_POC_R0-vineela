package gov.wisconsin.admin.transport.response;

import gov.wisconsin.admin.data.pojo.T025_Activity_Cargo;
import gov.wisconsin.framework.transport.FwResponse;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class GetAllActivitiesResponse extends FwResponse {
	private List<T025_Activity_Cargo> resultList = new ArrayList<T025_Activity_Cargo>();

	public List<T025_Activity_Cargo> getResultList() {
		return resultList;
	}

	public void setResultList(List<T025_Activity_Cargo> resultList) {
		this.resultList = resultList;
	}
}