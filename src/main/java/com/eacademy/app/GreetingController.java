package com.eacademy.app;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.eacademy.app.content.Job;
import com.eacademy.app.content.JobSet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public List<ExampleClass> records = new ArrayList<>();
    public ArrayList<Job> joblist;

    public void DemoJobListProvider(){
        joblist = new ArrayList<>();
        joblist.add(new Job("Java Developer", "Berlin", 30000, 40000));
        joblist.add(new Job("Java Idiot", "Dusseldorf", 30000, 40000));
        joblist.add(new Job("Automation Engineer", "Germany", 30000, 40000));
        joblist.add(new Job("CEO", "Berlin", 300000, 400000));
    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        records.clear();
        records.add(new ExampleClass(1, "somename"));
        records.add(new ExampleClass(2, "someOthername"));
        return new Greeting(records);
    }

    @RequestMapping("/resultList")
    public String resultlist(){
        return "hey";
    }

    @RequestMapping("/jobs")
    public JobSet getJobsContent(@RequestParam(value="query", defaultValue="Ber") String query){
        DemoJobListProvider();
        return new JobSet(query, joblist);
    }


}
