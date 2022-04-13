package com.novo.data.mongodb;

import com.novo.framework.core.entity.MBaseEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface MBaseRepository<T extends MBaseEntity,L extends Serializable> extends MongoRepository<T, L>{
	
}
