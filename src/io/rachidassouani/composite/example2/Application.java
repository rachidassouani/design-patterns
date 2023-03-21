package io.rachidassouani.composite.example2;

public class Application {
    public static void main(String[] args) {

        Comment rachidComment = new Comment("Hello");
        Reply replayToRachid1 = new Reply("Hello Rachid");
        Reply replayToRachid2 = new Reply("Hi Rachid");
        Reply replayToRachid3 = new Reply("Ahléén Rachid");

        rachidComment.addChild(replayToRachid1);
        rachidComment.addChild(replayToRachid2);
        rachidComment.addChild(replayToRachid3);


        Comment comment1 = new Comment("Good morning from comment1");
        Reply reply1 = new Reply("Good morning to Comment1 from reply1");

        comment1.addChild(reply1);

        rachidComment.print();
        comment1.print();
    }
}
