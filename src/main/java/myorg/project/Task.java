package myorg.project;

import myorg.devs.DevTeam;

public class Task {
    DevTeam assignee;

    public DevTeam assignee() {
        return assignee;
    }

    public void assign(DevTeam assignee) {
        this.assignee = assignee;
    }
}
