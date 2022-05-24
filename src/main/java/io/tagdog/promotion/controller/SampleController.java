package io.tagdog.promotion.controller;

import io.tagdog.promotion.model.dto.SampleDto;
import io.tagdog.promotion.model.vo.Result;
import io.tagdog.promotion.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping( value="/api/v1/sample" )
@RequiredArgsConstructor
@RestController
public class SampleController {

	private final SampleService sampleService;

	/**** CREATE ****/

	@PostMapping( value = "" )
	public Result putAgent( @RequestBody SampleDto sampleDto ) {
		return sampleService.insertMonoHandler( sampleDto );
	}

	/**** READ ****/

	@GetMapping( value = "" )
	public Result selectAll( @ModelAttribute SampleDto sampleDto ) {
		return sampleService.selectAllHandler( sampleDto );
	}

	@GetMapping( value = "/flux" )
	public Result selectFlux( @ModelAttribute SampleDto sampleDto ) {
		return sampleService.selectFluxHandler( sampleDto );
	}

	@GetMapping( value = "/count" )
	public Result count( @ModelAttribute SampleDto sampleDto ) {
		return sampleService.countHandler( sampleDto );
	}

	@GetMapping( value = "/mono" )
	public Result selectMono( @ModelAttribute SampleDto sampleDto ) {
		return sampleService.selectMonoHandler( sampleDto );
	}

	/**** UPDATE ****/

	@PatchMapping( value = "" )
	public Result updateMono( @RequestBody SampleDto sampleDto ) {
		return sampleService.updateMonoHandler( sampleDto );
	}

	/**** DELETE ****/

	@DeleteMapping(value = "")
	public Result deleteMono( @ModelAttribute SampleDto sampleDto ) {
		return sampleService.deleteMonoHandler( sampleDto );
	}

}
