package com.company.Behavioral.Memento;

public class Client {
    public static void main(String[] args) {
        Project project = new Project();
        GitHubRepo github = new GitHubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersion("Version 1.0");
        System.out.println(project);

        System.out.println("Saving current version to GitHub.");
        github.setSave(project.save());

        System.out.println("Updating project to Version 1.1");

        System.out.println("Writing poor code.");
        project.setVersion("Version 1.1.");
        System.out.println(project);

        System.out.println("Something went wrong.");

        System.out.println("Rolling back to version 1.0.");
        project.load(github.getSave());

        System.out.println("Project after rollback.");
        System.out.println(project);
    }
}
