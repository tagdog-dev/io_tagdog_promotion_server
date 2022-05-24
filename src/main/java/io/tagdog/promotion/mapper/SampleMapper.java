package io.tagdog.promotion.mapper;

import io.tagdog.promotion.model.domain.Sample;
import io.tagdog.promotion.model.dto.SampleDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SampleMapper {

	/**** CREATE ****/

	public Sample insertMono( SampleDto sampleDto );

	/**** READ ****/

	public List<Sample> selectAll( SampleDto sampleDto );

	public List<Sample> selectFlux( SampleDto sampleDto );

	public Sample selectMono( SampleDto sampleDto );

	public int count( SampleDto sampleDto );

	/**** UPDATE ****/

	public Sample updateMono( SampleDto sampleDto );

	/**** DELETE ****/

	public Sample deleteMono( SampleDto sampleDto );

}
