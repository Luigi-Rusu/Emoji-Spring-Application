package com.example.emojiprovider.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.emojiprovider.dto.EmojiDto;
import com.example.emojiprovider.feign.EmojiProviderFeign;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/provider")
@RequiredArgsConstructor
public class EmojiProviderController {

	EmojiProviderFeign emojiProviderFeign;

	@GetMapping
	public List<EmojiDto> getEmojiFromApi(){
		return emojiProviderFeign.getEmojiFromApi();
	}

}
