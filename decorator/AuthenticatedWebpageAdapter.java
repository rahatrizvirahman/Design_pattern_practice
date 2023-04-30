public class AuthenticatedWebpageAdapter extends WebpageAdapter {
    public AuthenticatedWebpageAdapter(Webpage webpage){
        super(webpage);
    }   

    public void display(){
        super.display();

        System.out.println("Authentication is added to the website.");
    }
}
