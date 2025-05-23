package org.example.entity;

public class Task {
    private String project;
    private String description;
    private String assignee;
    private Status status;
    private Priority priority;

    public Task(String project, String description, String assignee, Status status, Priority priority) {
        this.project = project;
        this.description = description;
        this.assignee = assignee;
        this.status = status;
        this.priority = priority;
    }

    public String getProject() {
        return project;
    }

    public String getDescription() {
        return description;
    }

    public String getAssignee() {
        return assignee;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Task task = (Task) obj;
        return project.equals(task.project) &&
                description.equals(task.description) &&
                assignee.equals(task.assignee) &&
                status == task.status &&
                priority == task.priority;
    }

    @Override
    public int hashCode() {
        return (project + description + assignee + status + priority).hashCode();
    }
}
