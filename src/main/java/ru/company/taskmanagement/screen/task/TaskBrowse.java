package ru.company.taskmanagement.screen.task;

import io.jmix.ui.screen.*;
import ru.company.taskmanagement.entity.Task;

@UiController("Task_.browse")
@UiDescriptor("task-browse.xml")
@LookupComponent("tasksTable")
public class TaskBrowse extends StandardLookup<Task> {
}