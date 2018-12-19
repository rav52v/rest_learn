package Rest_Assured;

public class Application {

    public static void main(String[] args) {

        JsonPlaceholderService service = new JsonPlaceholderService();

        String userId = service.getResponse("/posts?id=1", "title");

        System.out.println(userId);


//        String postId = service.getMaxPostIdValForUserId(userId);
//        service.addCommentForPostId(postId);

    }



}