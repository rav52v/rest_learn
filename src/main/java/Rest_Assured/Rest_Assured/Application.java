package Rest_Assured.Rest_Assured;

public class Application {

    public static void main(String[] args) {

        JsonPlaceholderService service = new JsonPlaceholderService();
        String userId = service.getMaxUserIdVal();


        String postId = service.getMaxPostIdValForUserId(userId);
        service.addCommentForPostId(postId);

    }



}