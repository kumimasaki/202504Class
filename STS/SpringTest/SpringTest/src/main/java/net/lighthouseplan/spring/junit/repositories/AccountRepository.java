package net.lighthouseplan.spring.junit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.lighthouseplan.spring.junit.models.Account;


@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	Account findByUsername(String username);
}
