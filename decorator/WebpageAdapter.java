public abstract class WebpageAdapter implements Webpage{
    private Webpage webpage;

    public WebpageAdapter(Webpage webpage){
        this.webpage = webpage;
    }

    public void display(){
        this.webpage.display();
    }
}
