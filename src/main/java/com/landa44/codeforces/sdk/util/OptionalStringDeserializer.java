package com.landa44.codeforces.sdk.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.util.Optional;

public class OptionalStringDeserializer extends StdDeserializer<Optional<String>> {
    public OptionalStringDeserializer() {
        super(Optional.class);
    }

    @Override
    public Optional<String> deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        JsonNode node = parser.getCodec().readTree(parser);
        if (node.isTextual()) {
            return Optional.of(node.asText());
        } else {
            return Optional.empty();
        }
    }
}

