# AI-Powered Smart Recipe Generator
Technologies: Java, Spring Boot 3.3, Spring AI, OpenAI API, REST APIs, HTML5/CSS3 (Glassmorphism UI), Git.

Description: Designed and developed a full-stack, AI-driven application that generates personalized usage-based cooking recipes. The system leverages Generative AI to convert unstructured user ingredients into structured, culinary instructions, solving the "what to cook" dilemma with a modern, user-centric interface.

Key Highlights:

Spring AI Integration: Implemented Spring AI with OpenAI’s GPT models to orchestrate complex prompt engineering logic, utilizing Prompt Templates to dynamically inject user constraints (ingredients, dietary needs) into context-aware queries.
Structured Data Extraction: Engineered a robust parsing layer using BeanOutputParser to coerce raw LLM text outputs into strictly typed Java Records (
RecipeResponse
), ensuring reliable JSON API responses for the frontend.
Modern Interactive UI: Built a responsive, aesthetically pleasing frontend using Glassmorphism design principles, CSS3 animations, and vanilla JavaScript to provide real-time, asynchronous feedback without page reloads.
Scalable Architecture: Designed a stateless RESTful API architecture following standard Controller-Service-Model patterns, maximizing maintainability and allowing for easy horizontal scaling.
Prompt Engineering: Optimized Large Language Model (LLM) performance by fine-tuning temperature settings and context instructions to balance recipe creativity with culinary accuracy.
Key Achievements:

Reduced decision fatigue for users by providing instant, workable recipes from leftover ingredients.
Successfully adopted leading-edge Spring AI framework features (Client API) ahead of general-purpose adoption.
