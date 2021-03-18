package com.bayc.springcloud.security.exception.serialize;

import com.bayc.springcloud.core.model.response.Result;
import com.bayc.springcloud.security.exception.UserOAuthException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.springframework.http.HttpStatus;

import java.io.IOException;

public class UserOauthExceptionSerializer extends StdSerializer<UserOAuthException> {

    protected UserOauthExceptionSerializer() {
        super(UserOAuthException.class);
    }

    @Override
    public void serialize(UserOAuthException e, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeObject(Result.build((long) HttpStatus.UNAUTHORIZED.value(), e.getMessage(), null));
    }
}
