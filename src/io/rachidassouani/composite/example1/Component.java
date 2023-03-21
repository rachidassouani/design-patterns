package io.rachidassouani.composite.example1;
public abstract class Component {

    protected String name;
    protected int level;
    public Component(String name) {
        this.name = name;
    }

    public abstract void print();

    public String  getTab() {
        String tab = "";
        for (int i = 0; i < level; i++) {
            tab += "\t";
        }
        return tab;
    }
}
