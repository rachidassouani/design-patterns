package io.rachidassouani.composite.example2;

import java.util.ArrayList;
import java.util.List;

public class Comment extends Component {
    private List<Component> components = new ArrayList<>();

    public Comment(String message) {
        super(message);
    }

    @Override
    public void print() {
        String tab = "";
        for (int i = 0; i < level; i++) {
            tab += "\t";
        }
        System.out.println(tab+message);
        for (Component c: components) {
            c.print();
        }
    }

    public Component addChild(Component component) {
        component.level += 1;
        components.add(component);
        return component;
    }
}
