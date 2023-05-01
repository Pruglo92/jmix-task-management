package ru.company.taskmanagement.screen.project;

import io.jmix.ui.screen.*;
import ru.company.taskmanagement.entity.Project;

@UiController("Project.edit")
@UiDescriptor("project-edit.xml")
@EditedEntityContainer("projectDc")
public class ProjectEdit extends StandardEditor<Project> {
}