package com.jarana.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jarana.entities.PoDetail;
import com.jarana.entities.PoDetailId;

@Repository("podetailDAO")
public interface PoDetailDAO extends JpaRepository<PoDetail, PoDetailId> {

	 List<PoDetail> findByid(PoDetailId id);
}
