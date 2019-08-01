package com.trilogyed.tasker.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Objects;

public class Task {

    private int id;
    @NotEmpty(message = "You must supply a value for description")
    @Size(min = 1, max = 255, message = "Description has to range between 1 character and a max of 255 characters")
    private String description;

    @NotEmpty(message = "You must enter a date in YYYY/MM/DD format")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate createDate;

    @NotEmpty(message = "You must enter a date in YYYY/MM/DD format")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dueDate;

    @NotEmpty(message = "You must supply a value for category")
    @Size(min = 1, max = 255, message = "Category has to range between 1 character and a max of 255 characters")
    private String category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id &&
                Objects.equals(description, task.description) &&
                Objects.equals(createDate, task.createDate) &&
                Objects.equals(dueDate, task.dueDate) &&
                Objects.equals(category, task.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, createDate, dueDate, category);
    }
}
