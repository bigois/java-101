package br.com.bigois.jpa.derivedquery;

import br.com.bigois.jpa.derivedquery.entity.Employee;
import br.com.bigois.jpa.derivedquery.entity.Gender;
import br.com.bigois.jpa.derivedquery.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@AllArgsConstructor
@SpringBootApplication
public class DerivedQueryApp implements ApplicationRunner {
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(DerivedQueryApp.class, args);
	}

	@Override
	public void run(@NonNull ApplicationArguments args) throws Exception {
		int total = employeeRepository.findAll().size();
		int totalMale = employeeRepository.findByGender(Gender.M).size();
		int totalFemale = employeeRepository.findByGenderIsNot(Gender.M).size();
		int vacationHoursGreaterThan40 = employeeRepository.findByVacationHoursIsGreaterThan(40).size();
		int totalDesignersAndAccountants = employeeRepository.findByJobTitleLikeIgnoreCase("%Design%").size();
		int totalSickMarried = employeeRepository.findByMaritalStatusEqualsIgnoreCaseAndSickLeaveHoursGreaterThan("M", 60).size();
		List<Employee> top3VacationHours = employeeRepository.findTop3ByOrderByVacationHoursDesc();

		System.out.println("Total employees: " + total);
		System.out.println("Total male employees: " + totalMale);
		System.out.println("Total female employees: " + totalFemale);
		System.out.println("Total employees with vacation hours greater than 40: " + vacationHoursGreaterThan40);
		System.out.println("Total employees with job title 'Designer': " + totalDesignersAndAccountants);
		System.out.println("Total married employees with sick leave hours greater than 60: " + totalSickMarried);
		System.out.println("Top 3 employees with most vacation hours: " + top3VacationHours);
	}
}
