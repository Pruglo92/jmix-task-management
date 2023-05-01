package ru.company.taskmanagement.screen.subtask;

import io.jmix.ui.screen.*;
import ru.company.taskmanagement.entity.Subtask;

@UiController("Subtask.edit")
@UiDescriptor("subtask-edit.xml")
@EditedEntityContainer("subtaskDc")
public class SubtaskEdit extends StandardEditor<Subtask> {
}