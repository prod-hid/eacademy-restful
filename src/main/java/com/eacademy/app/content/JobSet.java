package com.eacademy.app.content;

import java.util.ArrayList;

/**
 * Created by trupi on 13/10/15.
 */
public class JobSet {

    private final String query;
    private final ArrayList<Job> jobset;

    public JobSet(String query, ArrayList<Job> jobset) {
        this.query = query;
        this.jobset = jobset;
    }

    public ArrayList<Job> getJobset() {
        ArrayList<Job> queriedJobs = new ArrayList<>();
        for(Job job : jobset)
        {
            if(job.matches(query)){
                queriedJobs.add(job);
            }
        }
        return queriedJobs;
    }

    public String getQuery() {
        return query;
    }
}
