package br.com.sergiocabral.moviereview.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sergiocabral.moviereview.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
