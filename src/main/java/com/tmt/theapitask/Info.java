package com.tmt.theapitask;

public class Info {
    private String slackUsername;
    private boolean backend;
    private int age;
    private String bio;


    public Info() {
    }

    public Info(String slackUsername, boolean backend, int age, String bio) {
        this.slackUsername = slackUsername;
        this.backend = backend;
        this.age = age;
        this.bio = bio;
    }


    public String getSlackUsername() {
        return this.slackUsername;
    }

    public void setSlackUsername(String slackUsername) {
        this.slackUsername = slackUsername;
    }

    public boolean isBackend() {
        return this.backend;
    }

    public boolean getBackend() {
        return this.backend;
    }

    public void setBackend(boolean backend) {
        this.backend = backend;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBio() {
        return this.bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    
}
