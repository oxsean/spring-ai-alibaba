package dev.ai.alibaba.samples.executor.std.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import dev.ai.alibaba.samples.executor.AgentAction;

import java.io.IOException;

class AgentActionDeserializer extends JsonDeserializer<AgentAction> {

	@Override
	public AgentAction deserialize(JsonParser parser, DeserializationContext ctx) throws IOException {
		JsonNode node = parser.getCodec().readTree(parser);
		return new AgentAction(node.get("log").asText());
	}

}
