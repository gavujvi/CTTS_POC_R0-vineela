package gov.wisconsin.admin.controller;

import java.util.ArrayList;
import java.util.List;

import gov.wisconsin.admin.business.ActivityBO;
import gov.wisconsin.admin.business.CategoryBO;
import gov.wisconsin.admin.business.HolidayBO;
import gov.wisconsin.admin.business.StaffProfileBO;
import gov.wisconsin.admin.data.pojo.T019_Staff_Profile_Cargo;
import gov.wisconsin.admin.data.pojo.T024_Category_Cargo;
import gov.wisconsin.admin.data.pojo.T025_Activity_Cargo;
import gov.wisconsin.admin.data.pojo.T035_HolidayTime_Cargo;
import gov.wisconsin.admin.transport.response.CreateActivityResponse;
import gov.wisconsin.admin.transport.response.CreateCategoryResponse;
import gov.wisconsin.admin.transport.response.CreateHolidayResponse;
import gov.wisconsin.admin.transport.response.GetActiveStaffNameResponse;
import gov.wisconsin.admin.transport.response.GetAllActivitiesResponse;
import gov.wisconsin.admin.transport.response.GetAllCategoriesResponse;
import gov.wisconsin.admin.transport.response.GetAllHolidaysResponse;
import gov.wisconsin.admin.transport.response.GetStaffProfileResponse;
import gov.wisconsin.admin.transport.response.UpdateActivityResponse;
import gov.wisconsin.admin.transport.response.UpdateCategoryResponse;
import gov.wisconsin.admin.transport.response.UpdateHolidayResponse;
import gov.wisconsin.framework.base.FwAbstractController;
import gov.wisconsin.framework.constant.FwConstants;
import gov.wisconsin.framework.exception.FwException;
import gov.wisconsin.framework.exception.FwWrappedException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(FwConstants.EMPTY_STRING)
public class AdminController extends FwAbstractController {
	
	@GetMapping(value = "/category", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GetAllCategoriesResponse> getAllCategories(@ModelAttribute String authenticatedUsername, HttpServletRequest httpRequest, HttpSession httpSession) {
		GetAllCategoriesResponse apiResponse = new GetAllCategoriesResponse();
		
		try {
			apiResponse.setStatus(false);

			CategoryBO categoryBO = applicationContext.getBean(CategoryBO.class);
			apiResponse.setResultList(categoryBO.getAllCategories(authenticatedUsername));
			
			apiResponse.setStatus(true);
		} catch(FwException fe) {
			throw new FwWrappedException(this.getClass(), fe, httpRequest);
		}
		
		return ResponseEntity.status(200).body(apiResponse);
	}
	
	@PostMapping(value = "/category", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CreateCategoryResponse> createCategory(@RequestBody T024_Category_Cargo apiRequest, @ModelAttribute String authenticatedUsername, HttpServletRequest httpRequest, HttpSession httpSession) {
		CreateCategoryResponse apiResponse = new CreateCategoryResponse();
		
		try {
			apiResponse.setStatus(false);
			
			CategoryBO categoryBO = applicationContext.getBean(CategoryBO.class);
			apiResponse.setCreatedCargo(categoryBO.createOrUpdateCategory(apiRequest));
			
			apiResponse.setStatus(true);
		} catch(FwException fe) {
			throw new FwWrappedException(this.getClass(), fe, httpRequest);
		}
		
		return ResponseEntity.status(200).body(apiResponse);
	}
	
	@PutMapping(value = "/category", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UpdateCategoryResponse> updateCategory(@RequestBody T024_Category_Cargo apiRequest, @ModelAttribute String authenticatedUsername, HttpServletRequest httpRequest, HttpSession httpSession) {
		UpdateCategoryResponse apiResponse = new UpdateCategoryResponse();
		
		try {
			apiResponse.setStatus(false);

			CategoryBO categoryBO = applicationContext.getBean(CategoryBO.class);
			apiResponse.setUpdatedCargo(categoryBO.createOrUpdateCategory(apiRequest));
			
			apiResponse.setStatus(true);
		} catch(FwException fe) {
			throw new FwWrappedException(this.getClass(), fe, httpRequest);
		}
		
		return ResponseEntity.status(200).body(apiResponse);
	}

	@GetMapping(value = "/activity", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GetAllActivitiesResponse> getAllActivities(@ModelAttribute String authenticatedUsername, HttpServletRequest httpRequest, HttpSession httpSession) {
		GetAllActivitiesResponse apiResponse = new GetAllActivitiesResponse();
		
		try {
			apiResponse.setStatus(false);

			ActivityBO activityBO = applicationContext.getBean(ActivityBO.class);
			apiResponse.setResultList(activityBO.getAllActivities(authenticatedUsername));
			
			apiResponse.setStatus(true);
		} catch(FwException fe) {
			throw new FwWrappedException(this.getClass(), fe, httpRequest);
		}
		
		return ResponseEntity.status(200).body(apiResponse);
	}
	
	@PostMapping(value = "/activity", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CreateActivityResponse> createActivity(@RequestBody T025_Activity_Cargo apiRequest, @ModelAttribute String username, HttpServletRequest httpRequest, HttpSession httpSession) {
		CreateActivityResponse apiResponse = new CreateActivityResponse();
		
		try {
			apiResponse.setStatus(false);

			ActivityBO activityBO = applicationContext.getBean(ActivityBO.class);
			apiResponse.setCreatedCargo(activityBO.createOrUpdateActivity(apiRequest));
			
			apiResponse.setStatus(true);
		} catch(FwException fe) {
			throw new FwWrappedException(this.getClass(), fe, httpRequest);
		}
		
		return ResponseEntity.status(200).body(apiResponse);
	}
	
	@PutMapping(value = "/activity", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UpdateActivityResponse> updateActivity(@RequestBody T025_Activity_Cargo apiRequest, @ModelAttribute String username, HttpServletRequest httpRequest, HttpSession httpSession) {
		UpdateActivityResponse apiResponse = new UpdateActivityResponse();
		
		try {
			apiResponse.setStatus(false);
			
			ActivityBO activityBO = applicationContext.getBean(ActivityBO.class);
			apiResponse.setUpdatedCargo(activityBO.createOrUpdateActivity(apiRequest));
			
			apiResponse.setStatus(true);
		} catch(FwException fe) {
			throw new FwWrappedException(this.getClass(), fe, httpRequest);
		}
		
		return ResponseEntity.status(200).body(apiResponse);
	}

	@GetMapping(value = "/holiday", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GetAllHolidaysResponse> getAllHolidays(@ModelAttribute String username, HttpServletRequest httpRequest, HttpSession httpSession) {
		GetAllHolidaysResponse apiResponse = new GetAllHolidaysResponse();
		
		try {
			apiResponse.setStatus(false);

			HolidayBO holidayBO = applicationContext.getBean(HolidayBO.class);
			apiResponse.setResultList(holidayBO.getAllHolidays(username));
			
			apiResponse.setStatus(true);
		} catch(FwException fe) {
			throw new FwWrappedException(this.getClass(), fe, httpRequest);
		}
		
		return ResponseEntity.status(200).body(apiResponse);
	}

	@PostMapping(value = "/holiday", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CreateHolidayResponse> createHoliday(@RequestBody T035_HolidayTime_Cargo apiRequest, @ModelAttribute String username, HttpServletRequest httpRequest, HttpSession httpSession) {
		CreateHolidayResponse apiResponse = new CreateHolidayResponse();
		
		try {
			apiResponse.setStatus(false);
			
			HolidayBO holidayBO = applicationContext.getBean(HolidayBO.class);
			apiResponse.setCreatedCargo(holidayBO.createOrUpdateHoliday(apiRequest));
			
			apiResponse.setStatus(true);
		} catch(FwException fe) {
			throw new FwWrappedException(this.getClass(), fe, httpRequest);
		}
		
		return ResponseEntity.status(200).body(apiResponse);
	}

	@PutMapping(value = "/holiday", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UpdateHolidayResponse> updateHoliday(@RequestBody T035_HolidayTime_Cargo apiRequest, @ModelAttribute String username, HttpServletRequest httpRequest, HttpSession httpSession) {
		UpdateHolidayResponse apiResponse = new UpdateHolidayResponse();
		
		try {
			apiResponse.setStatus(false);
			
			HolidayBO holidayBO = applicationContext.getBean(HolidayBO.class);
			apiResponse.setUpdatedCargo(holidayBO.createOrUpdateHoliday(apiRequest));
			
			apiResponse.setStatus(true);
		} catch(FwException fe) {
			throw new FwWrappedException(this.getClass(), fe, httpRequest);
		}
		
		return ResponseEntity.status(200).body(apiResponse);
	}
	
	//STAFF_PROFILE
	@GetMapping(value = "/staffProfile", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GetStaffProfileResponse> getStaffProfile(@ModelAttribute String username, HttpServletRequest httpRequest, HttpSession httpSession) {
		GetStaffProfileResponse apiResponse = new GetStaffProfileResponse();
		
		try {
			apiResponse.setStatus(false);

			StaffProfileBO staffProfileBO = applicationContext.getBean(StaffProfileBO.class);
			apiResponse.setResultList(staffProfileBO.getAllStaffDetails(username));
			
			apiResponse.setStatus(true);
		} catch(FwException fe) {
			throw new FwWrappedException(this.getClass(), fe, httpRequest);
		}
		
		return ResponseEntity.status(200).body(apiResponse);
	}
	
	@GetMapping(value = "/activeStaffNames", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GetActiveStaffNameResponse> getActiveStaffNames(@ModelAttribute String username, HttpServletRequest httpRequest, HttpSession httpSession) {
		GetActiveStaffNameResponse apiResponse = new GetActiveStaffNameResponse();
		
		try {
			apiResponse.setStatus(false);

			StaffProfileBO staffProfileBO = applicationContext.getBean(StaffProfileBO.class);
			apiResponse.setResultList(staffProfileBO.getActiveStaffNames(username));
			
			apiResponse.setStatus(true);
		} catch(FwException fe) {
			throw new FwWrappedException(this.getClass(), fe, httpRequest);
		}
		
		return ResponseEntity.status(200).body(apiResponse);
	}
	
}