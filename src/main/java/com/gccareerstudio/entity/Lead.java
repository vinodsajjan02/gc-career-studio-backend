package com.gccareerstudio.entity;


import jakarta.persistence.*;
import java.time.LocalDateTime;
 
@Entity
@Table(name = "leads")
public class Lead {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @Column(nullable = false)
    private String fullName;
 
    @Column(nullable = false)
    private String email;
 
    private String phone;
 
    private String careerStatus;   // e.g. Student / Fresher / Working Professional
 
    private String experience;     // e.g. "0-1 years", "2-4 years"
 
    private String targetRole;
 
    private String location;
 
    private String preferredService;   // e.g. Resume Building, LinkedIn Optimization
 
    private String linkedinUrl;
 
    private String resumePath;     // file path/URL after upload
 
    @Column(length = 1000)
    private String notes;
 
    private LocalDateTime createdAt;
 
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
 
    // ---- Getters and Setters ----
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getFullName() {
        return fullName;
    }
 
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
 
    public String getCareerStatus() {
        return careerStatus;
    }
 
    public void setCareerStatus(String careerStatus) {
        this.careerStatus = careerStatus;
    }
 
    public String getExperience() {
        return experience;
    }
 
    public void setExperience(String experience) {
        this.experience = experience;
    }
 
    public String getTargetRole() {
        return targetRole;
    }
 
    public void setTargetRole(String targetRole) {
        this.targetRole = targetRole;
    }
 
    public String getLocation() {
        return location;
    }
 
    public void setLocation(String location) {
        this.location = location;
    }
 
    public String getPreferredService() {
        return preferredService;
    }
 
    public void setPreferredService(String preferredService) {
        this.preferredService = preferredService;
    }
 
    public String getLinkedinUrl() {
        return linkedinUrl;
    }
 
    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }
 
    public String getResumePath() {
        return resumePath;
    }
 
    public void setResumePath(String resumePath) {
        this.resumePath = resumePath;
    }
 
    public String getNotes() {
        return notes;
    }
 
    public void setNotes(String notes) {
        this.notes = notes;
    }
 
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
 
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}