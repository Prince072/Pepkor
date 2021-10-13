package com.example.pepkor.Tasks;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Task {
    @Id
    @SequenceGenerator(
            name = "task_sequence",
            sequenceName = "task_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "task_sequence"
    )
    private String workItem;
    private String name;
    private String status;
    private String department;
    private LocalDate date;

    public Task() {
    }

    public Task(String workItem, String name, String status, String department, LocalDate date) {
        this.workItem = workItem;
        this.name = name;
        this.status = status;
        this.department = department;
        this.date = date;
    }

    public String getWorkItem() {
        return workItem;
    }

    public void setWorkItem(String workItem) {
        this.workItem = workItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Task{" +
                "workItem='" + workItem + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", department='" + department + '\'' +
                ", date=" + date +
                '}';
    }
}


