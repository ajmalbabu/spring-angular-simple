package org.angular.spring.example.model;

/**
 * Created by iky215 on 4/24/15.
 */
public class FetchRequest {

    private int count;
    private String startTime;
    private String backEndTime;
    private String totalTime;


    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public String getBackEndTime() {
        return backEndTime;
    }

    public void setBackEndTime(String backEndTime) {
        this.backEndTime = backEndTime;
    }

    @Override
    public String toString() {
        return "FetchRequest{" +
                "count=" + count +
                '}';
    }
}
