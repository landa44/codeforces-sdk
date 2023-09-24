package com.landa44.codeforces.sdk.user;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import com.landa44.codeforces.sdk.util.OptionalStringDeserializer;

import java.util.Optional;

public class User {
    private String handle;
    @JsonDeserialize(using= OptionalStringDeserializer.class)
    private Optional<String> email;
    @JsonDeserialize(using= OptionalStringDeserializer.class)
    private Optional<String> vkid;
    @JsonDeserialize(using= OptionalStringDeserializer.class)
    private Optional<String> openid;
    @JsonDeserialize(using= OptionalStringDeserializer.class)
    private Optional<String> firstName;
    @JsonDeserialize(using= OptionalStringDeserializer.class)
    private Optional<String> lastName;
    @JsonDeserialize(using= OptionalStringDeserializer.class)
    private Optional<String> country;
    @JsonDeserialize(using= OptionalStringDeserializer.class)
    private Optional<String> city;
    @JsonDeserialize(using= OptionalStringDeserializer.class)
    private Optional<String> organization;
    private int contribution;
    private String rank;
    private int rating;
    private String maxRank;
    private int maxRating;
    private long lastOnlineTimeSeconds;
    private long registrationTimeSeconds;
    private int friendOfCount;
    private String avatar;
    private String titlePhoto;

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    public Optional<String> getVkid() {
        return vkid;
    }

    public void setVkid(Optional<String> vkid) {
        this.vkid = vkid;
    }

    public Optional<String> getOpenid() {
        return openid;
    }

    public void setOpenid(Optional<String> openid) {
        this.openid = openid;
    }

    public Optional<String> getFirstName() {
        return firstName;
    }

    public void setFirstName(Optional<String> firstName) {
        this.firstName = firstName;
    }

    public Optional<String> getLastName() {
        return lastName;
    }

    public void setLastName(Optional<String> lastName) {
        this.lastName = lastName;
    }

    public Optional<String> getCountry() {
        return country;
    }

    public void setCountry(Optional<String> country) {
        this.country = country;
    }

    public Optional<String> getCity() {
        return city;
    }

    public void setCity(Optional<String> city) {
        this.city = city;
    }

    public Optional<String> getOrganization() {
        return organization;
    }

    public void setOrganization(Optional<String> organization) {
        this.organization = organization;
    }

    public int getContribution() {
        return contribution;
    }

    public void setContribution(int contribution) {
        this.contribution = contribution;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getMaxRank() {
        return maxRank;
    }

    public void setMaxRank(String maxRank) {
        this.maxRank = maxRank;
    }

    public int getMaxRating() {
        return maxRating;
    }

    public void setMaxRating(int maxRating) {
        this.maxRating = maxRating;
    }

    public long getLastOnlineTimeSeconds() {
        return lastOnlineTimeSeconds;
    }

    public void setLastOnlineTimeSeconds(long lastOnlineTimeSeconds) {
        this.lastOnlineTimeSeconds = lastOnlineTimeSeconds;
    }

    public long getRegistrationTimeSeconds() {
        return registrationTimeSeconds;
    }

    public void setRegistrationTimeSeconds(long registrationTimeSeconds) {
        this.registrationTimeSeconds = registrationTimeSeconds;
    }

    public int getFriendOfCount() {
        return friendOfCount;
    }

    public void setFriendOfCount(int friendOfCount) {
        this.friendOfCount = friendOfCount;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getTitlePhoto() {
        return titlePhoto;
    }

    public void setTitlePhoto(String titlePhoto) {
        this.titlePhoto = titlePhoto;
    }

    @Override
    public String toString() {
        return "User{" +
            "handle='" + handle + '\'' +
            ", email=" + email +
            ", vkid=" + vkid +
            ", openid=" + openid +
            ", firstName=" + firstName +
            ", lastName=" + lastName +
            ", country=" + country +
            ", city=" + city +
            ", organization=" + organization +
            ", contribution=" + contribution +
            ", rank='" + rank + '\'' +
            ", rating=" + rating +
            ", maxRank='" + maxRank + '\'' +
            ", lastOnlineTimeSeconds=" + lastOnlineTimeSeconds +
            ", registrationTimeSeconds=" + registrationTimeSeconds +
            ", friendOfCount=" + friendOfCount +
            ", avatar='" + avatar + '\'' +
            ", titlePhoto='" + titlePhoto + '\'' +
            '}';
    }
}
