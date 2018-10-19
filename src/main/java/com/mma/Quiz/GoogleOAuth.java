/*package com.mma.Quiz;

import com.fasterxml.jackson.core.JsonFactory;

public class GoogleOAuth {
	public mail(){
	JsonFactory jsonFactory = new JacksonFactory();
	HttpTransport httpTransport = new NetHttpTransport();
	GoogleTokenResponse tokenResponse = new GoogleAuthorizationCodeTokenRequest(
	                     httpTransport, jsonFactory,
	                      Client ID and Secret ,
	                     code, "postmessage").execute();
	GoogleCredential credential = new GoogleCredential.Builder()
	                    .setJsonFactory(jsonFactory)
	                    .setTransport(httpTransport)
	                    .setClientSecrets( Client ID and Secret ).build()
	                    .setFromTokenResponse(tokenResponse);
	Oauth2 oauth2 = new Oauth2.Builder(httpTransport, jsonFactory, credential).setApplicationName("YourAppName").build();
	Tokeninfo tokenInfo = oauth2.tokeninfo().setAccessToken(credential.getAccessToken()).execute();
	return oauth2.userinfo().get().execute();
	}
}
*/