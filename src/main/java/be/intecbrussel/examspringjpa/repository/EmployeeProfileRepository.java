package be.intecbrussel.examspringjpa.repository;

import be.intecbrussel.examspringjpa.model.EmployeeProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeProfileRepository extends JpaRepository<EmployeeProfile, Long> {


}
