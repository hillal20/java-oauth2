package com.lambdaschool.oauth2.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.lambdaschool.oauth2.exceptions.ValidationError;

public class ErrorDetail {

  private  String Title;
  private int status;
  private String detail;
  private String timestamp;
  private  String developersMessage;
  private Map<String, List<ValidationError>> errors = new HashMap<String, List<ValidationError>>();

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = new SimpleDateFormat("").format(new Date(timestamp)) ;
    }

    public String getDevelopersMessage() {
        return developersMessage;
    }

    public void setDevelopersMessage(String developersMessage) {
        this.developersMessage = developersMessage;
    }

    public Map<String, List<ValidationError>> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, List<ValidationError>> errors) {
        this.errors = errors;
    }
}
