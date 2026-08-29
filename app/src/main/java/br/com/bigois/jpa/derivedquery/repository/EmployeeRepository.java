package br.com.bigois.jpa.derivedquery.repository;

import br.com.bigois.jpa.derivedquery.entity.Employee;
import br.com.bigois.jpa.derivedquery.entity.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	List<Employee> findByGender(Gender gender);
	List<Employee> findByGenderIsNot(Gender gender);
	List<Employee> findByVacationHoursIsGreaterThan(int vacationHours);
	List<Employee> findByJobTitleLikeIgnoreCase(String jobTitle);
	List<Employee> findByMaritalStatusEqualsIgnoreCaseAndSickLeaveHoursGreaterThan(String maritalStatus, int sickLeaveHours);
	List<Employee> findTop3ByOrderByVacationHoursDesc();
}
