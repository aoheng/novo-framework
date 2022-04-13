package com.novo.data.jpa;

import com.novo.framework.core.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BaseRepository <T extends BaseEntity> extends JpaRepository<T,Long>,JpaSpecificationExecutor<T>{
	
}
