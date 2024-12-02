package com.thinkConstructive.cloudVendor.controller;

import com.thinkConstructive.cloudVendor.entity.CloudVendor;
import com.thinkConstructive.cloudVendor.service.CloudVendorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cloudVendors")
@AllArgsConstructor
public class CloudVendorController {

    private CloudVendorService cloudVendorService;

    @PostMapping
    public ResponseEntity<CloudVendor> createCloudVendor(@RequestBody CloudVendor cloudVendor) {
        CloudVendor saveCloudVendor = cloudVendorService.createCloudVendor(cloudVendor);
        return new ResponseEntity<>(saveCloudVendor, HttpStatus.CREATED);
    }
}