package com.aws.hello.world.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.aws.hello.world.lambda.models.Request;
import com.aws.hello.world.lambda.models.Response;

public class HelloWorld implements RequestHandler<Request, Response> {


    @Override
    public Response handleRequest(Request request, Context context) {

        Response response = new Response();
        response.setMessage(String.format("Hello %s, Welcome to AWS Lambda World!", request.getName()));
        return response;
    }
}
