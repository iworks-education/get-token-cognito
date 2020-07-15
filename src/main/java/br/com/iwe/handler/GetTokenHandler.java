package br.com.iwe.handler;

import java.io.IOException;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iwe.authorization.TokenGenerator;

import br.com.iwe.model.Authorization;
import br.com.iwe.model.HandlerRequest;
import br.com.iwe.model.HandlerResponse;

public class GetTokenHandler implements RequestHandler<HandlerRequest, HandlerResponse> {

	@Override
	public HandlerResponse handleRequest(final HandlerRequest request, final Context context) {
		Authorization authorization = null;
		try {
			authorization = new ObjectMapper().readValue(request.getBody(), Authorization.class);
		} catch (IOException e) {
			return HandlerResponse.builder().setStatusCode(400).setRawBody("There is a error in your Study!").build();
		}
		context.getLogger().log("Getting Token... ");
		return HandlerResponse.builder().setStatusCode(201).setRawBody(new TokenGenerator().getToken(authorization)).build();
	}
}