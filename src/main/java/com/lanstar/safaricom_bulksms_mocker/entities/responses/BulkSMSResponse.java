package com.lanstar.safaricom_bulksms_mocker.entities.responses;

public class BulkSMSResponse {
    String keyword;
    String status;
    String statusCode;

    public static BulkSMSResponse ofSuccess() {
        BulkSMSResponse res = new BulkSMSResponse();
        res.setKeyword("Bulk");
        res.setStatus("SUCCESS");
        res.setStatusCode("SC0000");
        return res;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
