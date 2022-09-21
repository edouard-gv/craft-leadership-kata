package myorg.project;

import myorg.devs.BackEndDeveloper;

public class Task {

    String description;
    BackEndDeveloper assignee;

    public Task(String description) {
        this.description = description;
    }

    public BackEndDeveloper assignee() {
        return assignee;
    }

    public void assign(BackEndDeveloper assignee) {
        this.assignee = assignee;
    }
}
