package ru.company.taskmanagement.screen.subtask;

import io.jmix.ui.screen.*;
import ru.company.taskmanagement.entity.Subtask;

@UiController("Subtask.browse")
@UiDescriptor("subtask-browse.xml")
@LookupComponent("subtasksTable")
public class SubtaskBrowse extends StandardLookup<Subtask> {
}