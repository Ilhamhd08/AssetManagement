package com.batm.Day2.DTO.User;

public class UserGridDTO {
    private String username;

    private String roleName;

    public UserGridDTO(String username, String roleName){
        this.username = username;
        this.roleName = roleName;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getRolename() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;

    }
}
