package com.lanstar.safaricom_bulksms_mocker.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lanstar.safaricom_bulksms_mocker.entities.requests.BulkSMSRequest;
import com.lanstar.safaricom_bulksms_mocker.entities.responses.BulkSMSResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/CMS/bulksms")
public class BulksmsrequestsController {
    Logger LOGGER = LoggerFactory.getLogger(BulksmsrequestsController.class);
    @PostMapping
    public BulkSMSResponse mockSafaricomBulksms(@RequestBody BulkSMSRequest request) throws JsonProcessingException {
        LOGGER.info(new ObjectMapper().writeValueAsString(request));

        return BulkSMSResponse.ofSuccess();
    }
}
