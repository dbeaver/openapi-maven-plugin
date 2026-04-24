package io.github.kbuntrock.resources.endpoint.issues.issue332;

import io.cloudbeaver.model.api.annotation.Operation;
import io.cloudbeaver.model.api.annotation.Parameter;
import io.cloudbeaver.model.api.annotation.enums.Explode;
import io.cloudbeaver.model.api.annotation.enums.ParameterIn;
import io.cloudbeaver.model.api.annotation.enums.ParameterStyle;
import io.cloudbeaver.model.api.annotation.media.ArraySchema;
import io.cloudbeaver.model.api.annotation.media.Schema;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/issue332")
public class OneParametersOutTwoParametersInNoMerge {

	@GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Find all", description = "Retrieving all")
	@Parameter(name = "first", example = "hello", description = "Description.", required = true, in = ParameterIn.QUERY, schema = @Schema(type = "string"), style = ParameterStyle.FORM, explode = Explode.FALSE, array = @ArraySchema(schema = @Schema(type = "string")))

	public ResponseEntity<List<String>> getAll(
		@Parameter(name = "sort") String sort,
		@Parameter(name = "count") int count) {

		return ResponseEntity.ok().build();

	}
}
