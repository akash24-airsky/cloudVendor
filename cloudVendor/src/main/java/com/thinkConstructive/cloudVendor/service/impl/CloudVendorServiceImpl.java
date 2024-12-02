package com.thinkConstructive.cloudVendor.service.impl;

import com.thinkConstructive.cloudVendor.entity.CloudVendor;
import com.thinkConstructive.cloudVendor.repository.CloudVendorRepository;
import com.thinkConstructive.cloudVendor.service.CloudVendorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CloudVendorServiceImpl implements CloudVendorService {

    private CloudVendorRepository cloudVendorRepository;

    @Override
    public CloudVendor createCloudVendor(CloudVendor cloudVendor) {
        return cloudVendorRepository.save(cloudVendor);
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }

    @Override
    public CloudVendor getById(Long vendorId) {
        return cloudVendorRepository.findById(vendorId).get();

    }

    @Override
    public String deleteById(Long vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "Id deleted Successfully";
    }
}
