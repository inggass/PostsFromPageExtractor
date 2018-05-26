import facebook4j.Comment;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.PagableList;
import facebook4j.Post;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

public class PostsFromPageExtractor {

/**
 * A simple Facebook4J client which
 * illustrates how to access group feeds / posts / comments.
 * 
 * @param args
 * @throws FacebookException 
 */
public static void main(String[] args) throws FacebookException {

    // Generate facebook instance.
    Facebook facebook = new FacebookFactory().getInstance();
    // Use default values for oauth app id.
    facebook.setOAuthAppId("2083403131981090", "3b4f0326de22be7baa97ff909710a66f");
    // Get an access token from: 
    // https://developers.facebook.com/tools/explorer
    // Copy and paste it below.
    String accessTokenString = "EAACEdEose0cBALhs0nU0cXL95YoI0zgJHAUBIQNKQUZCT2RCIZAAy8gHOYAuCZAsM8chBLDHenmRsBo3VrVlOTCoz1X0RQC4N0IEZBee86AA8ZBoCbKPxDTSAYXqBnq0dBhZCLQHCLsTSoWeKW0gq0UkerfMMPxvKFmSKfifkNovXRqzrGyhRUmneZBM5iKqlYaaRpNBCXZBXQZDZD";
    AccessToken at = new AccessToken(accessTokenString);
    // Set access token.
    facebook.setOAuthAccessToken(at);

  
            
            facebook.postStatusMessage("Hello World from Facebook4J.");
        }           
    
}