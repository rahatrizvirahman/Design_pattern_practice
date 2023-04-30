public class Subscriber implements Observer {
    private Blog blog; 

    public Subscriber(Blog blog){
        this.blog = blog;
    }

    public void update(){
        String blogText = blog.getState();

        System.out.println("Updated blog : "+blogText);
    }
}
