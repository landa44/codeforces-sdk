package com.landa44.codeforces.sdk.user;

import java.util.List;

public class UserResponse {
    private String status;
    private List<User> result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<User> getResult() {
        return result;
    }

    public void setResult(List<User> result) {
        this.result = result;
    }
}
