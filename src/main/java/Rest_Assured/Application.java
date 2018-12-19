package Rest_Assured;

public class Application {

    public static void main(String[] args) {

        JsonPlaceholderService service = new JsonPlaceholderService();

        System.out.println(service.getMaxUserIdVal());

        String userId = service.getMaxUserIdVal();


        String postId = service.getMaxPostIdValForUserId(userId);
        service.addCommentForPostId(postId);

    }



}