package ru.company.taskmanagement.screen.project;

import io.jmix.ui.screen.*;
import ru.company.taskmanagement.entity.Project;

@UiController("Project.browse")
@UiDescriptor("project-browse.xml")
@LookupComponent("projectsTable")
public class ProjectBrowse extends StandardLookup<Project> {
}