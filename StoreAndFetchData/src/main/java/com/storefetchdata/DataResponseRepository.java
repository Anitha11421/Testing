package com.storefetchdata;
import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface DataResponseRepository extends CrudRepository<DataResponse, Long> {

	List<DataResponse> searchByEmail(String email);

}