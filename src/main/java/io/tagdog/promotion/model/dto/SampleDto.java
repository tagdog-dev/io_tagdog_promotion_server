package io.tagdog.promotion.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.tagdog.promotion.model.domain.Sample;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SampleDto extends Sample {

	private LocalDateTime startRegiDt;
	private LocalDateTime endRegiDt;

}