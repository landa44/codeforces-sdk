package com.landa44.codeforces.sdk;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import com.landa44.codeforces.sdk.util.OptionalStringDeserializer;

import java.util.List;
import java.util.Optional;

public class ClientResponse<T> {
    private String status;
    private List<T> result;
    @JsonDeserialize(using = OptionalStringDeserializer.class)
    private Optional<String> comment;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public String getComments() {
        return comment.orElse("");
    }

    public void setComments(Optional<String> comments) {
        this.comment = comments;
    }

    @Override
    public String toString() {
        return "ClientResponse{" +
            "status='" + status + '\'' +
            ", result=" + result +
            ", comments=" + comment +
            '}';
    }
}
