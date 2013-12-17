package com.programcreek.designpatterns.observer;

import java.util.ArrayList;
/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-16
 * Time: 下午9:40
 * Description: To change this template use File | Settings | File Templates.
 */
interface Observer {
    public void update(Subject s);
}
interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyAllObserver();
}

class HeadHunter implements Subject {

    //define a list of users
    private ArrayList<Observer> userList;
    private ArrayList<String> jobs;

    public HeadHunter() {
        userList = new ArrayList<Observer>();
        jobs = new ArrayList<String>();
    }

    @Override
    public void registerObserver(Observer o) {
        userList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
    public void notifyAllObserver() {
        for (Observer o: userList) {
            o.update(this);
        }
    }

    public void addJob(String job) {
        this.jobs.add(job);
        notifyAllObserver();
    }

    public ArrayList<String> getJobs() {
        return this.jobs;
    }

    @Override
    public String toString() {
        return jobs.toString();
    }
}

class JobSeeker implements Observer {
    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject s) {
        System.out.println(this.name + " got notified!");
        //print job list
        System.out.println(s);
    }
}

public class ObserverTest {
    public static void run() {
        HeadHunter hh = new HeadHunter();
        hh.registerObserver(new JobSeeker("Mike"));
        hh.registerObserver(new JobSeeker("Chris"));
        hh.registerObserver(new JobSeeker("Jeff"));

        //Each time,a new job is added, all registered job seekers will got noticed.
        hh.addJob("Google Job");
        hh.addJob("Yahoo Job");
    }
}
