package com.company.Behavioral.Iterator;

import java.util.Arrays;

public class JavaDeveloper implements Collection {
    private String name;
    private String[] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "JavaDeveloper{" +
                "name='" + name + '\'' +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < skills.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
