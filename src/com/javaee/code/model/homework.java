package com.javaee.code.model;

public class homework {
    private Long homeworkId;
    private String homeworkName;
    private String homeworkContent;
    public Long getHomeworkId() {
        return homeworkId;
    }
    public void setHomeworkId(Long homeworkId) {
        this.homeworkId = homeworkId;
    }
    public String getHomeworkName(){return homeworkName;}
    public void setHomeworkName(String studentName){this.homeworkName=homeworkName;}
    public String getHomeworkContent(){return homeworkContent;}
    public void setHomeworkContent(String homeworkContent){this.homeworkContent=homeworkContent;}

}
