package com.kinky_story_generation.KinkyStoryGeneration.serviceImpl;

import com.kinky_story_generation.KinkyStoryGeneration.model.StoryRequest;
import com.kinky_story_generation.KinkyStoryGeneration.service.StoryService;
import org.springframework.stereotype.Service;

@Service
public class StoryServiceImpl implements StoryService {

    @Override
    public String createStory(StoryRequest request) {
        // Basic template for story generation
        String template = "Once upon a time, {name1} and {name2} found themselves in {scenario}. "
                + "The atmosphere was {tone}, and things quickly escalated into a night filled with {details}.";

        // Replace placeholders with user input to create the story
        String story = template.replace("{name1}", request.getCharacterName1())
                .replace("{name2}", request.getCharacterName2())
                .replace("{scenario}", request.getScenario())
                .replace("{tone}", request.getTone())
                .replace("{details}", request.getDetailLevel());

        return story;  // Return the generated story
    }
}
