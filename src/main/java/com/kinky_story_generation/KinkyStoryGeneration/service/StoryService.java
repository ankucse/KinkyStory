package com.kinky_story_generation.KinkyStoryGeneration.service;


import com.kinky_story_generation.KinkyStoryGeneration.model.StoryRequest;

// Interface defining the contract for story generation service
public interface StoryService {
    String createStory(StoryRequest request);  // Method to create a story from user input
}

