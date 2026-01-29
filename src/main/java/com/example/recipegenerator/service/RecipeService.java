package com.example.recipegenerator.service;

import com.example.recipegenerator.model.RecipeRequest;
import com.example.recipegenerator.model.RecipeResponse;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.parser.BeanOutputParser;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RecipeService {

    private final ChatClient chatClient;

    public RecipeService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    public RecipeResponse generateRecipe(RecipeRequest request) {
        BeanOutputParser<RecipeResponse> parser = new BeanOutputParser<>(RecipeResponse.class);

        String promptString = """
                Generate a creative recipe using the following ingredients: {ingredients}.
                Cuisine type: {cuisine}.
                Dietary restrictions: {dietaryRestrictions}.

                {format}
                """;

        PromptTemplate template = new PromptTemplate(promptString);
        template.add("ingredients", request.ingredients());
        template.add("cuisine", request.cuisine() != null ? request.cuisine() : "Any");
        template.add("dietaryRestrictions",
                request.dietaryRestrictions() != null ? request.dietaryRestrictions() : "None");
        template.add("format", parser.getFormat());

        Prompt prompt = template.create();

        String responseContent = chatClient.prompt(prompt).call().content();

        return parser.parse(responseContent);
    }
}
