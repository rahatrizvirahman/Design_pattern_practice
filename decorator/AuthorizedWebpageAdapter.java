public class AuthorizedWebpageAdapter extends WebpageAdapter {
    public AuthorizedWebpageAdapter(Webpage webpage){
        super(webpage);
    }   

    public void display(){
        super.display();

        System.out.println("Authorization is added to the website.");
    }
}
