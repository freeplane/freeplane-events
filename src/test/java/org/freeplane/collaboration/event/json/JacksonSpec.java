package org.freeplane.collaboration.event.json;

import static org.assertj.core.api.Assertions.assertThat;
import static org.freeplane.collaboration.event.json.Jackson.objectMapper;

import org.freeplane.collaboration.event.MapUpdated;
import org.freeplane.collaboration.event.messages.ImmutableMapId;
import org.freeplane.collaboration.event.messages.ImmutableUserId;
import org.freeplane.collaboration.event.content.core.CoreMediaType;
import org.freeplane.collaboration.event.content.core.CoreUpdated;
import org.freeplane.collaboration.event.messages.GenericUpdateBlockCompleted;
import org.freeplane.collaboration.event.messages.UpdateBlockCompleted;
import org.freeplane.collaboration.event.messages.UserId;
import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;

public class JacksonSpec {
	private static final ImmutableMapId MAP_ID = ImmutableMapId.of("mapId");

	private static final UserId USER_ID = ImmutableUserId.of("userId");
	
	@Test
	public void serializeAndDeserializeUpdateEvent() throws Exception
	{
		MapUpdated uut = createUpdateEvents();
		String json = objectMapper.writeValueAsString(uut);

		MapUpdated bean = objectMapper.readValue(json, MapUpdated.class);

		assertThat(bean).isEqualTo(uut);
	}


	@Test
	public void serializeAndDeserializeGenericUpdateEvent() throws Exception
	{
		MapUpdated uut = createUpdateEvents();
		String jsonString = objectMapper.writeValueAsString(uut);
		final JsonNode jsonTree = objectMapper.readTree(jsonString);
		final String genericJson = objectMapper.writeValueAsString(jsonTree);
		assertThat(genericJson).isEqualTo(jsonString);
	}
	
	private MapUpdated createUpdateEvents() {
		return CoreUpdated.builder()
				.nodeId("id")
				.mediaType(CoreMediaType.PLAIN_TEXT).content("text").build();
	}

	@Test
	public void serializeAndDeserializeUpdatesCompletedEvent() throws Exception
	{
		UpdateBlockCompleted uut = UpdateBlockCompleted.builder()
				.userId(USER_ID)
				.mapId(MAP_ID)
				.mapRevision(1000L)
				.addUpdateBlock(createUpdateEvents())
				.build();
		String json = objectMapper.writeValueAsString(uut);

		UpdateBlockCompleted bean = objectMapper.readValue(json, UpdateBlockCompleted.class);

		assertThat(bean).isEqualTo(uut);
	}


	@Test
	public void serializeAndDeserializeUpdatesCompletedEventAsServerObject() throws Exception
	{
		UpdateBlockCompleted uut = UpdateBlockCompleted.builder()
				.userId(USER_ID)
				.mapId(MAP_ID)
				.mapRevision(1000L)
				.addUpdateBlock(createUpdateEvents())
				.build();
		String json = objectMapper.writeValueAsString(uut);

		GenericUpdateBlockCompleted serverBean = objectMapper.readValue(json, GenericUpdateBlockCompleted.class);
		String serverJson = objectMapper.writeValueAsString(serverBean);
		UpdateBlockCompleted bean = objectMapper.readValue(serverJson, UpdateBlockCompleted.class);
		assertThat(bean).isEqualTo(uut);
	}
}
