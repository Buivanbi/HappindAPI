package aptech.dating.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aptech.dating.model.Family;


public interface FamilyRepository extends JpaRepository<Family, Integer> {
}
