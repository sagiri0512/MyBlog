package com.sagiri.blog.entity;

public class Project {

  private long projectId;
  private String projectName;
  private String projectUrl;
  private String projectSynopsis;
  private String projectSource;


  public long getProjectId() {
    return projectId;
  }

  public void setProjectId(long projectId) {
    this.projectId = projectId;
  }


  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  public String getProjectUrl() {
    return projectUrl;
  }

  public void setProjectUrl(String projectUrl) {
    this.projectUrl = projectUrl;
  }


  public String getProjectSynopsis() {
    return projectSynopsis;
  }

  public void setProjectSynopsis(String projectSynopsis) {
    this.projectSynopsis = projectSynopsis;
  }


  public String getProjectSource() {
    return projectSource;
  }

  public void setProjectSource(String projectSource) {
    this.projectSource = projectSource;
  }

}
