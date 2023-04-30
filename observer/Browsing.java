public class Browsing {
    public static void main(String[] args) {
        Blog blog = new Blog("Hi! Hello world.");

        Subscriber subscriber = new Subscriber(blog);

        blog.register(subscriber);

        blog.updateText("Hi! This is my second post.");        
    }
}
