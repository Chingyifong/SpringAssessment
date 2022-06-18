package org.generation.SpringAssessment.controller.dto;

import java.util.Date;

public class ItemDto {

    private String task;
    private String description;
    private String startDate;
    private String endDate;


    //Constructor
    public ItemDto(String task, String description, String startDate, String endDate)
    {
        this.task = task;
        this.description = description;
        this.startDate = startDate ;
        this.endDate = endDate;
    }

    //Getter & Setter
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
