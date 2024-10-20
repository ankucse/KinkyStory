package com.kinky_story_generation.KinkyStoryGeneration.controller;


import com.kinky_story_generation.KinkyStoryGeneration.model.StoryRequest;
import com.kinky_story_generation.KinkyStoryGeneration.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// REST controller to handle API requests related to story generation
@RestController
@RequestMapping("/api/stories")  // Base URL for story-related endpoints
public class StoryController {

    @Autowired
    private StoryService storyService;  // Injecting the story service

    // Endpoint to generate a story based on user input
    @PostMapping("/generate")
    public String generateStory(@RequestBody StoryRequest request) {
        return storyService.createStory(request);  // Calling the service to create the story
    }
}

