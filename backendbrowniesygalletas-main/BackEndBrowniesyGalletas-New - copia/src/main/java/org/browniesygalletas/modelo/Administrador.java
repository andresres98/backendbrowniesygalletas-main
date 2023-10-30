package org.browniesygalletas.modelo;


import org.browniesygalletas.service.ServiceAdmon;

public class Administrador extends ServiceAdmon {
    private String adminUser;
    private String passwordAdminUser;

    public Administrador(String adminUser, String passwordAdminUser) {
        this.adminUser = adminUser;
        this.passwordAdminUser = passwordAdminUser;
    }

    public String getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser;
    }

    public String getPasswordAdminUser() {
        return passwordAdminUser;
    }

    public void setPasswordAdminUser(String passwordAdminUser) {
        this.passwordAdminUser = passwordAdminUser;
    }


}






