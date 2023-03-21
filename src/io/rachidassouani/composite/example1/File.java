package io.rachidassouani.composite.example1;

public class File extends Component {
    public File(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(getTab()+"File " + name);
    }
}
