package com.thinkConstructive.cloudVendor.repository;

import com.thinkConstructive.cloudVendor.entity.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudVendorRepository extends JpaRepository<CloudVendor, Long> {


}
