package com.eacademy.app.content;

/**
 * Created by trupi on 13/10/15.
 */
public class Job {

    private final String name;
    private final String location;
    private final int salary_min;
    private final int salary_max;

    public Job(String name, String location, int salary_min, int salary_max) {
        this.name = name;
        this.location = location;
        this.salary_min = salary_min;
        this.salary_max = salary_max;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getSalary_min() {
        return salary_min;
    }

    public int getSalary_max() {
        return salary_max;
    }

    public Boolean matches(String query) {
        return name.concat(" ").concat(location).matches("(?i:.*" + query + ".*)");
    }
}
