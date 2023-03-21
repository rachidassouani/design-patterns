package io.rachidassouani.composite.example2;

public class Reply extends Component {

    public Reply(String message) {
        super(message);
    }

    @Override
    public void print() {
        String tab = "";
        for (int i = 0; i < level; i++) {
            tab += "\t";
        }
        System.out.println(tab+message);
    }
}

