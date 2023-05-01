package ru.company.taskmanagement.screen.task;

import io.jmix.ui.screen.*;
import ru.company.taskmanagement.entity.Task;

@UiController("Task_.edit")
@UiDescriptor("task-edit.xml")
@EditedEntityContainer("taskDc")
public class TaskEdit extends StandardEditor<Task> {
}