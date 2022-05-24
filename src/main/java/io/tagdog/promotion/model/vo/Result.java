package io.tagdog.promotion.model.vo;

import io.tagdog.promotion.model.enums.ResultStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result {

	@Builder.Default
	protected Logger egovLogger = LoggerFactory.getLogger(Result.class);

	private ResultStatus status; // 일반적인 코드 분류 ( ex : SUCCESS, FAILED, .. )

	private Map<String, Object> data;

	public Result isSuccess() {
		this.status = ResultStatus.SUCCESS;
		return this;
	}

	public Result isFailed() {
		this.status = ResultStatus.FAILED;
		return this;
	}

}
