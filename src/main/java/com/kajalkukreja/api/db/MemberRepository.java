package com.kajalkukreja.api.db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kajalkukreja.api.model.Member;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {

}
