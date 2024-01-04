package edu.ebac;

import java.util.List;

/**
 * @author vinisantosn
 * @version 0.1
 */
public class Agents {
    private String name;
    private String role;
    private String biography;
    private List<String> specialAbilities;


    public String getName() {
        return name;
    }

    /**
     * @param name The name of the agent.
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    /**
     * @param role The role of the agent.
     */
    public void setRole(String role) {
        this.role = role;
    }

    public String getBiography() {
        return biography;
    }

    /**
     * @param biography The biography of the agent.
     */
    public void setBiography(String biography) {
        this.biography = biography;
    }

    public List<String> getSpecialAbilities() {
        return specialAbilities;
    }

    /**
     * @param specialAbilities The list of special abilities possessed by the agent.
     */
    public void setSpecialAbilities(List<String> specialAbilities) {
        this.specialAbilities = specialAbilities;
    }
}