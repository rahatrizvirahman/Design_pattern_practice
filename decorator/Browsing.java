public class Browsing {
    public static void main(String[] args) {
        // Example 1: Creating a basic webpage with authentication feature
        System.out.println("Example 1: ");

        BasicWebpage basicWebpage = new BasicWebpage();

        AuthenticatedWebpageAdapter authenticatedWebpage = new AuthenticatedWebpageAdapter(basicWebpage);

        authenticatedWebpage.display();

        // Example 1: Creating a responsive webpage with authentication and authorization feature
        System.out.println("Example 1: ");
        
        AuthorizedWebpageAdapter authorizedWebpage = new AuthorizedWebpageAdapter(authenticatedWebpage);

        authorizedWebpage.display();
    }    
}
