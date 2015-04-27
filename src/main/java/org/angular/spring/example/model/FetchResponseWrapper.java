package org.angular.spring.example.model;

import java.util.List;

/**
 * Created by iky215 on 4/25/15.
 */
public class FetchResponseWrapper {
    private List<FetchResponse> fetchResponse;
    private String backEndTime;

    public String getBackEndTime() {
        return backEndTime;
    }

    public void setBackEndTime(String backEndtime) {
        this.backEndTime = backEndtime  ;
    }

    public List<FetchResponse> getFetchResponse() {
        return fetchResponse;
    }

    public void setFetchResponse(List<FetchResponse> fetchResponse) {
        this.fetchResponse = fetchResponse;
    }
}
