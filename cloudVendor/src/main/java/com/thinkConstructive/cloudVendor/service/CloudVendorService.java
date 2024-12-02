package com.thinkConstructive.cloudVendor.service;

import com.thinkConstructive.cloudVendor.entity.CloudVendor;

import java.util.List;

public interface CloudVendorService {

    CloudVendor createCloudVendor(CloudVendor cloudVendor);

    List<CloudVendor> getAllCloudVendor();

    CloudVendor getById(Long vendorId);

    String deleteById(Long vendorId);

}
