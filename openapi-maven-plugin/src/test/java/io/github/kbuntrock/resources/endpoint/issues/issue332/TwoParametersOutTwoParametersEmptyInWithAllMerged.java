package io.github.kbuntrock.resources.endpoint.issues.issue332;

import io.cloudbeaver.model.api.annotation.Operation;
import io.cloudbeaver.model.api.annotation.Parameter;
import io.cloudbeaver.model.api.annotation.enums.ParameterIn;
import io.cloudbeaver.model.api.annotation.media.ArraySchema;
import io.cloudbeaver.model.api.annotation.media.Schema;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/issue332")
public class TwoParametersOutTwoParametersEmptyInWithAllMerged {

	@GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Find all", description = "Retrieving all")
	@Parameter(name = "sort", example = "example3", description = "", required = false, in = ParameterIn.HEADER, schema = @Schema(type = "string", example = "example4", description = "fourth"), array = @ArraySchema(schema = @Schema(type = "string")))
	@Parameter(name = "count", example = "3", description = "Description.", required = true, in = ParameterIn.QUERY, schema = @Schema(type = "integer", example = "4"), array = @ArraySchema(schema = @Schema(type = "integer")))

	public ResponseEntity<List<String>> getAll(
		@Parameter(description = "", example = "example1", required = true, in = ParameterIn.DEFAULT, schema = @Schema(description = "", example = "example2")) String sort,
		@Parameter int count) {

		return ResponseEntity.ok().build();

	}
}
