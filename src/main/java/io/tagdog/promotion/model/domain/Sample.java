package io.tagdog.promotion.model.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@NoArgsConstructor
public class Sample {

	private long idx;
	private String nm;
	private String cn;
	private long regiUserIdx;
	private LocalDateTime regiDt;
	private LocalDateTime updDt;
	private LocalDateTime delDt;

}