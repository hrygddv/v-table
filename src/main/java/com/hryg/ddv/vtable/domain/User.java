package com.hryg.ddv.vtable.domain;

/**
 * 用户
 *
 * @author hryg
 * Created on 2018-10-09
 */
public class User {
    private Integer id;
    private String name;
    private String familyRole;
    private Family family;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyRole() {
        return familyRole;
    }

    public void setFamilyRole(String familyRole) {
        this.familyRole = familyRole;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}
