public class Blog extends Subject{
    // this class inherits the methods of the Subject and implement's some method according to its purpose

    private String blogText;

    public Blog( String blogText){
        this.blogText = blogText;
    }

    public void updateText(String text){
        this.blogText = text;

        this.notifyObservers();
    }

    public String getState(){
        return blogText;
    }
}
