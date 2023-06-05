package com.company.Behavioral.Template;

public class WelcomePage extends WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}
