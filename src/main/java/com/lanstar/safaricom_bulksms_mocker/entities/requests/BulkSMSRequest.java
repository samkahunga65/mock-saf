package com.lanstar.safaricom_bulksms_mocker.entities.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class BulkSMSRequest {
    public static class DataSet {

        @JsonProperty("userName")
        private String username;

        @JsonProperty("channel")
        private String channel;

        @JsonProperty("packageId")
        private String packageID;

        @JsonProperty("oa")
        private String oa;

        @JsonProperty("msisdn")
        private String msisdn;


        @JsonProperty("message")
        private String message;

        @JsonProperty("uniqueId")
        private String uniqueId;

        @JsonProperty("actionResponseURL")
        private String actionResponseURL;

        public DataSet() {
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getPackageID() {
            return packageID;
        }

        public void setPackageID(String packageID) {
            this.packageID = packageID;
        }

        public String getOa() {
            return oa;
        }

        public void setOa(String oa) {
            this.oa = oa;
        }

        public String getMsisdn() {
            return msisdn;
        }

        public void setMsisdn(String msisdn) {
            this.msisdn = msisdn;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getUniqueId() {
            return uniqueId;
        }

        public void setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
        }

        public String getActionResponseURL() {
            return actionResponseURL;
        }

        public void setActionResponseURL(String actionResponseURL) {
            this.actionResponseURL = actionResponseURL;
        }



        public static DataSet of(String packageId,String shortCodeName,String senderUsername, String message, String callBackUrl, String msisdn, String requestId) {
            DataSet dataSet = new DataSet();
            dataSet.setChannel("SMS");
            dataSet.setPackageID(packageId);
//                dataSet.setPackageID("");
            dataSet.setOa(shortCodeName);
            ;
            dataSet.setUsername(senderUsername);
            dataSet.setUniqueId(requestId);
            dataSet.setMessage(message);
            dataSet.setActionResponseURL(callBackUrl);
            dataSet.setMsisdn(msisdn);

            return dataSet;
        }
    }

    @JsonProperty("timeStamp")
    private String timeStamp;

    @JsonProperty("dataSet")
    private List<DataSet> dataSets;

    public BulkSMSRequest() {
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public List<DataSet> getDataSets() {
        return dataSets;
    }

    public void setDataSets(List<DataSet> dataSets) {
        this.dataSets = dataSets;
    }


    public static BulkSMSRequest of(String packageId,String shortCodeName,String senderUsername, String message, String callBackUrl, String msisdn, String requestId) {
        BulkSMSRequest request = new BulkSMSRequest();
        List<DataSet> dataSetList = new ArrayList<>();
        dataSetList.add(DataSet.of(packageId,shortCodeName,senderUsername, message, callBackUrl, msisdn, requestId));
        request.setTimeStamp("timestamp");
        request.setDataSets(dataSetList);

        return request;
    }

}
