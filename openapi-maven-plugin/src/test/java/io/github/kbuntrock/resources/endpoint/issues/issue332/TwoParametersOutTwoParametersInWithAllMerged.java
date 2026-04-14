package io.github.kbuntrock.resources.endpoint.issues.issue332;

import org.jkiss.code.rest.annotation.Operation;
import org.jkiss.code.rest.annotation.Parameter;
import org.jkiss.code.rest.annotation.enums.ParameterIn;
import org.jkiss.code.rest.annotation.media.ArraySchema;
import org.jkiss.code.rest.annotation.media.Schema;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/issue332")
public class TwoParametersOutTwoParametersInWithAllMerged {

	@GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Find all", description = "Retrieving all")
	@Parameter(name = "sort", example = "ASC", description = "Description.", required = true, in = ParameterIn.QUERY, schema = @Schema(type = "string"), array = @ArraySchema(schema = @Schema(type = "string")))
	@Parameter(name = "count", example = "3", description = "Description.", required = true, in = ParameterIn.QUERY, schema = @Schema(type = "integer"), array = @ArraySchema(schema = @Schema(type = "integer")))

	public ResponseEntity<List<String>> getAll(
		@Parameter(name = "sort") String sort,
		@Parameter(name = "count") int count) {

		return ResponseEntity.ok().build();

	}
}