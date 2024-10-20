package com.kinky_story_generation.KinkyStoryGeneration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Model class for capturing user input for story generation
@Data // Generates getters, setters, toString, equals, and hashCode methods
@NoArgsConstructor // Generates a no-args constructor
@AllArgsConstructor // Generates a constructor with all fields
public class StoryRequest {
    private String characterName1; // First character's name
    private String characterName2; // Second character's name
    private String scenario;        // Scenario for the story
    private String tone;            // Tone of the story (e.g., playful, intense)
    private String detailLevel;     // Level of detail for the story (e.g., light, detailed)
}

