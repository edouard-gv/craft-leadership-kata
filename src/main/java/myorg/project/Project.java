package myorg.project;

import myorg.devs.BackEndDevs;

import java.util.List;

public record Project(List<Task> tasks) {
    public void tick() {
        BackEndDevs firstFreeDev = BackEndDevs.findFirstFreeDev();
        firstFreeDev.assignTaskToMe(this);
    }
}